class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand
            .replace("A", "U")
            .replace("T", "A")
            .replace("C", "E")
            .replace("G", "C")
            .replace("E", "G");
    }
}
