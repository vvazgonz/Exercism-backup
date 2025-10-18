class Acronym {

    private String acro;
	
	public Acronym(String phrase) {
		String[] palabras = phrase.split("[\\-_\\s]+"); // Dividir según los "-" y los "_", y luego los espacios (\\s)
		String Acronimo = "";
		for (int i = 0; i< palabras.length; i++) {
			Acronimo += palabras[i].charAt(0);
		}
		this.acro = Acronimo.toUpperCase().replace("-", "");
	}
        

    public String get() {
       return this.acro;
    }

}
