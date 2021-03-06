/*
 * This file is generated by jOOQ.
 */
package ru.kazemirov.webEmailApplication.jooq.sample.model.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.kazemirov.webEmailApplication.jooq.sample.model.tables.Email;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmailRecord extends UpdatableRecordImpl<EmailRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>db_email.email.id</code>.
     */
    public EmailRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_email.email.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_email.email.email</code>.
     */
    public EmailRecord setEmail(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_email.email.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Email.EMAIL.ID;
    }

    @Override
    public Field<String> field2() {
        return Email.EMAIL.EMAIL_;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEmail();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEmail();
    }

    @Override
    public EmailRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public EmailRecord value2(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public EmailRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailRecord
     */
    public EmailRecord() {
        super(Email.EMAIL);
    }

    /**
     * Create a detached, initialised EmailRecord
     */
    public EmailRecord(Integer id, String email) {
        super(Email.EMAIL);

        setId(id);
        setEmail(email);
    }
}
