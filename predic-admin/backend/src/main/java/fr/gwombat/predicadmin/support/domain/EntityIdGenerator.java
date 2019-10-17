package fr.gwombat.predicadmin.support.domain;


import java.util.UUID;

final class EntityIdGenerator {

    private EntityIdGenerator() {

    }

    /**
     * Generates a random unique string-based id
     *
     * @return the generated id.
     */
    static String generateId() {
        return UUID.randomUUID().toString().replace('-', '\u0000').toUpperCase();
    }
}
