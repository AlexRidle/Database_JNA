package com.researchwork;

import com.sun.jna.Callback;
import com.sun.jna.Native;

public class Database_JNA implements JavaDatabaseAPI {

    // JNA reverse callback code
    //
    public static class JavaDatabaseAPI_C {
        interface reg_GetElementByIdTableColumn_callback extends Callback {
            String invoke(String s, String s1, String s2);
        }

        interface reg_getAllUsersFromUsersTable_callback extends Callback {
            String[] invoke();
        }

        interface reg_getUserInfoFromTablesByID_callback extends Callback {
            String[] invoke(String s);
        }

        interface reg_setupDatabase_callback extends Callback {
            void invoke();
        }

        interface reg_addToUserTable_callback extends Callback {
            void invoke(String s, String s1, String s2, String s3, String s4);
        }

        interface reg_addPicturesOfUserIDIntoResearchTable_callback extends Callback {
            void invoke(String s, String s1, String s2, String s3, String s4, String s5);
        }

        interface reg_RemoveAllInfoOfID_callback extends Callback {
            void invoke(String s);
        }

        public static native String reg_GetElementByIdTableColumn_cb(reg_GetElementByIdTableColumn_callback func);
        public static native String[] reg_getAllUsersFromUsersTable_cb(reg_getAllUsersFromUsersTable_callback func);
        public static native String[] reg_getUserInfoFromTablesByID_cb(reg_getUserInfoFromTablesByID_callback func);
        public static native void reg_setupDatabase_cb(reg_setupDatabase_callback func);
        public static native void reg_addToUserTable_cb(reg_addToUserTable_callback func);
        public static native void reg_addPicturesOfUserIDIntoResearchTable_cb(reg_addPicturesOfUserIDIntoResearchTable_callback func);
        public static native void reg_RemoveAllInfoOfID_cb(reg_RemoveAllInfoOfID_callback func);

        static {
            Native.register("Database_C");
        }

    }
    public static JavaDatabaseAPI_C.reg_GetElementByIdTableColumn_callback reg_GetElementByIdTableColumn_func =
            new JavaDatabaseAPI_C.reg_GetElementByIdTableColumn_callback() {
                public String invoke(String s, String s1, String s2) {
                    return INSTANCE.GetElementByIdTableColumn(s, s1, s2);
                }
            };

    public static JavaDatabaseAPI_C.reg_getAllUsersFromUsersTable_callback reg_getAllUsersFromUsersTable_func =
            new JavaDatabaseAPI_C.reg_getAllUsersFromUsersTable_callback() {
                public String[] invoke() {
                    return INSTANCE.getAllUsersFromUsersTable();
                }
            };

    public static JavaDatabaseAPI_C.reg_getUserInfoFromTablesByID_callback reg_getUserInfoFromTablesByID_func =
            new JavaDatabaseAPI_C.reg_getUserInfoFromTablesByID_callback() {
                public String[] invoke(String s) {
                    return INSTANCE.getUserInfoFromTablesByID(s);
                }
            };

    public static JavaDatabaseAPI_C.reg_setupDatabase_callback reg_setupDatabase_func =
            new JavaDatabaseAPI_C.reg_setupDatabase_callback() {
                public void invoke() {
                    INSTANCE.setupDatabase();
                }
            };

    public static JavaDatabaseAPI_C.reg_addToUserTable_callback reg_addToUserTable_func =
            new JavaDatabaseAPI_C.reg_addToUserTable_callback() {
                public void invoke(String s, String s1, String s2, String s3, String s4) {
                    INSTANCE.addToUserTable(s, s1, s2, s3, s4);
                }
            };

    public static JavaDatabaseAPI_C.reg_addPicturesOfUserIDIntoResearchTable_callback reg_addPicturesOfUserIDIntoResearchTable_func =
            new JavaDatabaseAPI_C.reg_addPicturesOfUserIDIntoResearchTable_callback() {
                public void invoke(String s, String s1, String s2, String s3, String s4, String s5) {
                    INSTANCE.addPicturesOfUserIDIntoResearchTable(s, s1, s2, s3, s4, s5);
                }
            };

    public static JavaDatabaseAPI_C.reg_RemoveAllInfoOfID_callback reg_RemoveAllInfoOfID_func =
            new JavaDatabaseAPI_C.reg_RemoveAllInfoOfID_callback() {
                public void invoke(String s) {
                    INSTANCE.RemoveAllInfoOfID(s);
                }
            };

    /////////////////////////////////////////////////////////////////////////

    private static Database_JNA INSTANCE = new Database_JNA();
    public static JavaDatabaseAPI getAPI() { return INSTANCE; }

    /////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        System.out.println("in main()");
    }

    private Database_JNA() {
        // Register callbacks with JNA C library
        JavaDatabaseAPI_C.reg_GetElementByIdTableColumn_cb(reg_GetElementByIdTableColumn_func);
        JavaDatabaseAPI_C.reg_getAllUsersFromUsersTable_cb(reg_getAllUsersFromUsersTable_func);
        JavaDatabaseAPI_C.reg_getUserInfoFromTablesByID_cb(reg_getUserInfoFromTablesByID_func);
        JavaDatabaseAPI_C.reg_setupDatabase_cb(reg_setupDatabase_func);
        JavaDatabaseAPI_C.reg_addToUserTable_cb(reg_addToUserTable_func);
        JavaDatabaseAPI_C.reg_addPicturesOfUserIDIntoResearchTable_cb(reg_addPicturesOfUserIDIntoResearchTable_func);
        JavaDatabaseAPI_C.reg_RemoveAllInfoOfID_cb(reg_RemoveAllInfoOfID_func);
        System.out.println("JavaDatabaseAPI_C(): callbacks registered, " + this);
    }

    /////////////////////////////////////////////////////////////////////////

    private JavaDatabaseAPI javaDatabaseAPI =
            Database.getAPI();

    @Override
    public String GetElementByIdTableColumn(String s, String s1, String s2) {
        return javaDatabaseAPI.GetElementByIdTableColumn(s, s1, s2);
    }

    @Override
    public String[] getAllUsersFromUsersTable() {
        return javaDatabaseAPI.getAllUsersFromUsersTable();
    }

    @Override
    public String[] getUserInfoFromTablesByID(String s) {
        return javaDatabaseAPI.getUserInfoFromTablesByID(s);
    }

    @Override
    public void setupDatabase() {
        javaDatabaseAPI.setupDatabase();
    }

    @Override
    public void addToUserTable(String s, String s1, String s2, String s3, String s4) {
        javaDatabaseAPI.addToUserTable(s, s1, s2, s3, s4);
    }

    @Override
    public void addPicturesOfUserIDIntoResearchTable(String s, String s1, String s2, String s3, String s4, String s5) {
        javaDatabaseAPI.addPicturesOfUserIDIntoResearchTable(s, s1, s2, s3, s4, s5);
    }

    @Override
    public void RemoveAllInfoOfID(String s) {
        javaDatabaseAPI.RemoveAllInfoOfID(s);
    }
}
