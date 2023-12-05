import java.util.HashMap;
import java.util.Map;

public class MyListener extends sinonimoScriptBaseListener{
    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    private String id = null;
    private String tipo = null;

    private String retornaTipo(String s){
        if(s.equals("gg") || s.equals("ff")) 
            return "loob";

        if(s.contains("\"")) 
            return "risca";

        if(s.contains(",")) 
            return "exato";

        return "cheio";
    }

    private boolean declarado(String id){
        if(!tabelaSimbolos.containsKey(id)){
            System.out.println("Variavel:" + id  + " não declarada");
            return false;
        }
        return true;
    }
  
    @Override
    public void exitNAtribuicao(sinonimoScriptParser.NAtribuicaoContext ctx){
        if(ctx.STRING() != null)
            tipo = "risca";
        if(ctx.expl() != null)
            tipo = "loob";
        if(ctx.dec() != null){
            if(!tabelaSimbolos.get(id).equals(tipo))
                System.out.println("Tipo incompativel " + id);
            }
        else if(ctx.ID() != null){
            String tipoAuxiliar = tabelaSimbolos.get(ctx.ID().getText());    
            if(tipoAuxiliar != null && !tipoAuxiliar.equals(tipo))
                System.out.println("Tipo incompativel " + ctx.ID().getText());
        }    
        tipo = null;
    }

    @Override
    public void enterNExpressaoLogica(sinonimoScriptParser.NExpressaoLogicaContext ctx){
        if(ctx.ID(1) != null){
            if(declarado(ctx.ID(1).getText())){
                String tipo1 = tabelaSimbolos.get(ctx.ID(1).getText());
                if(tipo1.equals("exato") || tipo1.equals("cheio")){
                    if(ctx.ID(0) != null){
                        if(declarado(ctx.ID(0).getText())){
                            String tipo0 = tabelaSimbolos.get(ctx.ID(0).getText());
                            if(!(tipo0.equals("exato") || tipo0.equals("cheio")))
                                System.out.println("Tipo incompativel");
                        }
                    }
                }
                else
                    System.out.println("Tipo incompativel");
            }
        }
        else if(ctx.NUM(1) != null || ctx.NUM(0) != null){
            if(ctx.ID(0) != null){
                if(declarado(ctx.ID(0).getText())){
                    String tipo0 = tabelaSimbolos.get(ctx.ID(0).getText());
                    if(!(tipo0.equals("exato") || tipo0.equals("cheio")))
                        System.out.println("Tipo incompativel");
                }
            }
        }
        else if(ctx.ID(0) != null){
            if(declarado(ctx.ID(0).getText())){
                if(!tabelaSimbolos.get(ctx.ID(0).getText()).equals("loob"))
                    System.out.println("Tipo Incompativel");
            }
        }
    }

    @Override
    public void enterNExpressao(sinonimoScriptParser.NExpressaoContext ctx){
        if(ctx.ID() != null){
            if(declarado(ctx.ID().getText())){
                if(tipo != null){
                    if(!tabelaSimbolos.get(ctx.ID().getText()).equals(tipo))
                    System.out.println("Tipo incompativel " + ctx.ID().getText());
                }
                else{
                    tipo = tabelaSimbolos.get(ctx.ID().getText());
                }
            }
        }
        else if(ctx.NUM() != null){
            if(tipo != null){
                if(!retornaTipo(ctx.NUM().getText()).equals(tipo))
                    System.out.println("Tipo incompativel " + ctx.NUM().getText());
            }
            else{
                tipo = retornaTipo(ctx.NUM().getText());
            }
        }
    }
    
    @Override
    public void enterNDeclaracao(sinonimoScriptParser.NDeclaracaoContext ctx){
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        this.id = id;
        if(tabelaSimbolos.containsKey(id)){
            System.out.println("Declaracao duplicada da variavel " + id);
        }
        else{
            tabelaSimbolos.put(id, tipo);
        }
    }

    public Map<String,String> getTabelaSimbolos() {return tabelaSimbolos;}
}
