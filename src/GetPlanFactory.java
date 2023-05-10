class GetPlanFactory {

    //use the getPlan method to get object of type Plan
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        else if(planType.equalsIgnoreCase("DOMESTICPLAN") || planType.equalsIgnoreCase("DOMESTIC PLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN") || planType.equalsIgnoreCase("COMMERCIAL PLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN") || planType.equalsIgnoreCase("INSTITUTIONAL PLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
