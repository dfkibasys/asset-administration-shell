package de.dfki.cos.basys.aas.knowledgegraph.util;

import org.neo4j.driver.Value;
import org.neo4j.driver.internal.value.DateTimeValue;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public class GregorianCalendarConverter implements GenericConverter {
    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        Set<ConvertiblePair> convertiblePairs = new HashSet<>();
        convertiblePairs.add(new ConvertiblePair(XMLGregorianCalendar.class, Value.class));
        convertiblePairs.add(new ConvertiblePair(Value.class, XMLGregorianCalendar.class));
        return convertiblePairs;
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        if (XMLGregorianCalendar.class.isAssignableFrom(sourceType.getType())) {
            // convert to Neo4j Driver Value
            return convertToNeo4jValue((XMLGregorianCalendar) source);
        } else {
            // convert to MyCustomType
            return convertToXMLGregorianCalendar((Value) source);
        }
    }

    private XMLGregorianCalendar convertToXMLGregorianCalendar(Value source) {
//        LocalDateTime ldt = source.asLocalDateTime();
//        ZoneId zoneId = ZoneId.of("Europe/Paris");
//        ZonedDateTime zdt = ldt.atZone(zoneId);
        ZonedDateTime zdt = source.asZonedDateTime();
        GregorianCalendar gc = GregorianCalendar.from(zdt);
        try {
             return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Value convertToNeo4jValue(XMLGregorianCalendar source) {
        GregorianCalendar calendar = source.toGregorianCalendar();
        ZonedDateTime zdt = calendar.toZonedDateTime();
        Value value = new DateTimeValue(zdt);
        return value;
    }
}
