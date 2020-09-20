package nl.leon.week0.footballmanager;

public class Squad {

    private String name;

    private Squad() { }

    public static class Builder {

        private String name;

        public Builder(String name) {
            this.name = name;
        }

        public Squad build(){
            Squad squad = new Squad();
            squad.name = name;
            return squad;
        }
    }
}
