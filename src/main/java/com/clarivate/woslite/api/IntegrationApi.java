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

public class IntegrationApi {
    private ApiClient localVarApiClient;

    public IntegrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IntegrationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for idUniqueIdGet
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param uniqueId Primary item(s) id to be searched, ex: WOS:000270372400005. Cannot be null or an empty string. Multiple values are separated by comma. (required)
     * @param count Number of records returned in the request (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
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
     */
    public okhttp3.Call idUniqueIdGetCall(String databaseId, String uniqueId, Integer count, Integer firstRecord, String lang, String sortField, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/id/{uniqueId}"
            .replaceAll("\\{" + "uniqueId" + "\\}", localVarApiClient.escapeString(uniqueId.toString()));

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
    private okhttp3.Call idUniqueIdGetValidateBeforeCall(String databaseId, String uniqueId, Integer count, Integer firstRecord, String lang, String sortField, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new ApiException("Missing the required parameter 'databaseId' when calling idUniqueIdGet(Async)");
        }
        
        // verify the required parameter 'uniqueId' is set
        if (uniqueId == null) {
            throw new ApiException("Missing the required parameter 'uniqueId' when calling idUniqueIdGet(Async)");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling idUniqueIdGet(Async)");
        }
        
        // verify the required parameter 'firstRecord' is set
        if (firstRecord == null) {
            throw new ApiException("Missing the required parameter 'firstRecord' when calling idUniqueIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = idUniqueIdGetCall(databaseId, uniqueId, count, firstRecord, lang, sortField, _callback);
        return localVarCall;

    }

    /**
     * Find record(s) by specific id
     * This operation returns a record identified by a unique identifier. You may specify multiple identifiers in a single request.
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param uniqueId Primary item(s) id to be searched, ex: WOS:000270372400005. Cannot be null or an empty string. Multiple values are separated by comma. (required)
     * @param count Number of records returned in the request (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. (optional)
     * @return WosLiteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     */
    public WosLiteResponse idUniqueIdGet(String databaseId, String uniqueId, Integer count, Integer firstRecord, String lang, String sortField) throws ApiException {
        ApiResponse<WosLiteResponse> localVarResp = idUniqueIdGetWithHttpInfo(databaseId, uniqueId, count, firstRecord, lang, sortField);
        return localVarResp.getData();
    }

    /**
     * Find record(s) by specific id
     * This operation returns a record identified by a unique identifier. You may specify multiple identifiers in a single request.
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param uniqueId Primary item(s) id to be searched, ex: WOS:000270372400005. Cannot be null or an empty string. Multiple values are separated by comma. (required)
     * @param count Number of records returned in the request (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
     * @param sortField Order by field(s). Field name and order by clause separated by &#39;+&#39;, use A for ASC and D for DESC, ex: PY+D. Multiple values are separated by comma. (optional)
     * @return ApiResponse&lt;WosLiteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  * x-paginate-by-query-id - The url of the next page in case your &#x60;RecordsFound &gt; count + firstRecord&#x60; Please use this url for pagination. The QueryId will live for four hours in case if inactivity.  <br>  </td></tr>
        <tr><td> 0 </td><td> Error response 400+ </td><td>  * X-RateLimit-Remaining-second - The number of requests left for the second window. <br>  * X-RateLimit-Limit-second - The number of requests limit per second. <br>  </td></tr>
     </table>
     */
    public ApiResponse<WosLiteResponse> idUniqueIdGetWithHttpInfo(String databaseId, String uniqueId, Integer count, Integer firstRecord, String lang, String sortField) throws ApiException {
        okhttp3.Call localVarCall = idUniqueIdGetValidateBeforeCall(databaseId, uniqueId, count, firstRecord, lang, sortField, null);
        Type localVarReturnType = new TypeToken<WosLiteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find record(s) by specific id (asynchronously)
     * This operation returns a record identified by a unique identifier. You may specify multiple identifiers in a single request.
     * @param databaseId Database to search. Must be a valid database ID, one of the following: BCI/BIOABS/BIOSIS/CCC/DCI/DIIDW/MEDLINE/WOK/WOS/ZOOREC. WOK represents all databases. (required)
     * @param uniqueId Primary item(s) id to be searched, ex: WOS:000270372400005. Cannot be null or an empty string. Multiple values are separated by comma. (required)
     * @param count Number of records returned in the request (required)
     * @param firstRecord Specific record, if any within the result set to return. Cannot be less than 1 and greater than 100000. (required)
     * @param lang Language of search. This element can take only one value: en for English. If no language is specified, English is passed by default. (optional)
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
     */
    public okhttp3.Call idUniqueIdGetAsync(String databaseId, String uniqueId, Integer count, Integer firstRecord, String lang, String sortField, final ApiCallback<WosLiteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = idUniqueIdGetValidateBeforeCall(databaseId, uniqueId, count, firstRecord, lang, sortField, _callback);
        Type localVarReturnType = new TypeToken<WosLiteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
