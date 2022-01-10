package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        
        //Plan
        Plan plan = new SketchPlan(135, "Hajdú 27 társasház");
        System.out.println(plan.getPagesOfDocumentation());

        plan = new PermitPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.");
        System.out.println(plan.getPagesOfDocumentation());

        plan= new ConstructionPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.", 100);
        System.out.println(plan.getPagesOfDocumentation());

        
        //Sketch
        
        
        SketchPlan sketchPlan = new SketchPlan(135, "Hajdú 27 társasház");
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan.getPagesOfDocumentation());

        sketchPlan = new PermitPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.");
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan.getPagesOfDocumentation());

        sketchPlan = new ConstructionPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.", 100);
        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan.getPagesOfDocumentation());

        //header
        
        Header header = new PermitPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.");
        System.out.println(header.getNameOfClient());
        System.out.println(header.getAddressOfBuilding());

        header = new ConstructionPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.", 100);
        System.out.println(header.getNameOfClient());
        System.out.println(header.getAddressOfBuilding());

        //Permit
        
        PermitPlan permitPlan = new PermitPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.");
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getAddressOfBuilding());

        permitPlan = new ConstructionPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.", 100);
        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getNameOfClient());
        System.out.println(permitPlan.getAddressOfBuilding());

        
        //Contruction
        
        ConstructionPlan constructionPlan = new ConstructionPlan(135, "Hajdú 27 társasház", "Hungaro General Kft.", "1135 Budapest, Hajdú utca 27.", 100);
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
    }
}
