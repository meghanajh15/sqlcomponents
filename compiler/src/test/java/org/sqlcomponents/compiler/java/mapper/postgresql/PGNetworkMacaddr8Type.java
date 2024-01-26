package org.sqlcomponents.compiler.java.mapper.postgresql;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static  org.sqlcomponents.compiler.java.util.CompilerTestUtil.getDataType;
public class PGNetworkMacaddr8Type {
    public PGNetworkMacaddr8Type() throws IOException, SQLException {
        super();
    }

    @Test
    void testDataType() throws Exception {

        assertEquals(InetAddress.class, Class.forName(getDataType("a_macaddr8")), "Type Mismatch");


    }
}