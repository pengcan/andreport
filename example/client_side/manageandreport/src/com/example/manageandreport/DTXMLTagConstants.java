
package com.example.manageandreport;

/**
 * 
 * @author bruce.peng
 * @version 0.1
 * All the constants are keys.
 * we can use them to get data or set data for change report structure.
 *
 */
public class DTXMLTagConstants {
	
	/***********************************************************************************************/
	//element names 
	/***********************************************************************************************/
	//------------------------------------------
	//element names
	//------------------------------------------
	public static final String DATATABLE = "dataTable";
	public static final String COLUMNS = "columns";
	public static final String COLUMN = "column";//COLUMNS's subelement
	
	//-----------------------
	//combination.
	//1.view panel's template.
	//2.prefix + element name is combination column template. List used.
	//-----------------------
	public static final String CONTENT_TEMPLATE = "contentTemplate";
	public static final String RIGHT_TEMPLATE = "rightTemplate";
	public static final String FOOTER_TEMPLATE = "footerTemplate";
	public static final String LEFT_IMAGE_TEMPLATE = "leftImageTemplate";
	
	//-----------------------
	//the panel element
	//-----------------------
	public static final String SEARCH_PANEL = "searchPanel";
	public static final String EDIT_PANEL = "editPanel";
	public static final String ADD_PANEL = "addPanel";
	public static final String VIEW_PANEL = "viewPanel";

	//-----------------------
	//the panel's subElement, 
	//panel item element. 
	//-----------------------
	public static final String SEARCH_ITEM = "searchItem";
	public static final String EDIT_ITEM = "editItem";
	public static final String ADD_ITEM = "addItem";
	/***********************************************************************************************/
	
	
	/***********************************************************************************************/
	//attribute names
	/***********************************************************************************************/
	/*************************************/
	//DATATABLE element's attribute
	/*************************************/
	//--------------screen---------------- 
	//type:string
	//value options:'portrait | landscape'
	//default: 'landscape'
	public static final String SCREEN_ORIENTATION = "screenOrientation";
	
	//-------------report's width---------
	//type:int
	//no default value
	//if not set, then width is 100%
	public static final String WIDTH = "width";
	
	//type:string
	//default: ''
	public static final String REPORT_TITLE = "reportTitle";
	
	//--------the report's action URL------
	//type:string
	//default: ''
	public static final String SERACH_URL = "serachURL";
	public static final String ADD_ACTION_URL = "addedAndGetListActionURL";
	public static final String EDIT_ACTION_URL = "editAndGetListActionURL";
	public static final String DELETE_ACTION_URL = "deleteAndGetListActionURL";
	public static final String MULTIPLE_DELETE_ACTION_URL = "multipleDeleteAndGetListActionURL";
	public static final String CUSTOM_ACTION_URL = "customActionURL";
	public static final String FIND_EDIT_ITEM_BY_ID_URL = "findEditItemByIdURL";
	public static final String FIND_VIEW_ITEM_BY_ID_URL = "findViewItemByIdURL";
	
	//------------navigation bar----------
	//type:boolean
	//default: 'false'
	//value options: 'false|true'
	public static final String SHOW_SETTINGS = "showSettings";
	public static final String SHOW_ADDED = "showAdded";
	public static final String SHOW_MULTIPLE_DELETE = "showMultipleDelete";
	public static final String SHOW_SEARCH = "showSearch";
	public static final String SHOW_NAVIGATION = "showNavigationBar";	
	
	//-------------paging bar------------
	//type:int
	//default: 10
	public static final String ITEMSPERPAGE = "itemsPerPage";
	//type:string
	//default: 'usePagingBar'
	//value options: 'usePagingBar | useDropdown'
	//maybe 'useDropdown' for List.  'usePagingBar' for datagrid
	//TODO will change other way to implements paging
	public static final String PAGING_TYPE = "pagingType";

	//-------------table style------------
	//type:int
	//default:40
	public static final String HEADERHEIGHT = "headerHeight";
	public static final String ROWHEIGHT = "rowHeight";
	//type:string
	//default:'#FFCCCCCC'
	public static final String LINECOLOR = "lineColor";	//报表的线条颜色
	//default:'#FFEEFFEE'
	public static final String EVEN_ROW_BACKGROUND_COLOR = "evenRowBackgroundColor";
	//default:'#FFE1FFDA'
	public static final String ODD_ROW_BACKGROUND_COLOR = "oddRowBackgroundColor";
	//type:array
	//default: [#FFE1E1E1,#FFCECECE,#FFE1E1E1]
	public static final String HEADER_BACKGROUND_COLORS = "headerBackgroundColors";	

	//-------------table's column------------
	//type:boolean
	//defaule:false
	public static final String CAN_REMOVECOLUMN="canRemoveColumn";
	public static final String CAN_ADDCOLUMN="canAddColumn";
	
	/*************************************/
	//COLUMN element's attribute
	/*************************************/
	//type:boolean
	//defaul:false
	//---drag column for delete or change column index.
	public static final String DRAGGABLE="draggable";
	//---sort data by column. TODO not yet
	public static final String SORTABLE="sortable";
	//---drag and resize column's width. TODO not yet
	public static final String RESIZEABLE="resizeable";
		
	//-------------column field ------------
	//either 'DATAFIELD' or 'DATAFIELDS'
	//DATAFIELDS always use 'combination column'
	//type:string
	//no default value
	public static final String DATAFIELD = "dataField";
	//type:array. like:[id,name]
	//no default value
	public static final String DATAFIELDS = "dataFields";
	
	//-------------column style ------------
	//type:int
	//no default value
	//if not set then just by auto
	public static final String COLWIDTH = "colWidth";
	
	//column header text
	//type:string
	//default:''
	public static final String HEADER_TEXT = "headerText";
	
	//--------column header style ------------
	//type:int
	//default:20
	public static final String HEADER_FONT_SIZE="headerFontSize";
	//type:string
	//default:#FF000000
	public static final String HEADER_FONT_COLOR="headerFontColor";
	//type:string
	//value options: 'italic | normal'
	//default:normal
	public static final String HEADER_FONT_STYLE="headerFontStyle";
	//type:string
	//value options:'bold | normal'
	//default:normal	
	public static final String HEADER_FONT_WEIGHT="headerFontWeight";
	//type:string
	//value options: 'left | center | right'
	//default:center	
	public static final String HEADER_FONT_ALIGHT="headerFontAlight";
	//type:string 
	//value options: 'underline | none'
	//default:none	
	public static final String HEADER_FONT_DECORATION="headerFontDecoration";
	//TODO not yet
//	public static final String HEADER_FONT_FAMILY="headerFontFamily";   
//	public static final String HEADER_FONT_THICKNESS="headerFontThickness";

	//--------column cell style ------------
	//type:int
	//default:20
	public static final String FONT_SIZE="fontSize";
	//type:string
	//default:#FF000000	
	public static final String FONT_COLOR="fontColor";
	//type:string
	//value options: 'italic | normal'
	//default:normal	
	public static final String FONT_STYLE="fontStyle";
	//type:string
	//value options:'bold | normal'
	//default:normal		
	public static final String FONT_WEIGHT="fontWeight";
	//type:string
	//value options: 'left | center | right'
	//default:center		
	public static final String FONT_ALIGHT="fontAlight";
	//type:string 
	//value options: 'underline | none'
	//default:none		
	public static final String FONT_DECORATION="fontDecoration";
	
	//--------header and column render ------------
	//type:string
	//value options: 'default | action | status | checkBox | combination'
	//'default'      -- just for text label
	//'action'       -- column has buttons, can do edit, delete, view details....
	//'status'       -- some status for item. not yet //TODO
	//'checkBox'     -- column has checkBox. can select more items and delete or do something for them.....
	//'combination'  -- the custom column. please check 'mark1', look at below.
	//default: 'default'
	public static final String HEADER_RENDERER="headerRenderer";
	public static final String ITEM_RENDERER="itemRenderer";

	
	//--------action column. the column renderer is 'action' ------------
	//need showing edit, view and delete button in action column?
	//tyep:boolean
	//defalt:true
	public static final String DOEDIT_ACTION="doEditAction";
	public static final String DOVIEW_ACTION="doViewAction";
	public static final String DODELETE_ACTION="doDeleteAction";
	//TODO not yet
	public static final String DOCUSTOM_ACTION="doCustomAction";

	
    /*   mark1: combination item.
     *   1.combination column. the List structure used.
     *   2.combination cell. the view panel used.
    ___________________________________________________
    |                                                  |
    |  ~~~~~~~~~~~~                                    |
    |  |          |   #################################|
    |  | image    |     textContent          #right    |
    |  |          |                          #content  |
    |  |          |   #################################|
    |  ~~~~~~~~~~~~                                    |
    |  ################################################|
    |                   footerContent                  |
    |  ################################################|
    |__________________________________________________|

	*/
	//-------------- combination item------------------
	//type:boolean---
	//default:true
	//if true must include CONTENT_TEMPLATE element
	public static final String SHOW_TEXT_CONTENT="showTextContent";
	//default:false
	//if true must include RIGHT_TEMPLATE element
	public static final String SHOW_RIGHT_CONTENT="showRightContent";
	//if true must include FOOTER_TEMPLATE element
	public static final String SHOW_FOOTER_CONTENT="showFooterContent";
	//if true must include LEFT_IMAGE_TEMPLATE element
	public static final String SHOW_LEFT_IMAGE="showLeftImage";
	
	/*************************************/
	//IMAGE_URL_FILED element's attribute. 
	//The Combination column's subelement.
	/*************************************/	
	//type:string
	//requirement. no default value. can't be null or empty.
	//option value: value in DATAFIELDS. if DATAFIELDS is [id,name,photo,image],
	//              then IMAGE_URL_FILED's value can be 'id', 'name', 'photo' or 'image'
	public static final String IMAGE_URL_FILED="imageURLFiled";

	

	/*************************************/
	//panel item element's attribute. 
	/*************************************/	
	//type:string
	//default:''
	public static final String ITEM_LABEL = "label";
	//type:string
	//requirement. no default value. can't be null or empty.
	//when send parameter to server, the server side get data use key. 
	public static final String ITEM_KEY = "key";
	//type:string
	//default:''
	public static final String ITEM_REMARK = "remark";
	//type:string
	//value options: 'text | radio | checkBox' //TODO 'date' and more will be coming soon 
	//default:'text'
	public static final String ITEM_TYPE = "type";
	//type:array
	//like [male,female]
	public static final String ITEM_OPTIONS = "options";
	//type:string
	//value option: value in ITEM_OPTIONS. if ITEM_OPTIONS is [male,female],
	//              then ITEM_DEFAULT_VALUE's value can be 'male' or 'female'
	//default:''
	public static final String ITEM_DEFAULT_VALUE = "defaultValue";	
	//type:array
	//value option: value in ITEM_OPTIONS. can be [male], [female] or[male,female]
	//when default value has more, like if item type is checkBox, then used.
	public static final String ITEM_DEFAULT_VALUES = "defaultValues";

	//TODO use custom icons. not yet
	public static final String USE_EXT_SEARCH_ICON="useExtEditActionIcon";
	public static final String USE_EXT_VIEW_ACTIONICON="useExtViewActionIcon";
	public static final String USE_EXT_DELETE_ACTIONICON="useExtDeleteActionIcon";
	public static final String USE_EXT_CUSTOM_ACTIONICON="useExtCustomActionIcon";
	

	/***********************************************************************************************/
	//The dynamic prefix. when save the structure element used.
	/***********************************************************************************************/
	/*************************************/
	/* item and column start and end index
	/*************************************/
	//if COLUMN_END_INDEX is 1003, that means has three column: 1000 ~ 1003
	public static final int COLUMN_START_INDEX= 1000;
	public static final String COLUMN_END_INDEX="columnEndIndex";

	//if SEARCH_PANEL_ITEM_EDN_INDEX is 1003, that means search panel has three item: 1000 ~ 1003
	public static final int SEARCH_ITEM_START_INDEX= 2000;
	public static final String SEARCH_PANEL_ITEM_EDN_INDEX="searchPanelItemeEndIndex";
	
	//if ADDED_PANEL_ITEM_EDN_INDEX is 1003, that means added panel has three item: 1000 ~ 1003
	public static final int ADDED_ITEM_START_INDEX= 3000;
	public static final String ADDED_PANEL_ITEM_EDN_INDEX="addedPanelItemEndIndex";
	
	//if EDIT_PANEL_ITEM_EDN_INDEX is 1003, that means edit panel has three item: 1000 ~ 1003
	public static final int EDITI_ITEM_START_INDEX= 4000;
	public static final String EDIT_PANEL_ITEM_EDN_INDEX="editPanelItemEndIndex";

	/***********************************************************************************************/
	//report structure file URL
	/***********************************************************************************************/
	public static final String REPORT_STRUCT_URL="reportStructURL";
}
