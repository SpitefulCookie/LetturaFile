import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Calendar;

class Main{

    public static void main(String[] args) {

        int annoCorrente = Calendar.getInstance().get(Calendar.YEAR);
                
        try (BufferedReader br = new BufferedReader(new FileReader("Persone.dbout"))){           

            String fLine = br.readLine();

            List<Persona> persone = new LinkedList<Persona>();

            while(fLine != null){

                String[] dati = fLine.split("\\|"); 
            
                Persona p = new Persona(dati[0], dati[1],dati[2],dati[3]);

                persone.add(p);

                fLine = br.readLine();

            }

            for(Persona g : persone){
                    
                System.out.println(g.toString());

                System.out.println(g.getEta(annoCorrente));

                System.out.println();

            }

       } catch (IOException e){

            System.out.println("File not found!");

       } 

    }

}
