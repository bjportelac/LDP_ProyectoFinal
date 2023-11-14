import java.util.List;

public class GoControl {
    
    public String IndentationController(List<String> code) {
        StringBuilder goCode = new StringBuilder();
        int indentation = 0;

        if(code!= null && !code.isEmpty()){
            for(String fragment: code){
                if(fragment.equalsIgnoreCase("{")){
                    indentation++;
                    StringBuilder s = new StringBuilder();
                    s.append(fragment);
                    s.append("\n");
                    for(int i = 0; i < indentation; i++){
                        s.append("\t");
                    }
                    goCode.append(s);
                }else{
                    goCode.append(fragment);
                }

            }
        }
        return goCode.toString();
    }
}
