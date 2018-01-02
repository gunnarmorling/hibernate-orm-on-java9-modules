module com.example {
    requires java.persistence;
    requires org.hibernate.orm;
    opens com.example to org.hibernate.orm;
}
