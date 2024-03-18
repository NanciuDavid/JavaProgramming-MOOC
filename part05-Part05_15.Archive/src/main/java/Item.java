public class Item {
    private String identifier;
    private String name;


    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }

        if(!(compared instanceof Item)) {
            return false;
        }

        Item comparedArchive = (Item) compared;

        if(this.identifier.equals(comparedArchive.identifier) && this.name.equals(comparedArchive.name)) {
            return true;
        }
        
        return false;
    }

    
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.identifier+": "+this.name;
    }
}


