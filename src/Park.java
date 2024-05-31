
import java.util.ArrayList;
import java.util.List;

    public class Park {

        private List<Attraction> attractions = new ArrayList<>();

        public void addAttraction(String typeOfAttraction, String attractionOpeningHours, double cost) {
            attractions.add(new Attraction(typeOfAttraction, attractionOpeningHours, cost));
        }

        @Override
        public String toString() {
            return "Attractions: " + attractions + ".";
        }

        class Attraction {
            private String typeOfAttraction;
            private String attractionOpeningHours;
            private double cost;

            public Attraction(String typeOfAttraction, String attractionOpeningHours, double cost) {
                this.typeOfAttraction = typeOfAttraction;
                this.attractionOpeningHours = attractionOpeningHours;
                this.cost = cost;
            }

            @Override
            public String toString() {
                return "\n|Name of attraction: " + typeOfAttraction + " |cost: " + cost +
                        " |opening hours: " + attractionOpeningHours;
            }
        }
    }

