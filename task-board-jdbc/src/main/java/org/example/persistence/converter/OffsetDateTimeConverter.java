package org.example.persistence.converter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Objects;

import static java.util.Objects.nonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OffsetDateTimeConverter {

    public static OffsetDateTime toOffsetDateTime(final Timestamp value){
        return nonNull(value) ? OffsetDateTime.ofInstant(value.toInstant(), ZoneOffset.UTC) : null;
    }

    public static Timestamp toTimestamp(final OffsetDateTime value){
        return nonNull(value) ? Timestamp.valueOf(value.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime()) : null;
    }

}
