String properNounCorrection(String noun) {
    noun = noun.toLowerCase();
    noun = noun.substring(0,1).toUpperCase()+noun.substring(1);
    return noun;
}
