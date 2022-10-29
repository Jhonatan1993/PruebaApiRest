package co.com.company.certification.pruebaApiRest.models;

public class ModelCreateUserRest {

    private String name;
    private String job;

    public ModelCreateUserRest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getJob() {return job;}
    public void setJob(String job) {this.job = job;}


    /*public static List<ModelCreateUserRest> setData(DataTable dataTable){
        List<ModelCreateUserRest> datos = new ArrayList<>();
        List<Map<String, String>> mapInfo =  dataTable.asMaps();
        for (Map<String, String> map:mapInfo){
            datos.add(new ObjectMapper().convertValue(map, ModelCreateUserRest.class));
        }
        return datos;
    }*/

    @Override
    public String toString(){
        return "{" +
                "\"name\":" + '\"' + name + '\"' +
                ", \"job\":" + '\"' + job + '\"' +
                '}';
    }

}
