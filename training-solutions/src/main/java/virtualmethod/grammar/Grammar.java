package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {

        //Verb
        Verb verb = new PhrasalVerb("alkot", "meg");
        System.out.println(verb.getWord());

        verb = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(verb.getWord());

        //Preposition

        Preposition preposition = new PhrasalVerb("alkot", "meg");
        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());

        preposition = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());

        //Phrasal

        PhrasalVerb phrasalVerb = new PhrasalVerb("alkot", "meg");
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWholeWord());

        phrasalVerb = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWholeWord());


        //Suffix
        Suffix suffix = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(suffix.getSuffix());


        //PhrasalSuffix

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
