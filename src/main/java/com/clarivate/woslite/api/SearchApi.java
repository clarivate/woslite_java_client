/*
 * Web of Science API Lite
 * A responsive API that supports rich searching across the Web of Science Core Collection to retrieve core article metadata.  This service provides a great way to reuse Web of Science data both internally and externally to enhance  institutional repositories and research networking systems with best-in-class data. This API supports searching across the Web of Science to retrieve item-level metadata with limited fields:  - UT (Unique Identifier) - Authors - Author keywords - Document type - Title - Issue - Pages - Publication date - Source title - Volume - DOI - ISBN - ISSN   The API supports JSON and XML responses, and this documentation supports trying both response types. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clarivate.woslite.api;

import com.clarivate.woslite.ApiCallback;
import com.clarivate.woslite.ApiClient;
import com.clarivate.woslite.ApiException;
import com.clarivate.woslite.ApiResponse;
import com.clarivate.woslite.Configuration;
import com.clarivate.woslite.Pair;

import com.google.gson.reflect.TypeToken;


import com.clarivate.woslite.models.WosLiteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for queryQueryIdGet
     * @param queryId Retrieve records based on query identifier. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. If sortField was set on the original query, this parameter should be set as sorting is not a property of the query. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call queryQueryIdGetCall(Integer queryId, Integer count, Integer firstRecord, String sortField, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/query/{queryId}"
            .replaceAll("\\{" + "queryId" + "\\}", localVarApiClient.escapeString(queryId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (firstRecord != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstRecord", firstRecord));
        }

        if (sortField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortField", sortField));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryQueryIdGetValidateBeforeCall(Integer queryId, Integer count, Integer firstRecord, String sortField, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'queryId' is set
        if (queryId == null) {
            throw new ApiException("Missing the required parameter 'queryId' when calling queryQueryIdGet(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling queryQueryIdGet(Async)");
        }
        
        // verify the required parameter 'firstRecord' is set
        if (firstRecord == null) {
            throw new ApiException("Missing the required parameter 'firstRecord' when calling queryQueryIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = queryQueryIdGetCall(queryId, count, firstRecord, sortField, _callback);
        return localVarCall;

    }

    /**
     * Fetch record(s) by query identifier
     * This operation returns record(s) identified by a query identifier.
     * @param queryId Retrieve records based on query identifier. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. If sortField was set on the original query, this parameter should be set as sorting is not a property of the query. (optional)
     * @return WosLiteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     */
    public WosLiteResponse queryQueryIdGet(Integer queryId, Integer count, Integer firstRecord, String sortField) throws ApiException {
        ApiResponse<WosLiteResponse> localVarResp = queryQueryIdGetWithHttpInfo(queryId, count, firstRecord, sortField);
        return localVarResp.getData();
    }

    /**
     * Fetch record(s) by query identifier
     * This operation returns record(s) identified by a query identifier.
     * @param queryId Retrieve records based on query identifier. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. If sortField was set on the original query, this parameter should be set as sorting is not a property of the query. (optional)
     * @return ApiResponse&lt;WosLiteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     */
    public ApiResponse<WosLiteResponse> queryQueryIdGetWithHttpInfo(Integer queryId, Integer count, Integer firstRecord, String sortField) throws ApiException {
        okhttp3.Call localVarCall = queryQueryIdGetValidateBeforeCall(queryId, count, firstRecord, sortField, null);
        Type localVarReturnType = new TypeToken<WosLiteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch record(s) by query identifier (asynchronously)
     * This operation returns record(s) identified by a query identifier.
     * @param queryId Retrieve records based on query identifier. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. If sortField was set on the original query, this parameter should be set as sorting is not a property of the query. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call queryQueryIdGetAsync(Integer queryId, Integer count, Integer firstRecord, String sortField, final ApiCallback<WosLiteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryQueryIdGetValidateBeforeCall(queryId, count, firstRecord, sortField, _callback);
        Type localVarReturnType = new TypeToken<WosLiteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for rootGet
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param usrQuery User query for requesting data, ex: TS&#x3D;(cadmium). The query parser will return errors for invalid queries. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
     * @param edition Edition(s) to be searched. If null, user permissions will be substituted. Must include the name of the collection and edition name separated by &#39;+&#39;, ex: WOS+SCI. Multiple editions are separated by &#39;,&#39;. Editions available for collection(WOS) - AHCI,CCR,IC,ISSHP,ISTP,SCI,SSCI,BHCI,BSCI and ESCI. (optional)
     * @param publishTimeSpan This element specifies a range of publication dates. If publishTimeSpan is used, the loadTimeSpan parameter must be omitted. If publishTimeSpan and loadTimeSpan are both omitted, then the maximum time span will be inferred from the editions data. Beginning and end dates should be specified in the yyyy-mm-dd format separated by +, ex: 1993-01-01+2009-12-31. (optional)
     * @param loadTimeSpan Load time span (otherwise described as symbolic time span) defines a range of load dates. The load date is the date a record was added to the database. If load date is specified, the publishTimeSpan parameter must be omitted. If both publishTimeSpan and loadTimeSpan are omitted, the maximum publication date will be inferred from the editions data. Any of D/W/M/Y prefixed with a number where D-Day, M-Month, W-Week, Y-Year allowed. Acceptable value range for Day(0-6), Week(1-52), Month(1-12) and Year(0-10), ex: 5D,30W,10M,8Y. (optional)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     * Query examples
     * @see <a href="http://images.webofknowledge.com//WOKRS529AR7/help/WOS/hp_advanced_examples.html">Submits a user query and returns results Documentation</a>
     */
    public okhttp3.Call rootGetCall(String databaseId, String usrQuery, Integer count, Integer firstRecord, String lang, String edition, String publishTimeSpan, String loadTimeSpan, String sortField, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (databaseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("databaseId", databaseId));
        }

        if (lang != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lang", lang));
        }

        if (usrQuery != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("usrQuery", usrQuery));
        }

        if (edition != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("edition", edition));
        }

        if (publishTimeSpan != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("publishTimeSpan", publishTimeSpan));
        }

        if (loadTimeSpan != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("loadTimeSpan", loadTimeSpan));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (firstRecord != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstRecord", firstRecord));
        }

        if (sortField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortField", sortField));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call rootGetValidateBeforeCall(String databaseId, String usrQuery, Integer count, Integer firstRecord, String lang, String edition, String publishTimeSpan, String loadTimeSpan, String sortField, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new ApiException("Missing the required parameter 'databaseId' when calling rootGet(Async)");
        }
        
        // verify the required parameter 'usrQuery' is set
        if (usrQuery == null) {
            throw new ApiException("Missing the required parameter 'usrQuery' when calling rootGet(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling rootGet(Async)");
        }
        
        // verify the required parameter 'firstRecord' is set
        if (firstRecord == null) {
            throw new ApiException("Missing the required parameter 'firstRecord' when calling rootGet(Async)");
        }
        

        okhttp3.Call localVarCall = rootGetCall(databaseId, usrQuery, count, firstRecord, lang, edition, publishTimeSpan, loadTimeSpan, sortField, _callback);
        return localVarCall;

    }

    /**
     * Submits a user query and returns results
     * The search operation submits a search query to the specified database edition and retrieves data. This operation returns a query ID that can be used in subsequent operations to retrieve more records.
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param usrQuery User query for requesting data, ex: TS&#x3D;(cadmium). The query parser will return errors for invalid queries. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
     * @param edition Edition(s) to be searched. If null, user permissions will be substituted. Must include the name of the collection and edition name separated by &#39;+&#39;, ex: WOS+SCI. Multiple editions are separated by &#39;,&#39;. Editions available for collection(WOS) - AHCI,CCR,IC,ISSHP,ISTP,SCI,SSCI,BHCI,BSCI and ESCI. (optional)
     * @param publishTimeSpan This element specifies a range of publication dates. If publishTimeSpan is used, the loadTimeSpan parameter must be omitted. If publishTimeSpan and loadTimeSpan are both omitted, then the maximum time span will be inferred from the editions data. Beginning and end dates should be specified in the yyyy-mm-dd format separated by +, ex: 1993-01-01+2009-12-31. (optional)
     * @param loadTimeSpan Load time span (otherwise described as symbolic time span) defines a range of load dates. The load date is the date a record was added to the database. If load date is specified, the publishTimeSpan parameter must be omitted. If both publishTimeSpan and loadTimeSpan are omitted, the maximum publication date will be inferred from the editions data. Any of D/W/M/Y prefixed with a number where D-Day, M-Month, W-Week, Y-Year allowed. Acceptable value range for Day(0-6), Week(1-52), Month(1-12) and Year(0-10), ex: 5D,30W,10M,8Y. (optional)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. (optional)
     * @return WosLiteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     * Query examples
     * @see <a href="http://images.webofknowledge.com//WOKRS529AR7/help/WOS/hp_advanced_examples.html">Submits a user query and returns results Documentation</a>
     */
    public WosLiteResponse rootGet(String databaseId, String usrQuery, Integer count, Integer firstRecord, String lang, String edition, String publishTimeSpan, String loadTimeSpan, String sortField) throws ApiException {
        ApiResponse<WosLiteResponse> localVarResp = rootGetWithHttpInfo(databaseId, usrQuery, count, firstRecord, lang, edition, publishTimeSpan, loadTimeSpan, sortField);
        return localVarResp.getData();
    }

    /**
     * Submits a user query and returns results
     * The search operation submits a search query to the specified database edition and retrieves data. This operation returns a query ID that can be used in subsequent operations to retrieve more records.
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param usrQuery User query for requesting data, ex: TS&#x3D;(cadmium). The query parser will return errors for invalid queries. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
     * @param edition Edition(s) to be searched. If null, user permissions will be substituted. Must include the name of the collection and edition name separated by &#39;+&#39;, ex: WOS+SCI. Multiple editions are separated by &#39;,&#39;. Editions available for collection(WOS) - AHCI,CCR,IC,ISSHP,ISTP,SCI,SSCI,BHCI,BSCI and ESCI. (optional)
     * @param publishTimeSpan This element specifies a range of publication dates. If publishTimeSpan is used, the loadTimeSpan parameter must be omitted. If publishTimeSpan and loadTimeSpan are both omitted, then the maximum time span will be inferred from the editions data. Beginning and end dates should be specified in the yyyy-mm-dd format separated by +, ex: 1993-01-01+2009-12-31. (optional)
     * @param loadTimeSpan Load time span (otherwise described as symbolic time span) defines a range of load dates. The load date is the date a record was added to the database. If load date is specified, the publishTimeSpan parameter must be omitted. If both publishTimeSpan and loadTimeSpan are omitted, the maximum publication date will be inferred from the editions data. Any of D/W/M/Y prefixed with a number where D-Day, M-Month, W-Week, Y-Year allowed. Acceptable value range for Day(0-6), Week(1-52), Month(1-12) and Year(0-10), ex: 5D,30W,10M,8Y. (optional)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. (optional)
     * @return ApiResponse&lt;WosLiteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     * Query examples
     * @see <a href="http://images.webofknowledge.com//WOKRS529AR7/help/WOS/hp_advanced_examples.html">Submits a user query and returns results Documentation</a>
     */
    public ApiResponse<WosLiteResponse> rootGetWithHttpInfo(String databaseId, String usrQuery, Integer count, Integer firstRecord, String lang, String edition, String publishTimeSpan, String loadTimeSpan, String sortField) throws ApiException {
        okhttp3.Call localVarCall = rootGetValidateBeforeCall(databaseId, usrQuery, count, firstRecord, lang, edition, publishTimeSpan, loadTimeSpan, sortField, null);
        Type localVarReturnType = new TypeToken<WosLiteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submits a user query and returns results (asynchronously)
     * The search operation submits a search query to the specified database edition and retrieves data. This operation returns a query ID that can be used in subsequent operations to retrieve more records.
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param usrQuery User query for requesting data, ex: TS&#x3D;(cadmium). The query parser will return errors for invalid queries. (required)
     * @param count Number of records to return, must be 0-100. (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
     * @param edition Edition(s) to be searched. If null, user permissions will be substituted. Must include the name of the collection and edition name separated by &#39;+&#39;, ex: WOS+SCI. Multiple editions are separated by &#39;,&#39;. Editions available for collection(WOS) - AHCI,CCR,IC,ISSHP,ISTP,SCI,SSCI,BHCI,BSCI and ESCI. (optional)
     * @param publishTimeSpan This element specifies a range of publication dates. If publishTimeSpan is used, the loadTimeSpan parameter must be omitted. If publishTimeSpan and loadTimeSpan are both omitted, then the maximum time span will be inferred from the editions data. Beginning and end dates should be specified in the yyyy-mm-dd format separated by +, ex: 1993-01-01+2009-12-31. (optional)
     * @param loadTimeSpan Load time span (otherwise described as symbolic time span) defines a range of load dates. The load date is the date a record was added to the database. If load date is specified, the publishTimeSpan parameter must be omitted. If both publishTimeSpan and loadTimeSpan are omitted, the maximum publication date will be inferred from the editions data. Any of D/W/M/Y prefixed with a number where D-Day, M-Month, W-Week, Y-Year allowed. Acceptable value range for Day(0-6), Week(1-52), Month(1-12) and Year(0-10), ex: 5D,30W,10M,8Y. (optional)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     * Query examples
     * @see <a href="http://images.webofknowledge.com//WOKRS529AR7/help/WOS/hp_advanced_examples.html">Submits a user query and returns results Documentation</a>
     */
    public okhttp3.Call rootGetAsync(String databaseId, String usrQuery, Integer count, Integer firstRecord, String lang, String edition, String publishTimeSpan, String loadTimeSpan, String sortField, final ApiCallback<WosLiteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = rootGetValidateBeforeCall(databaseId, usrQuery, count, firstRecord, lang, edition, publishTimeSpan, loadTimeSpan, sortField, _callback);
        Type localVarReturnType = new TypeToken<WosLiteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}