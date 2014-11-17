package com.freedom.messagebus.common;

/**
 * User: yanghua
 * Date: 6/29/14
 * Time: 9:11 PM
 * Copyright (c) 2013 yanghua. All rights reserved.
 */
public class CONSTS {

    @Deprecated
    public static final String DEFAULT_QUEUE_NAME = "queue";

    @Deprecated
    public static final String ROUTER_NAME_PATTERN = "%s_ROUTER_%s";

    @Deprecated
    public static final String TRANSFER_CENTER_NAME_PATTERN = "%s_TRANSFER_CENTER_%s";


    public static final String DEFAULT_AUTH_QUEUE_NAME = "queue.proxy.message.sys.auth";

    public static final String DEFAULT_AUTH_ROUTING_KEY_NAME = "routingkey.proxy.message.sys.auth";

    public static final long AUTH_DEFAULT_TIMEOUT = 10000l;

    public static final String CONFIG_BASE_DIR = "/var/messagebus/";

    public static final String TOPOLOGY_FILE_NAME = "topology.xml";

    public static final String PATH_FILE_NAME = "path.xml";

    public static final Byte[] EMPTY_BYTE_ARRAY = new Byte[0];

    public static final byte[] EMPTY_PRIMITIVE_BYTE_ARRAY = new byte[0];

    public static int DEFAULT_AUTH_REQUEST_TIMEOUT_SECONDS = 30;


    public static String EXPORTED_TABLE_CMD_FORMAT = "mysqldump -h%s -u%s -p%s -X --hex-blob messagebus_sys_db %s> ";

    public static final String EXPORTED_NODE_FILE_PATH               = "/var/tmp/messagebus_router_for_zookeeper.xml";
    public static final String EXPORTED_CONFIG_FILE_PATH             = "/var/tmp/messagebus_config_for_zookeeper.xml";
    public static final String EXPORTED_SEND_PERMISSION_FILE_PATH    = "/var/tmp/messagebus_sendpermission_for_zookeeper.xml";
    public static final String EXPORTED_RECEIVE_PERMISSION_FILE_PATH = "/var/tmp/messagebus_receivepermission_for_zookeeper.xml";

    public static final String ZOOKEEPER_ROOT_PATH_FOR_ROUTER = "/router";
    public static final String ZOOKEEPER_ROOT_PATH_FOR_CONFIG = "/config";
    public static final String ZOOKEEPER_ROOT_PATH_FOR_EVENT  = "/event";
    public static final String ZOOKEEPER_ROOT_PATH_FOR_AUTH   = "/auth";

    //second path
    public static final String ZOOKEEPER_PATH_FOR_AUTH_SEND_PERMISSION    = "/auth/sendpermission";
    public static final String ZOOKEEPER_PATH_FOR_AUTH_RECEIVE_PERMISSION = "/auth/receivepermission";

    public static final String MESSAGEBUS_SERVER_EVENT_STARTED = "started";
    public static final String MESSAGEBUS_SERVER_EVENT_STOPPED = "stopped";

    public static final String DB_TABLE_OF_NODE               = "NODE";
    public static final String DB_TABLE_OF_CONFIG             = "CONFIG";
    public static final String DB_TABLE_OF_SEND_PERMISSION    = "SEND_PERMISSION";
    public static final String DB_TABLE_OF_RECEIVE_PERMISSION = "RECEIVE_PERMISSION";

    public static final String PROXY_EXCHANGE_NAME      = "exchange.proxy";
    public static       String DEFAULT_FILE_QUEUE_NAME  = "queue.proxy.log.file";
    public static       String PUBSUB_ROUTING_KEY       = "routingkey.proxy.message.pubsub.#";
    public static       String PUBSUB_QUEUE_NAME_SUFFIX = "-pubsub";

    public static long DEFAULT_DATACENTER_ID_FOR_UUID = 00001L;

}