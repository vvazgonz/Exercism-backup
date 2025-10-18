class Badge {
    public String print(Integer id, String name, String department) {

        boolean identifier = (id != null);
        boolean dep = (department != null);

        String ide = (identifier) ? ("[" + Integer.toString(id) + "] - ") : "";
        String de = (dep) ? (" - " + department.toUpperCase()) : " - OWNER";

        return ide + name + de;
            
    }
}