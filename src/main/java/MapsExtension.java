import org.nlogo.api.*;
public class MapsExtension extends DefaultClassManager {
	public void load(PrimitiveManager primitiveManager) {
		primitiveManager.addPrimitive( "hide-map", new HideMap() );
		primitiveManager.addPrimitive( "show-map", new ShowMap() );
		primitiveManager.addPrimitive( "import-file", new ImportFile() );
		primitiveManager.addPrimitive( "export-file", new ExportFile() );
		primitiveManager.addPrimitive( "set-zoom", new SetZoom() );
		primitiveManager.addPrimitive( "get-zoom", new GetZoom() );
		primitiveManager.addPrimitive( "set-center-latlng", new SetCenterLatlng() );
		primitiveManager.addPrimitive( "get-center-latlng", new GetCenterLatlng() );
		primitiveManager.addPrimitive( "create-marker", new CreateMarker() );
		primitiveManager.addPrimitive( "create-markers", new CreateMarkers() );
		primitiveManager.addPrimitive( "get-markers", new GetMarkers() );
		primitiveManager.addPrimitive( "get-marker", new GetMarker() );
		primitiveManager.addPrimitive( "hide-object", new HideObject() );
		primitiveManager.addPrimitive( "show-object", new ShowObject() );
		primitiveManager.addPrimitive( "set-lat", new SetLat() );
		primitiveManager.addPrimitive( "set-lng", new SetLng() );
		primitiveManager.addPrimitive( "set-latlng", new SetLatlng() );
		primitiveManager.addPrimitive( "get-lat", new GetLat() );
		primitiveManager.addPrimitive( "get-lng", new GetLng() );
		primitiveManager.addPrimitive( "get-latlng", new GetLatlng() );
		primitiveManager.addPrimitive( "set-draggable", new SetDraggable() );
		primitiveManager.addPrimitive( "delete-marker", new DeleteMarker() );
		primitiveManager.addPrimitive( "delete-markers", new DeleteMarkers() );
		primitiveManager.addPrimitive( "latlng-to-patch", new LatlngToPatch() );
		primitiveManager.addPrimitive( "patch-to-latlng", new PatchToLatlng() );
		primitiveManager.addPrimitive( "object-exists", new ObjectExists() );
		primitiveManager.addPrimitive( "set-opacity", new SetOpacity() );
		primitiveManager.addPrimitive( "get-opacity", new GetOpacity() );
		primitiveManager.addPrimitive( "bring-to-front", new BringToFront() );
		primitiveManager.addPrimitive( "send-to-back", new SendToBack() );
		primitiveManager.addPrimitive( "get-map-offset", new GetMapOffset() );
		primitiveManager.addPrimitive( "set-map-offset", new SetMapOffset() );
		primitiveManager.addPrimitive( "set-all", new SetAll() );
		primitiveManager.addPrimitive( "get-all", new GetAll() );
		primitiveManager.addPrimitive( "update-map", new UpdateMap() );
		primitiveManager.addPrimitive( "create-path", new CreatePath() );
		primitiveManager.addPrimitive( "set-path-color", new SetPathColor() );
		primitiveManager.addPrimitive( "get-path-color", new GetPathColor() );
		primitiveManager.addPrimitive( "set-path-vertices", new SetPathVertices() );
		primitiveManager.addPrimitive( "get-path-vertices", new GetPathVertices() );
		primitiveManager.addPrimitive( "hide-object", new HideObject() );
		primitiveManager.addPrimitive( "show-object", new ShowObject() );
		primitiveManager.addPrimitive( "get-object-type", new GetObjectType() );
		primitiveManager.addPrimitive( "create-object", new CreateObject() );
		primitiveManager.addPrimitive( "create-objects", new CreateObjects() );
		primitiveManager.addPrimitive( "get-object", new GetObject() );
		primitiveManager.addPrimitive( "get-objects", new GetObjects() );
		primitiveManager.addPrimitive( "delete-object", new DeleteObject() );
		primitiveManager.addPrimitive( "delete-objects", new DeleteObjects() );
		primitiveManager.addPrimitive( "delete-path", new DeletePath() );
		primitiveManager.addPrimitive( "delete-paths", new DeletePaths() );
	}
}