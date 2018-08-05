package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_mahmoud_proposal_Model_ModelRealmProxy extends com.example.mahmoud.proposal.Model.Model
    implements RealmObjectProxy, com_example_mahmoud_proposal_Model_ModelRealmProxyInterface {

    static final class ModelColumnInfo extends ColumnInfo {
        long cpuOneFreqIndex;
        long cpuTwoFreqIndex;
        long cpuThreeFreqIndex;
        long cpuFourFreqIndex;
        long cpuLoadIndex;
        long cpuUsageIndex;
        long cpuTemperatureIndex;

        ModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Model");
            this.cpuOneFreqIndex = addColumnDetails("cpuOneFreq", "cpuOneFreq", objectSchemaInfo);
            this.cpuTwoFreqIndex = addColumnDetails("cpuTwoFreq", "cpuTwoFreq", objectSchemaInfo);
            this.cpuThreeFreqIndex = addColumnDetails("cpuThreeFreq", "cpuThreeFreq", objectSchemaInfo);
            this.cpuFourFreqIndex = addColumnDetails("cpuFourFreq", "cpuFourFreq", objectSchemaInfo);
            this.cpuLoadIndex = addColumnDetails("cpuLoad", "cpuLoad", objectSchemaInfo);
            this.cpuUsageIndex = addColumnDetails("cpuUsage", "cpuUsage", objectSchemaInfo);
            this.cpuTemperatureIndex = addColumnDetails("cpuTemperature", "cpuTemperature", objectSchemaInfo);
        }

        ModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ModelColumnInfo src = (ModelColumnInfo) rawSrc;
            final ModelColumnInfo dst = (ModelColumnInfo) rawDst;
            dst.cpuOneFreqIndex = src.cpuOneFreqIndex;
            dst.cpuTwoFreqIndex = src.cpuTwoFreqIndex;
            dst.cpuThreeFreqIndex = src.cpuThreeFreqIndex;
            dst.cpuFourFreqIndex = src.cpuFourFreqIndex;
            dst.cpuLoadIndex = src.cpuLoadIndex;
            dst.cpuUsageIndex = src.cpuUsageIndex;
            dst.cpuTemperatureIndex = src.cpuTemperatureIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ModelColumnInfo columnInfo;
    private ProxyState<com.example.mahmoud.proposal.Model.Model> proxyState;

    com_example_mahmoud_proposal_Model_ModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.mahmoud.proposal.Model.Model>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$cpuOneFreq() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.cpuOneFreqIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.cpuOneFreqIndex);
    }

    @Override
    public void realmSet$cpuOneFreq(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cpuOneFreqIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.cpuOneFreqIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cpuOneFreqIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.cpuOneFreqIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$cpuTwoFreq() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.cpuTwoFreqIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.cpuTwoFreqIndex);
    }

    @Override
    public void realmSet$cpuTwoFreq(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cpuTwoFreqIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.cpuTwoFreqIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cpuTwoFreqIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.cpuTwoFreqIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$cpuThreeFreq() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.cpuThreeFreqIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.cpuThreeFreqIndex);
    }

    @Override
    public void realmSet$cpuThreeFreq(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cpuThreeFreqIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.cpuThreeFreqIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cpuThreeFreqIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.cpuThreeFreqIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$cpuFourFreq() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.cpuFourFreqIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.cpuFourFreqIndex);
    }

    @Override
    public void realmSet$cpuFourFreq(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cpuFourFreqIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.cpuFourFreqIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cpuFourFreqIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.cpuFourFreqIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$cpuLoad() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.cpuLoadIndex);
    }

    @Override
    public void realmSet$cpuLoad(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.cpuLoadIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.cpuLoadIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$cpuUsage() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.cpuUsageIndex);
    }

    @Override
    public void realmSet$cpuUsage(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.cpuUsageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.cpuUsageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$cpuTemperature() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.cpuTemperatureIndex);
    }

    @Override
    public void realmSet$cpuTemperature(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.cpuTemperatureIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.cpuTemperatureIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Model", 7, 0);
        builder.addPersistedProperty("cpuOneFreq", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cpuTwoFreq", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cpuThreeFreq", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cpuFourFreq", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("cpuLoad", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("cpuUsage", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("cpuTemperature", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Model";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Model";
    }

    @SuppressWarnings("cast")
    public static com.example.mahmoud.proposal.Model.Model createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.mahmoud.proposal.Model.Model obj = realm.createObjectInternal(com.example.mahmoud.proposal.Model.Model.class, true, excludeFields);

        final com_example_mahmoud_proposal_Model_ModelRealmProxyInterface objProxy = (com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) obj;
        if (json.has("cpuOneFreq")) {
            if (json.isNull("cpuOneFreq")) {
                objProxy.realmSet$cpuOneFreq(null);
            } else {
                objProxy.realmSet$cpuOneFreq((long) json.getLong("cpuOneFreq"));
            }
        }
        if (json.has("cpuTwoFreq")) {
            if (json.isNull("cpuTwoFreq")) {
                objProxy.realmSet$cpuTwoFreq(null);
            } else {
                objProxy.realmSet$cpuTwoFreq((long) json.getLong("cpuTwoFreq"));
            }
        }
        if (json.has("cpuThreeFreq")) {
            if (json.isNull("cpuThreeFreq")) {
                objProxy.realmSet$cpuThreeFreq(null);
            } else {
                objProxy.realmSet$cpuThreeFreq((long) json.getLong("cpuThreeFreq"));
            }
        }
        if (json.has("cpuFourFreq")) {
            if (json.isNull("cpuFourFreq")) {
                objProxy.realmSet$cpuFourFreq(null);
            } else {
                objProxy.realmSet$cpuFourFreq((long) json.getLong("cpuFourFreq"));
            }
        }
        if (json.has("cpuLoad")) {
            if (json.isNull("cpuLoad")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cpuLoad' to null.");
            } else {
                objProxy.realmSet$cpuLoad((float) json.getDouble("cpuLoad"));
            }
        }
        if (json.has("cpuUsage")) {
            if (json.isNull("cpuUsage")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cpuUsage' to null.");
            } else {
                objProxy.realmSet$cpuUsage((float) json.getDouble("cpuUsage"));
            }
        }
        if (json.has("cpuTemperature")) {
            if (json.isNull("cpuTemperature")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cpuTemperature' to null.");
            } else {
                objProxy.realmSet$cpuTemperature((float) json.getDouble("cpuTemperature"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.mahmoud.proposal.Model.Model createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.mahmoud.proposal.Model.Model obj = new com.example.mahmoud.proposal.Model.Model();
        final com_example_mahmoud_proposal_Model_ModelRealmProxyInterface objProxy = (com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("cpuOneFreq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuOneFreq((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cpuOneFreq(null);
                }
            } else if (name.equals("cpuTwoFreq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuTwoFreq((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cpuTwoFreq(null);
                }
            } else if (name.equals("cpuThreeFreq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuThreeFreq((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cpuThreeFreq(null);
                }
            } else if (name.equals("cpuFourFreq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuFourFreq((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$cpuFourFreq(null);
                }
            } else if (name.equals("cpuLoad")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuLoad((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cpuLoad' to null.");
                }
            } else if (name.equals("cpuUsage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuUsage((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cpuUsage' to null.");
                }
            } else if (name.equals("cpuTemperature")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$cpuTemperature((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cpuTemperature' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.mahmoud.proposal.Model.Model copyOrUpdate(Realm realm, com.example.mahmoud.proposal.Model.Model object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.mahmoud.proposal.Model.Model) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.mahmoud.proposal.Model.Model copy(Realm realm, com.example.mahmoud.proposal.Model.Model newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.mahmoud.proposal.Model.Model) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.mahmoud.proposal.Model.Model realmObject = realm.createObjectInternal(com.example.mahmoud.proposal.Model.Model.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_mahmoud_proposal_Model_ModelRealmProxyInterface realmObjectSource = (com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) newObject;
        com_example_mahmoud_proposal_Model_ModelRealmProxyInterface realmObjectCopy = (com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$cpuOneFreq(realmObjectSource.realmGet$cpuOneFreq());
        realmObjectCopy.realmSet$cpuTwoFreq(realmObjectSource.realmGet$cpuTwoFreq());
        realmObjectCopy.realmSet$cpuThreeFreq(realmObjectSource.realmGet$cpuThreeFreq());
        realmObjectCopy.realmSet$cpuFourFreq(realmObjectSource.realmGet$cpuFourFreq());
        realmObjectCopy.realmSet$cpuLoad(realmObjectSource.realmGet$cpuLoad());
        realmObjectCopy.realmSet$cpuUsage(realmObjectSource.realmGet$cpuUsage());
        realmObjectCopy.realmSet$cpuTemperature(realmObjectSource.realmGet$cpuTemperature());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.mahmoud.proposal.Model.Model object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.mahmoud.proposal.Model.Model.class);
        long tableNativePtr = table.getNativePtr();
        ModelColumnInfo columnInfo = (ModelColumnInfo) realm.getSchema().getColumnInfo(com.example.mahmoud.proposal.Model.Model.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$cpuOneFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuOneFreq();
        if (realmGet$cpuOneFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuOneFreqIndex, rowIndex, realmGet$cpuOneFreq.longValue(), false);
        }
        Number realmGet$cpuTwoFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTwoFreq();
        if (realmGet$cpuTwoFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuTwoFreqIndex, rowIndex, realmGet$cpuTwoFreq.longValue(), false);
        }
        Number realmGet$cpuThreeFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuThreeFreq();
        if (realmGet$cpuThreeFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuThreeFreqIndex, rowIndex, realmGet$cpuThreeFreq.longValue(), false);
        }
        Number realmGet$cpuFourFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuFourFreq();
        if (realmGet$cpuFourFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuFourFreqIndex, rowIndex, realmGet$cpuFourFreq.longValue(), false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.cpuLoadIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuLoad(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.cpuUsageIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuUsage(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.cpuTemperatureIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTemperature(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.mahmoud.proposal.Model.Model.class);
        long tableNativePtr = table.getNativePtr();
        ModelColumnInfo columnInfo = (ModelColumnInfo) realm.getSchema().getColumnInfo(com.example.mahmoud.proposal.Model.Model.class);
        com.example.mahmoud.proposal.Model.Model object = null;
        while (objects.hasNext()) {
            object = (com.example.mahmoud.proposal.Model.Model) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$cpuOneFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuOneFreq();
            if (realmGet$cpuOneFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuOneFreqIndex, rowIndex, realmGet$cpuOneFreq.longValue(), false);
            }
            Number realmGet$cpuTwoFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTwoFreq();
            if (realmGet$cpuTwoFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuTwoFreqIndex, rowIndex, realmGet$cpuTwoFreq.longValue(), false);
            }
            Number realmGet$cpuThreeFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuThreeFreq();
            if (realmGet$cpuThreeFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuThreeFreqIndex, rowIndex, realmGet$cpuThreeFreq.longValue(), false);
            }
            Number realmGet$cpuFourFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuFourFreq();
            if (realmGet$cpuFourFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuFourFreqIndex, rowIndex, realmGet$cpuFourFreq.longValue(), false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.cpuLoadIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuLoad(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.cpuUsageIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuUsage(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.cpuTemperatureIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTemperature(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.mahmoud.proposal.Model.Model object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.mahmoud.proposal.Model.Model.class);
        long tableNativePtr = table.getNativePtr();
        ModelColumnInfo columnInfo = (ModelColumnInfo) realm.getSchema().getColumnInfo(com.example.mahmoud.proposal.Model.Model.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$cpuOneFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuOneFreq();
        if (realmGet$cpuOneFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuOneFreqIndex, rowIndex, realmGet$cpuOneFreq.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cpuOneFreqIndex, rowIndex, false);
        }
        Number realmGet$cpuTwoFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTwoFreq();
        if (realmGet$cpuTwoFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuTwoFreqIndex, rowIndex, realmGet$cpuTwoFreq.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cpuTwoFreqIndex, rowIndex, false);
        }
        Number realmGet$cpuThreeFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuThreeFreq();
        if (realmGet$cpuThreeFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuThreeFreqIndex, rowIndex, realmGet$cpuThreeFreq.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cpuThreeFreqIndex, rowIndex, false);
        }
        Number realmGet$cpuFourFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuFourFreq();
        if (realmGet$cpuFourFreq != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.cpuFourFreqIndex, rowIndex, realmGet$cpuFourFreq.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cpuFourFreqIndex, rowIndex, false);
        }
        Table.nativeSetFloat(tableNativePtr, columnInfo.cpuLoadIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuLoad(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.cpuUsageIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuUsage(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.cpuTemperatureIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTemperature(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.mahmoud.proposal.Model.Model.class);
        long tableNativePtr = table.getNativePtr();
        ModelColumnInfo columnInfo = (ModelColumnInfo) realm.getSchema().getColumnInfo(com.example.mahmoud.proposal.Model.Model.class);
        com.example.mahmoud.proposal.Model.Model object = null;
        while (objects.hasNext()) {
            object = (com.example.mahmoud.proposal.Model.Model) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$cpuOneFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuOneFreq();
            if (realmGet$cpuOneFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuOneFreqIndex, rowIndex, realmGet$cpuOneFreq.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cpuOneFreqIndex, rowIndex, false);
            }
            Number realmGet$cpuTwoFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTwoFreq();
            if (realmGet$cpuTwoFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuTwoFreqIndex, rowIndex, realmGet$cpuTwoFreq.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cpuTwoFreqIndex, rowIndex, false);
            }
            Number realmGet$cpuThreeFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuThreeFreq();
            if (realmGet$cpuThreeFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuThreeFreqIndex, rowIndex, realmGet$cpuThreeFreq.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cpuThreeFreqIndex, rowIndex, false);
            }
            Number realmGet$cpuFourFreq = ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuFourFreq();
            if (realmGet$cpuFourFreq != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.cpuFourFreqIndex, rowIndex, realmGet$cpuFourFreq.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.cpuFourFreqIndex, rowIndex, false);
            }
            Table.nativeSetFloat(tableNativePtr, columnInfo.cpuLoadIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuLoad(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.cpuUsageIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuUsage(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.cpuTemperatureIndex, rowIndex, ((com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) object).realmGet$cpuTemperature(), false);
        }
    }

    public static com.example.mahmoud.proposal.Model.Model createDetachedCopy(com.example.mahmoud.proposal.Model.Model realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.mahmoud.proposal.Model.Model unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.mahmoud.proposal.Model.Model();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.mahmoud.proposal.Model.Model) cachedObject.object;
            }
            unmanagedObject = (com.example.mahmoud.proposal.Model.Model) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_mahmoud_proposal_Model_ModelRealmProxyInterface unmanagedCopy = (com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) unmanagedObject;
        com_example_mahmoud_proposal_Model_ModelRealmProxyInterface realmSource = (com_example_mahmoud_proposal_Model_ModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$cpuOneFreq(realmSource.realmGet$cpuOneFreq());
        unmanagedCopy.realmSet$cpuTwoFreq(realmSource.realmGet$cpuTwoFreq());
        unmanagedCopy.realmSet$cpuThreeFreq(realmSource.realmGet$cpuThreeFreq());
        unmanagedCopy.realmSet$cpuFourFreq(realmSource.realmGet$cpuFourFreq());
        unmanagedCopy.realmSet$cpuLoad(realmSource.realmGet$cpuLoad());
        unmanagedCopy.realmSet$cpuUsage(realmSource.realmGet$cpuUsage());
        unmanagedCopy.realmSet$cpuTemperature(realmSource.realmGet$cpuTemperature());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Model = proxy[");
        stringBuilder.append("{cpuOneFreq:");
        stringBuilder.append(realmGet$cpuOneFreq() != null ? realmGet$cpuOneFreq() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cpuTwoFreq:");
        stringBuilder.append(realmGet$cpuTwoFreq() != null ? realmGet$cpuTwoFreq() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cpuThreeFreq:");
        stringBuilder.append(realmGet$cpuThreeFreq() != null ? realmGet$cpuThreeFreq() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cpuFourFreq:");
        stringBuilder.append(realmGet$cpuFourFreq() != null ? realmGet$cpuFourFreq() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cpuLoad:");
        stringBuilder.append(realmGet$cpuLoad());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cpuUsage:");
        stringBuilder.append(realmGet$cpuUsage());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cpuTemperature:");
        stringBuilder.append(realmGet$cpuTemperature());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_mahmoud_proposal_Model_ModelRealmProxy aModel = (com_example_mahmoud_proposal_Model_ModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
