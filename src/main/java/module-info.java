module com.example {
    requires java.persistence;
    requires hibernate.core;
    opens com.example to hibernate.core;
}
