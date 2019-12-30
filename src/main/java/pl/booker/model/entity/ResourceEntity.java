package pl.booker.model.entity;

import javax.persistence.*;

import ch.qos.logback.core.util.FileSize;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.util.unit.DataUnit;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class ResourceEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    private String filename;
    private String fileType;

    @DataSizeUnit(value = DataUnit.BYTES)
    private FileSize fileSize;

    @ManyToOne
    private PublicationEntity publicationEntities;

    private float rating;

    @Lob
    private byte[] data;
}
