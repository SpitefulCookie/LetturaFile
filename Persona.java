class Persona{

    private String codFiscale;
    private String nome;
    private String cognome;
    private int annoNascita;
    
    public Persona(String cf, String cognome, String nome, String annoDiNascita){

        this.codFiscale = cf;

        this.cognome = cognome;

        this.nome = nome;

        this.annoNascita = Integer.parseInt(annoDiNascita);

    }

    public String getEta(int annoCorrente){

        return "Età: " + (annoCorrente - this.annoNascita);

    }

    public String toString(){ //Non necessario ma inserito per completezza

        return "Cognome: " + this.cognome + "\t\tNome: " + this.nome + "\nCF: " + this.codFiscale + "\nAnno di nascita: " + this.annoNascita;

    }

}