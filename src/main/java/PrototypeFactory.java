package src.main.java;

class PrototypeFactory
{
    public static class ModelType
    {
        public static final String MOVIE = "movie";
    }
    private static java.util.Map<String , Cloneable> prototypes = new java.util.HashMap<String , Cloneable>();

    static
    {
        prototypes.put(ModelType.MOVIE, new Movie("My Movie"));
    }

    public static Cloneable getInstance(final String s) throws CloneNotSupportedException {
        return ((Movie) prototypes.get(s)).clone();
    }
}