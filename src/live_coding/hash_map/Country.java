package live_coding.hash_map;

public class Country {

    public String code;
    public String name;
    public String capitalName;

    public Country(String code, String name, String capitalName) {
        this.code = code;
        this.name = name;
        this.capitalName = capitalName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capitalName='" + capitalName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (code != null ? !code.equals(country.code) : country.code != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        return capitalName != null ? capitalName.equals(country.capitalName) : country.capitalName == null;

    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (capitalName != null ? capitalName.hashCode() : 0);
        return result;
    }
}
