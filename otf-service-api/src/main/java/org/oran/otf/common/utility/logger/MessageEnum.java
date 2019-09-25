/*-
 * ============LICENSE_START=======================================================
 * ONAP - SO
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.oran.otf.common.utility.logger;


public enum MessageEnum {
  // Api Handler Messages
  APIH_REQUEST_NULL, APIH_QUERY_FOUND, APIH_QUERY_NOT_FOUND, APIH_QUERY_PARAM_WRONG, APIH_DB_ACCESS_EXC, APIH_DB_ACCESS_EXC_REASON, APIH_VALIDATION_ERROR, APIH_REQUEST_VALIDATION_ERROR, APIH_SERVICE_VALIDATION_ERROR, APIH_GENERAL_EXCEPTION_ARG, APIH_GENERAL_EXCEPTION, APIH_GENERAL_WARNING, APIH_AUDIT_EXEC, APIH_GENERAL_METRICS, APIH_DUPLICATE_CHECK_EXC, APIH_DUPLICATE_FOUND, APIH_BAD_ORDER, APIH_DB_ATTRIBUTE_NOT_FOUND, APIH_BPEL_COMMUNICATE_ERROR, APIH_BPEL_RESPONSE_ERROR, APIH_WARP_REQUEST, APIH_ERROR_FROM_BPEL_SERVER, APIH_DB_INSERT_EXC, APIH_DB_UPDATE_EXC, APIH_NO_PROPERTIES, APIH_PROPERTY_LOAD_SUC, APIH_LOAD_PROPERTIES_FAIL, APIH_SDNC_COMMUNICATE_ERROR, APIH_SDNC_RESPONSE_ERROR, APIH_CANNOT_READ_SCHEMA, APIH_HEALTH_CHECK_EXCEPTION, APIH_REQUEST_VALIDATION_ERROR_REASON, APIH_JAXB_MARSH_ERROR, APIH_JAXB_UNMARSH_ERROR, APIH_VNFREQUEST_VALIDATION_ERROR, APIH_DOM2STR_ERROR, APIH_READ_VNFOUTPUT_CLOB_EXCEPTION, APIH_DUPLICATE_CHECK_EXC_ATT, APIH_GENERATED_REQUEST_ID, APIH_GENERATED_SERVICE_INSTANCE_ID, APIH_REPLACE_REQUEST_ID,
  // Resource Adapter Messages
  RA_GENERAL_EXCEPTION_ARG, RA_GENERAL_EXCEPTION, RA_GENERAL_WARNING, RA_MISSING_PARAM, RA_AUDIT_EXEC, RA_GENERAL_METRICS, RA_CREATE_STACK_TIMEOUT, RA_DELETE_STACK_TIMEOUT, RA_UPDATE_STACK_TIMEOUT, RA_CONNECTION_EXCEPTION, RA_PARSING_ERROR, RA_PROPERTIES_NOT_FOUND, RA_LOAD_PROPERTIES_SUC, RA_NETWORK_ALREADY_EXIST, RA_UPDATE_NETWORK_ERR, RA_CREATE_STACK_ERR, RA_UPDATE_STACK_ERR, RA_CREATE_TENANT_ERR, RA_NETWORK_NOT_FOUND, RA_NETWORK_ORCHE_MODE_NOT_SUPPORT, RA_CREATE_NETWORK_EXC, RA_NS_EXC, RA_PARAM_NOT_FOUND, RA_CONFIG_EXC, RA_UNKOWN_PARAM, RA_VLAN_PARSE, RA_DELETE_NETWORK_EXC, RA_ROLLBACK_NULL, RA_TENANT_NOT_FOUND, RA_QUERY_NETWORK_EXC, RA_CREATE_NETWORK_NOTIF_EXC, RA_ASYNC_ROLLBACK, RA_WSDL_NOT_FOUND, RA_WSDL_URL_CONVENTION_EXC, RA_INIT_NOTIF_EXC, RA_SET_CALLBACK_AUTH_EXC, RA_FAULT_INFO_EXC, RA_MARSHING_ERROR, RA_PARSING_REQUEST_ERROR, RA_SEND_REQUEST_SDNC, RA_RESPONSE_FROM_SDNC, RA_EXCEPTION_COMMUNICATE_SDNC, RA_EVALUATE_XPATH_ERROR, RA_ANALYZE_ERROR_EXC, RA_ERROR_GET_RESPONSE_SDNC, RA_CALLBACK_BPEL, RA_INIT_CALLBACK_WSDL_ERR, RA_CALLBACK_BPEL_EXC, RA_CALLBACK_BPEL_COMPLETE, RA_SDNC_MISS_CONFIG_PARAM, RA_SDNC_INVALID_CONFIG, RA_PRINT_URL, RA_ERROR_CREATE_SDNC_REQUEST, RA_ERROR_CREATE_SDNC_RESPONSE, RA_ERROR_CONVERT_XML2STR, RA_RECEIVE_SDNC_NOTIF, RA_INIT_SDNC_ADAPTER, RA_SEND_REQUEST_APPC_ERR, RA_SEND_REQUEST_SDNC_ERR, RA_RECEIVE_BPEL_REQUEST, RA_TENANT_ALREADY_EXIST, RA_UPDATE_TENANT_ERR, RA_DELETE_TEMAMT_ERR, RA_ROLLBACK_TENANT_ERR, RA_QUERY_VNF_ERR, RA_VNF_ALREADY_EXIST, RA_VNF_UNKNOWN_PARAM, RA_VNF_EXTRA_PARAM, RA_CREATE_VNF_ERR, RA_VNF_NOT_EXIST, RA_UPDATE_VNF_ERR, RA_DELETE_VNF_ERR, RA_ASYNC_CREATE_VNF, RA_SEND_VNF_NOTIF_ERR, RA_ASYNC_CREATE_VNF_COMPLETE, RA_ASYNC_UPDATE_VNF, RA_ASYNC_UPDATE_VNF_COMPLETE, RA_ASYNC_QUERY_VNF, RA_ASYNC_QUERY_VNF_COMPLETE, RA_ASYNC_DELETE_VNF, RA_ASYNC_DELETE_VNF_COMPLETE, RA_ASYNC_ROLLBACK_VNF, RA_ASYNC_ROLLBACK_VNF_COMPLETE, RA_ROLLBACK_VNF_ERR, RA_DB_INVALID_STATUS, RA_CANT_UPDATE_REQUEST, RA_DB_REQUEST_NOT_EXIST, RA_CONFIG_NOT_FOUND, RA_CONFIG_LOAD, RA_RECEIVE_WORKFLOW_MESSAGE,
  // BPEL engine Messages
  BPMN_GENERAL_INFO, BPMN_GENERAL_EXCEPTION_ARG, BPMN_GENERAL_EXCEPTION, BPMN_GENERAL_WARNING, BPMN_AUDIT_EXEC, BPMN_GENERAL_METRICS, BPMN_URN_MAPPING_FAIL, BPMN_VARIABLE_NULL, BPMN_CALLBACK_EXCEPTION,
  // ASDC Messages
  ASDC_GENERAL_EXCEPTION_ARG, ASDC_GENERAL_EXCEPTION, ASDC_GENERAL_WARNING, ASDC_GENERAL_INFO, ASDC_AUDIT_EXEC, ASDC_GENERAL_METRICS, ASDC_CREATE_SERVICE, ASDC_ARTIFACT_ALREADY_DEPLOYED, ASDC_CREATE_ARTIFACT, ASDC_ARTIFACT_INSTALL_EXC, ASDC_ARTIFACT_ALREADY_DEPLOYED_DETAIL, ASDC_ARTIFACT_NOT_DEPLOYED_DETAIL, ASDC_ARTIFACT_CHECK_EXC, ASDC_INIT_ASDC_CLIENT_EXC, ASDC_INIT_ASDC_CLIENT_SUC, ASDC_LOAD_ASDC_CLIENT_EXC, ASDC_SINGLETON_CHECKT_EXC, ASDC_SHUTDOWN_ASDC_CLIENT_EXC, ASDC_CHECK_HEAT_TEMPLATE, ASDC_START_INSTALL_ARTIFACT, ASDC_ARTIFACT_TYPE_NOT_SUPPORT, ASDC_ARTIFACT_ALREADY_EXIST, ASDC_ARTIFACT_DOWNLOAD_SUC, ASDC_ARTIFACT_DOWNLOAD_FAIL, ASDC_START_DEPLOY_ARTIFACT, ASDC_SEND_NOTIF_ASDC, ASDC_SEND_NOTIF_ASDC_EXEC, ASDC_RECEIVE_CALLBACK_NOTIF, ASDC_RECEIVE_SERVICE_NOTIF, ASDC_ARTIFACT_NULL, ASDC_SERVICE_NOT_SUPPORT, ASDC_ARTIFACT_DEPLOY_SUC, ASDC_PROPERTIES_NOT_FOUND, ASDC_PROPERTIES_LOAD_SUCCESS,
  // Default Messages, in case Log catalog is not defined
  GENERAL_EXCEPTION_ARG, GENERAL_EXCEPTION, GENERAL_WARNING, AUDIT_EXEC, GENERAL_METRICS, LOGGER_SETUP, LOGGER_NOT_FOUND, LOGGER_UPDATE_SUC, LOGGER_UPDATE_DEBUG, LOGGER_UPDATE_DEBUG_SUC, LOAD_PROPERTIES_SUC, NO_PROPERTIES, MADATORY_PARAM_MISSING, LOAD_PROPERTIES_FAIL, INIT_LOGGER, INIT_LOGGER_FAIL, JAXB_EXCEPTION, IDENTITY_SERVICE_NOT_FOUND
}
