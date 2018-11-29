package com.beardedhen.androidbootstrap.font;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

import androidx.annotation.StringDef;

/**
 * Maps FontAwesome Icon Codes to unicode characters, allowing its use in AwesomeTextView.
 * See the <a href="https://fontawesome.com/cheatsheet">Cheatsheet</a> for icon
 * code reference. <b>Please note that icon codes use underscores rather than hyphens in this
 * library.</b> For example, "fa-play" would become "fa_play". This is due to restrictions in how
 * Android Attributes can be named.
 */
public class FontAwesome implements IconSet {

    public static final String FONT_PATH = "fa-solid-v550.ttf";

    @Override
    public CharSequence unicodeForKey(@Icon CharSequence key) {
        return ICON_MAP.get(key);
    }

    @Override
    public CharSequence iconCodeForAttrIndex(int index) {
        return ATTR_MAP.get(index);
    }

    @Override
    public CharSequence fontPath() {
        return FONT_PATH;
    }

    private static final Map<String, String>  ICON_MAP = new HashMap<>();
    private static final Map<Integer, String> ATTR_MAP = new HashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({
            FA_AD,
            FA_ADDRESS_BOOK,
            FA_ADDRESS_CARD,
            FA_ADJUST,
            FA_AIR_FRESHENER,
            FA_ALIGN_CENTER,
            FA_ALIGN_JUSTIFY,
            FA_ALIGN_LEFT,
            FA_ALIGN_RIGHT,
            FA_ALLERGIES,
            FA_AMBULANCE,
            FA_AMERICAN_SIGN_LANGUAGE_INTERPRETING,
            FA_ANCHOR,
            FA_ANGLE_DOUBLE_DOWN,
            FA_ANGLE_DOUBLE_LEFT,
            FA_ANGLE_DOUBLE_RIGHT,
            FA_ANGLE_DOUBLE_UP,
            FA_ANGLE_DOWN,
            FA_ANGLE_LEFT,
            FA_ANGLE_RIGHT,
            FA_ANGLE_UP,
            FA_ANGRY,
            FA_ANKH,
            FA_APPLE_ALT,
            FA_ARCHIVE,
            FA_ARCHWAY,
            FA_ARROW_ALT_CIRCLE_DOWN,
            FA_ARROW_ALT_CIRCLE_LEFT,
            FA_ARROW_ALT_CIRCLE_RIGHT,
            FA_ARROW_ALT_CIRCLE_UP,
            FA_ARROW_CIRCLE_DOWN,
            FA_ARROW_CIRCLE_LEFT,
            FA_ARROW_CIRCLE_RIGHT,
            FA_ARROW_CIRCLE_UP,
            FA_ARROW_DOWN,
            FA_ARROW_LEFT,
            FA_ARROW_RIGHT,
            FA_ARROW_UP,
            FA_ARROWS_ALT,
            FA_ARROWS_ALT_H,
            FA_ARROWS_ALT_V,
            FA_ASSISTIVE_LISTENING_SYSTEMS,
            FA_ASTERISK,
            FA_AT,
            FA_ATLAS,
            FA_ATOM,
            FA_AUDIO_DESCRIPTION,
            FA_AWARD,
            FA_BACKSPACE,
            FA_BACKWARD,
            FA_BALANCE_SCALE,
            FA_BAN,
            FA_BAND_AID,
            FA_BARCODE,
            FA_BARS,
            FA_BASEBALL_BALL,
            FA_BASKETBALL_BALL,
            FA_BATH,
            FA_BATTERY_EMPTY,
            FA_BATTERY_FULL,
            FA_BATTERY_HALF,
            FA_BATTERY_QUARTER,
            FA_BATTERY_THREE_QUARTERS,
            FA_BED,
            FA_BEER,
            FA_BELL,
            FA_BELL_SLASH,
            FA_BEZIER_CURVE,
            FA_BIBLE,
            FA_BICYCLE,
            FA_BINOCULARS,
            FA_BIRTHDAY_CAKE,
            FA_BLENDER,
            FA_BLENDER_PHONE,
            FA_BLIND,
            FA_BOLD,
            FA_BOLT,
            FA_BOMB,
            FA_BONE,
            FA_BONG,
            FA_BOOK,
            FA_BOOK_DEAD,
            FA_BOOK_OPEN,
            FA_BOOK_READER,
            FA_BOOKMARK,
            FA_BOWLING_BALL,
            FA_BOX,
            FA_BOX_OPEN,
            FA_BOXES,
            FA_BRAILLE,
            FA_BRAIN,
            FA_BRIEFCASE,
            FA_BRIEFCASE_MEDICAL,
            FA_BROADCAST_TOWER,
            FA_BROOM,
            FA_BRUSH,
            FA_BUG,
            FA_BUILDING,
            FA_BULLHORN,
            FA_BULLSEYE,
            FA_BURN,
            FA_BUS,
            FA_BUS_ALT,
            FA_BUSINESS_TIME,
            FA_CALCULATOR,
            FA_CALENDAR,
            FA_CALENDAR_ALT,
            FA_CALENDAR_CHECK,
            FA_CALENDAR_MINUS,
            FA_CALENDAR_PLUS,
            FA_CALENDAR_TIMES,
            FA_CAMERA,
            FA_CAMERA_RETRO,
            FA_CAMPGROUND,
            FA_CANNABIS,
            FA_CAPSULES,
            FA_CAR,
            FA_CAR_ALT,
            FA_CAR_BATTERY,
            FA_CAR_CRASH,
            FA_CAR_SIDE,
            FA_CARET_DOWN,
            FA_CARET_LEFT,
            FA_CARET_RIGHT,
            FA_CARET_SQUARE_DOWN,
            FA_CARET_SQUARE_LEFT,
            FA_CARET_SQUARE_RIGHT,
            FA_CARET_SQUARE_UP,
            FA_CARET_UP,
            FA_CART_ARROW_DOWN,
            FA_CART_PLUS,
            FA_CAT,
            FA_CERTIFICATE,
            FA_CHAIR,
            FA_CHALKBOARD,
            FA_CHALKBOARD_TEACHER,
            FA_CHARGING_STATION,
            FA_CHART_AREA,
            FA_CHART_BAR,
            FA_CHART_LINE,
            FA_CHART_PIE,
            FA_CHECK,
            FA_CHECK_CIRCLE,
            FA_CHECK_DOUBLE,
            FA_CHECK_SQUARE,
            FA_CHESS,
            FA_CHESS_BISHOP,
            FA_CHESS_BOARD,
            FA_CHESS_KING,
            FA_CHESS_KNIGHT,
            FA_CHESS_PAWN,
            FA_CHESS_QUEEN,
            FA_CHESS_ROOK,
            FA_CHEVRON_CIRCLE_DOWN,
            FA_CHEVRON_CIRCLE_LEFT,
            FA_CHEVRON_CIRCLE_RIGHT,
            FA_CHEVRON_CIRCLE_UP,
            FA_CHEVRON_DOWN,
            FA_CHEVRON_LEFT,
            FA_CHEVRON_RIGHT,
            FA_CHEVRON_UP,
            FA_CHILD,
            FA_CHURCH,
            FA_CIRCLE,
            FA_CIRCLE_NOTCH,
            FA_CITY,
            FA_CLIPBOARD,
            FA_CLIPBOARD_CHECK,
            FA_CLIPBOARD_LIST,
            FA_CLOCK,
            FA_CLONE,
            FA_CLOSED_CAPTIONING,
            FA_CLOUD,
            FA_CLOUD_DOWNLOAD_ALT,
            FA_CLOUD_MEATBALL,
            FA_CLOUD_MOON,
            FA_CLOUD_MOON_RAIN,
            FA_CLOUD_RAIN,
            FA_CLOUD_SHOWERS_HEAVY,
            FA_CLOUD_SUN,
            FA_CLOUD_SUN_RAIN,
            FA_CLOUD_UPLOAD_ALT,
            FA_COCKTAIL,
            FA_CODE,
            FA_CODE_BRANCH,
            FA_COFFEE,
            FA_COG,
            FA_COGS,
            FA_COINS,
            FA_COLUMNS,
            FA_COMMENT,
            FA_COMMENT_ALT,
            FA_COMMENT_DOLLAR,
            FA_COMMENT_DOTS,
            FA_COMMENT_SLASH,
            FA_COMMENTS,
            FA_COMMENTS_DOLLAR,
            FA_COMPACT_DISC,
            FA_COMPASS,
            FA_COMPRESS,
            FA_CONCIERGE_BELL,
            FA_COOKIE,
            FA_COOKIE_BITE,
            FA_COPY,
            FA_COPYRIGHT,
            FA_COUCH,
            FA_CREDIT_CARD,
            FA_CROP,
            FA_CROP_ALT,
            FA_CROSS,
            FA_CROSSHAIRS,
            FA_CROW,
            FA_CROWN,
            FA_CUBE,
            FA_CUBES,
            FA_CUT,
            FA_DATABASE,
            FA_DEAF,
            FA_DEMOCRAT,
            FA_DESKTOP,
            FA_DHARMACHAKRA,
            FA_DIAGNOSES,
            FA_DICE,
            FA_DICE_D20,
            FA_DICE_D6,
            FA_DICE_FIVE,
            FA_DICE_FOUR,
            FA_DICE_ONE,
            FA_DICE_SIX,
            FA_DICE_THREE,
            FA_DICE_TWO,
            FA_DIGITAL_TACHOGRAPH,
            FA_DIRECTIONS,
            FA_DIVIDE,
            FA_DIZZY,
            FA_DNA,
            FA_DOG,
            FA_DOLLAR_SIGN,
            FA_DOLLY,
            FA_DOLLY_FLATBED,
            FA_DONATE,
            FA_DOOR_CLOSED,
            FA_DOOR_OPEN,
            FA_DOT_CIRCLE,
            FA_DOVE,
            FA_DOWNLOAD,
            FA_DRAFTING_COMPASS,
            FA_DRAGON,
            FA_DRAW_POLYGON,
            FA_DRUM,
            FA_DRUM_STEELPAN,
            FA_DRUMSTICK_BITE,
            FA_DUMBBELL,
            FA_DUNGEON,
            FA_EDIT,
            FA_EJECT,
            FA_ELLIPSIS_H,
            FA_ELLIPSIS_V,
            FA_ENVELOPE,
            FA_ENVELOPE_OPEN,
            FA_ENVELOPE_OPEN_TEXT,
            FA_ENVELOPE_SQUARE,
            FA_EQUALS,
            FA_ERASER,
            FA_EURO_SIGN,
            FA_EXCHANGE_ALT,
            FA_EXCLAMATION,
            FA_EXCLAMATION_CIRCLE,
            FA_EXCLAMATION_TRIANGLE,
            FA_EXPAND,
            FA_EXPAND_ARROWS_ALT,
            FA_EXTERNAL_LINK_ALT,
            FA_EXTERNAL_LINK_SQUARE_ALT,
            FA_EYE,
            FA_EYE_DROPPER,
            FA_EYE_SLASH,
            FA_FAST_BACKWARD,
            FA_FAST_FORWARD,
            FA_FAX,
            FA_FEATHER,
            FA_FEATHER_ALT,
            FA_FEMALE,
            FA_FIGHTER_JET,
            FA_FILE,
            FA_FILE_ALT,
            FA_FILE_ARCHIVE,
            FA_FILE_AUDIO,
            FA_FILE_CODE,
            FA_FILE_CONTRACT,
            FA_FILE_CSV,
            FA_FILE_DOWNLOAD,
            FA_FILE_EXCEL,
            FA_FILE_EXPORT,
            FA_FILE_IMAGE,
            FA_FILE_IMPORT,
            FA_FILE_INVOICE,
            FA_FILE_INVOICE_DOLLAR,
            FA_FILE_MEDICAL,
            FA_FILE_MEDICAL_ALT,
            FA_FILE_PDF,
            FA_FILE_POWERPOINT,
            FA_FILE_PRESCRIPTION,
            FA_FILE_SIGNATURE,
            FA_FILE_UPLOAD,
            FA_FILE_VIDEO,
            FA_FILE_WORD,
            FA_FILL,
            FA_FILL_DRIP,
            FA_FILM,
            FA_FILTER,
            FA_FINGERPRINT,
            FA_FIRE,
            FA_FIRE_EXTINGUISHER,
            FA_FIRST_AID,
            FA_FISH,
            FA_FIST_RAISED,
            FA_FLAG,
            FA_FLAG_CHECKERED,
            FA_FLAG_USA,
            FA_FLASK,
            FA_FLUSHED,
            FA_FOLDER,
            FA_FOLDER_MINUS,
            FA_FOLDER_OPEN,
            FA_FOLDER_PLUS,
            FA_FONT,
            FA_FOOTBALL_BALL,
            FA_FORWARD,
            FA_FROG,
            FA_FROWN,
            FA_FROWN_OPEN,
            FA_FUNNEL_DOLLAR,
            FA_FUTBOL,
            FA_GAMEPAD,
            FA_GAS_PUMP,
            FA_GAVEL,
            FA_GEM,
            FA_GENDERLESS,
            FA_GHOST,
            FA_GIFT,
            FA_GLASS_MARTINI,
            FA_GLASS_MARTINI_ALT,
            FA_GLASSES,
            FA_GLOBE,
            FA_GLOBE_AFRICA,
            FA_GLOBE_AMERICAS,
            FA_GLOBE_ASIA,
            FA_GOLF_BALL,
            FA_GOPURAM,
            FA_GRADUATION_CAP,
            FA_GREATER_THAN,
            FA_GREATER_THAN_EQUAL,
            FA_GRIMACE,
            FA_GRIN,
            FA_GRIN_ALT,
            FA_GRIN_BEAM,
            FA_GRIN_BEAM_SWEAT,
            FA_GRIN_HEARTS,
            FA_GRIN_SQUINT,
            FA_GRIN_SQUINT_TEARS,
            FA_GRIN_STARS,
            FA_GRIN_TEARS,
            FA_GRIN_TONGUE,
            FA_GRIN_TONGUE_SQUINT,
            FA_GRIN_TONGUE_WINK,
            FA_GRIN_WINK,
            FA_GRIP_HORIZONTAL,
            FA_GRIP_VERTICAL,
            FA_H_SQUARE,
            FA_HAMMER,
            FA_HAMSA,
            FA_HAND_HOLDING,
            FA_HAND_HOLDING_HEART,
            FA_HAND_HOLDING_USD,
            FA_HAND_LIZARD,
            FA_HAND_PAPER,
            FA_HAND_PEACE,
            FA_HAND_POINT_DOWN,
            FA_HAND_POINT_LEFT,
            FA_HAND_POINT_RIGHT,
            FA_HAND_POINT_UP,
            FA_HAND_POINTER,
            FA_HAND_ROCK,
            FA_HAND_SCISSORS,
            FA_HAND_SPOCK,
            FA_HANDS,
            FA_HANDS_HELPING,
            FA_HANDSHAKE,
            FA_HANUKIAH,
            FA_HASHTAG,
            FA_HAT_WIZARD,
            FA_HAYKAL,
            FA_HDD,
            FA_HEADING,
            FA_HEADPHONES,
            FA_HEADPHONES_ALT,
            FA_HEADSET,
            FA_HEART,
            FA_HEARTBEAT,
            FA_HELICOPTER,
            FA_HIGHLIGHTER,
            FA_HIKING,
            FA_HIPPO,
            FA_HISTORY,
            FA_HOCKEY_PUCK,
            FA_HOME,
            FA_HORSE,
            FA_HOSPITAL,
            FA_HOSPITAL_ALT,
            FA_HOSPITAL_SYMBOL,
            FA_HOT_TUB,
            FA_HOTEL,
            FA_HOURGLASS,
            FA_HOURGLASS_END,
            FA_HOURGLASS_HALF,
            FA_HOURGLASS_START,
            FA_HOUSE_DAMAGE,
            FA_HRYVNIA,
            FA_I_CURSOR,
            FA_ID_BADGE,
            FA_ID_CARD,
            FA_ID_CARD_ALT,
            FA_IMAGE,
            FA_IMAGES,
            FA_INBOX,
            FA_INDENT,
            FA_INDUSTRY,
            FA_INFINITY,
            FA_INFO,
            FA_INFO_CIRCLE,
            FA_ITALIC,
            FA_JEDI,
            FA_JOINT,
            FA_JOURNAL_WHILLS,
            FA_KAABA,
            FA_KEY,
            FA_KEYBOARD,
            FA_KHANDA,
            FA_KISS,
            FA_KISS_BEAM,
            FA_KISS_WINK_HEART,
            FA_KIWI_BIRD,
            FA_LANDMARK,
            FA_LANGUAGE,
            FA_LAPTOP,
            FA_LAPTOP_CODE,
            FA_LAUGH,
            FA_LAUGH_BEAM,
            FA_LAUGH_SQUINT,
            FA_LAUGH_WINK,
            FA_LAYER_GROUP,
            FA_LEAF,
            FA_LEMON,
            FA_LESS_THAN,
            FA_LESS_THAN_EQUAL,
            FA_LEVEL_DOWN_ALT,
            FA_LEVEL_UP_ALT,
            FA_LIFE_RING,
            FA_LIGHTBULB,
            FA_LINK,
            FA_LIRA_SIGN,
            FA_LIST,
            FA_LIST_ALT,
            FA_LIST_OL,
            FA_LIST_UL,
            FA_LOCATION_ARROW,
            FA_LOCK,
            FA_LOCK_OPEN,
            FA_LONG_ARROW_ALT_DOWN,
            FA_LONG_ARROW_ALT_LEFT,
            FA_LONG_ARROW_ALT_RIGHT,
            FA_LONG_ARROW_ALT_UP,
            FA_LOW_VISION,
            FA_LUGGAGE_CART,
            FA_MAGIC,
            FA_MAGNET,
            FA_MAIL_BULK,
            FA_MALE,
            FA_MAP,
            FA_MAP_MARKED,
            FA_MAP_MARKED_ALT,
            FA_MAP_MARKER,
            FA_MAP_MARKER_ALT,
            FA_MAP_PIN,
            FA_MAP_SIGNS,
            FA_MARKER,
            FA_MARS,
            FA_MARS_DOUBLE,
            FA_MARS_STROKE,
            FA_MARS_STROKE_H,
            FA_MARS_STROKE_V,
            FA_MASK,
            FA_MEDAL,
            FA_MEDKIT,
            FA_MEH,
            FA_MEH_BLANK,
            FA_MEH_ROLLING_EYES,
            FA_MEMORY,
            FA_MENORAH,
            FA_MERCURY,
            FA_METEOR,
            FA_MICROCHIP,
            FA_MICROPHONE,
            FA_MICROPHONE_ALT,
            FA_MICROPHONE_ALT_SLASH,
            FA_MICROPHONE_SLASH,
            FA_MICROSCOPE,
            FA_MINUS,
            FA_MINUS_CIRCLE,
            FA_MINUS_SQUARE,
            FA_MOBILE,
            FA_MOBILE_ALT,
            FA_MONEY_BILL,
            FA_MONEY_BILL_ALT,
            FA_MONEY_BILL_WAVE,
            FA_MONEY_BILL_WAVE_ALT,
            FA_MONEY_CHECK,
            FA_MONEY_CHECK_ALT,
            FA_MONUMENT,
            FA_MOON,
            FA_MORTAR_PESTLE,
            FA_MOSQUE,
            FA_MOTORCYCLE,
            FA_MOUNTAIN,
            FA_MOUSE_POINTER,
            FA_MUSIC,
            FA_NETWORK_WIRED,
            FA_NEUTER,
            FA_NEWSPAPER,
            FA_NOT_EQUAL,
            FA_NOTES_MEDICAL,
            FA_OBJECT_GROUP,
            FA_OBJECT_UNGROUP,
            FA_OIL_CAN,
            FA_OM,
            FA_OTTER,
            FA_OUTDENT,
            FA_PAINT_BRUSH,
            FA_PAINT_ROLLER,
            FA_PALETTE,
            FA_PALLET,
            FA_PAPER_PLANE,
            FA_PAPERCLIP,
            FA_PARACHUTE_BOX,
            FA_PARAGRAPH,
            FA_PARKING,
            FA_PASSPORT,
            FA_PASTAFARIANISM,
            FA_PASTE,
            FA_PAUSE,
            FA_PAUSE_CIRCLE,
            FA_PAW,
            FA_PEACE,
            FA_PEN,
            FA_PEN_ALT,
            FA_PEN_FANCY,
            FA_PEN_NIB,
            FA_PEN_SQUARE,
            FA_PENCIL_ALT,
            FA_PENCIL_RULER,
            FA_PEOPLE_CARRY,
            FA_PERCENT,
            FA_PERCENTAGE,
            FA_PERSON_BOOTH,
            FA_PHONE,
            FA_PHONE_SLASH,
            FA_PHONE_SQUARE,
            FA_PHONE_VOLUME,
            FA_PIGGY_BANK,
            FA_PILLS,
            FA_PLACE_OF_WORSHIP,
            FA_PLANE,
            FA_PLANE_ARRIVAL,
            FA_PLANE_DEPARTURE,
            FA_PLAY,
            FA_PLAY_CIRCLE,
            FA_PLUG,
            FA_PLUS,
            FA_PLUS_CIRCLE,
            FA_PLUS_SQUARE,
            FA_PODCAST,
            FA_POLL,
            FA_POLL_H,
            FA_POO,
            FA_POO_STORM,
            FA_POOP,
            FA_PORTRAIT,
            FA_POUND_SIGN,
            FA_POWER_OFF,
            FA_PRAY,
            FA_PRAYING_HANDS,
            FA_PRESCRIPTION,
            FA_PRESCRIPTION_BOTTLE,
            FA_PRESCRIPTION_BOTTLE_ALT,
            FA_PRINT,
            FA_PROCEDURES,
            FA_PROJECT_DIAGRAM,
            FA_PUZZLE_PIECE,
            FA_QRCODE,
            FA_QUESTION,
            FA_QUESTION_CIRCLE,
            FA_QUIDDITCH,
            FA_QUOTE_LEFT,
            FA_QUOTE_RIGHT,
            FA_QURAN,
            FA_RAINBOW,
            FA_RANDOM,
            FA_RECEIPT,
            FA_RECYCLE,
            FA_REDO,
            FA_REDO_ALT,
            FA_REGISTERED,
            FA_REPLY,
            FA_REPLY_ALL,
            FA_REPUBLICAN,
            FA_RETWEET,
            FA_RIBBON,
            FA_RING,
            FA_ROAD,
            FA_ROBOT,
            FA_ROCKET,
            FA_ROUTE,
            FA_RSS,
            FA_RSS_SQUARE,
            FA_RUBLE_SIGN,
            FA_RULER,
            FA_RULER_COMBINED,
            FA_RULER_HORIZONTAL,
            FA_RULER_VERTICAL,
            FA_RUNNING,
            FA_RUPEE_SIGN,
            FA_SAD_CRY,
            FA_SAD_TEAR,
            FA_SAVE,
            FA_SCHOOL,
            FA_SCREWDRIVER,
            FA_SCROLL,
            FA_SEARCH,
            FA_SEARCH_DOLLAR,
            FA_SEARCH_LOCATION,
            FA_SEARCH_MINUS,
            FA_SEARCH_PLUS,
            FA_SEEDLING,
            FA_SERVER,
            FA_SHAPES,
            FA_SHARE,
            FA_SHARE_ALT,
            FA_SHARE_ALT_SQUARE,
            FA_SHARE_SQUARE,
            FA_SHEKEL_SIGN,
            FA_SHIELD_ALT,
            FA_SHIP,
            FA_SHIPPING_FAST,
            FA_SHOE_PRINTS,
            FA_SHOPPING_BAG,
            FA_SHOPPING_BASKET,
            FA_SHOPPING_CART,
            FA_SHOWER,
            FA_SHUTTLE_VAN,
            FA_SIGN,
            FA_SIGN_IN_ALT,
            FA_SIGN_LANGUAGE,
            FA_SIGN_OUT_ALT,
            FA_SIGNAL,
            FA_SIGNATURE,
            FA_SITEMAP,
            FA_SKULL,
            FA_SKULL_CROSSBONES,
            FA_SLASH,
            FA_SLIDERS_H,
            FA_SMILE,
            FA_SMILE_BEAM,
            FA_SMILE_WINK,
            FA_SMOG,
            FA_SMOKING,
            FA_SMOKING_BAN,
            FA_SNOWFLAKE,
            FA_SOCKS,
            FA_SOLAR_PANEL,
            FA_SORT,
            FA_SORT_ALPHA_DOWN,
            FA_SORT_ALPHA_UP,
            FA_SORT_AMOUNT_DOWN,
            FA_SORT_AMOUNT_UP,
            FA_SORT_DOWN,
            FA_SORT_NUMERIC_DOWN,
            FA_SORT_NUMERIC_UP,
            FA_SORT_UP,
            FA_SPA,
            FA_SPACE_SHUTTLE,
            FA_SPIDER,
            FA_SPINNER,
            FA_SPLOTCH,
            FA_SPRAY_CAN,
            FA_SQUARE,
            FA_SQUARE_FULL,
            FA_SQUARE_ROOT_ALT,
            FA_STAMP,
            FA_STAR,
            FA_STAR_AND_CRESCENT,
            FA_STAR_HALF,
            FA_STAR_HALF_ALT,
            FA_STAR_OF_DAVID,
            FA_STAR_OF_LIFE,
            FA_STEP_BACKWARD,
            FA_STEP_FORWARD,
            FA_STETHOSCOPE,
            FA_STICKY_NOTE,
            FA_STOP,
            FA_STOP_CIRCLE,
            FA_STOPWATCH,
            FA_STORE,
            FA_STORE_ALT,
            FA_STREAM,
            FA_STREET_VIEW,
            FA_STRIKETHROUGH,
            FA_STROOPWAFEL,
            FA_SUBSCRIPT,
            FA_SUBWAY,
            FA_SUITCASE,
            FA_SUITCASE_ROLLING,
            FA_SUN,
            FA_SUPERSCRIPT,
            FA_SURPRISE,
            FA_SWATCHBOOK,
            FA_SWIMMER,
            FA_SWIMMING_POOL,
            FA_SYNAGOGUE,
            FA_SYNC,
            FA_SYNC_ALT,
            FA_SYRINGE,
            FA_TABLE,
            FA_TABLE_TENNIS,
            FA_TABLET,
            FA_TABLET_ALT,
            FA_TABLETS,
            FA_TACHOMETER_ALT,
            FA_TAG,
            FA_TAGS,
            FA_TAPE,
            FA_TASKS,
            FA_TAXI,
            FA_TEETH,
            FA_TEETH_OPEN,
            FA_TEMPERATURE_HIGH,
            FA_TEMPERATURE_LOW,
            FA_TERMINAL,
            FA_TEXT_HEIGHT,
            FA_TEXT_WIDTH,
            FA_TH,
            FA_TH_LARGE,
            FA_TH_LIST,
            FA_THEATER_MASKS,
            FA_THERMOMETER,
            FA_THERMOMETER_EMPTY,
            FA_THERMOMETER_FULL,
            FA_THERMOMETER_HALF,
            FA_THERMOMETER_QUARTER,
            FA_THERMOMETER_THREE_QUARTERS,
            FA_THUMBS_DOWN,
            FA_THUMBS_UP,
            FA_THUMBTACK,
            FA_TICKET_ALT,
            FA_TIMES,
            FA_TIMES_CIRCLE,
            FA_TINT,
            FA_TINT_SLASH,
            FA_TIRED,
            FA_TOGGLE_OFF,
            FA_TOGGLE_ON,
            FA_TOILET_PAPER,
            FA_TOOLBOX,
            FA_TOOTH,
            FA_TORAH,
            FA_TORII_GATE,
            FA_TRACTOR,
            FA_TRADEMARK,
            FA_TRAFFIC_LIGHT,
            FA_TRAIN,
            FA_TRANSGENDER,
            FA_TRANSGENDER_ALT,
            FA_TRASH,
            FA_TRASH_ALT,
            FA_TREE,
            FA_TROPHY,
            FA_TRUCK,
            FA_TRUCK_LOADING,
            FA_TRUCK_MONSTER,
            FA_TRUCK_MOVING,
            FA_TRUCK_PICKUP,
            FA_TSHIRT,
            FA_TTY,
            FA_TV,
            FA_UMBRELLA,
            FA_UMBRELLA_BEACH,
            FA_UNDERLINE,
            FA_UNDO,
            FA_UNDO_ALT,
            FA_UNIVERSAL_ACCESS,
            FA_UNIVERSITY,
            FA_UNLINK,
            FA_UNLOCK,
            FA_UNLOCK_ALT,
            FA_UPLOAD,
            FA_USER,
            FA_USER_ALT,
            FA_USER_ALT_SLASH,
            FA_USER_ASTRONAUT,
            FA_USER_CHECK,
            FA_USER_CIRCLE,
            FA_USER_CLOCK,
            FA_USER_COG,
            FA_USER_EDIT,
            FA_USER_FRIENDS,
            FA_USER_GRADUATE,
            FA_USER_INJURED,
            FA_USER_LOCK,
            FA_USER_MD,
            FA_USER_MINUS,
            FA_USER_NINJA,
            FA_USER_PLUS,
            FA_USER_SECRET,
            FA_USER_SHIELD,
            FA_USER_SLASH,
            FA_USER_TAG,
            FA_USER_TIE,
            FA_USER_TIMES,
            FA_USERS,
            FA_USERS_COG,
            FA_UTENSIL_SPOON,
            FA_UTENSILS,
            FA_VECTOR_SQUARE,
            FA_VENUS,
            FA_VENUS_DOUBLE,
            FA_VENUS_MARS,
            FA_VIAL,
            FA_VIALS,
            FA_VIDEO,
            FA_VIDEO_SLASH,
            FA_VIHARA,
            FA_VOLLEYBALL_BALL,
            FA_VOLUME_DOWN,
            FA_VOLUME_MUTE,
            FA_VOLUME_OFF,
            FA_VOLUME_UP,
            FA_VOTE_YEA,
            FA_VR_CARDBOARD,
            FA_WALKING,
            FA_WALLET,
            FA_WAREHOUSE,
            FA_WATER,
            FA_WEIGHT,
            FA_WEIGHT_HANGING,
            FA_WHEELCHAIR,
            FA_WIFI,
            FA_WIND,
            FA_WINDOW_CLOSE,
            FA_WINDOW_MAXIMIZE,
            FA_WINDOW_MINIMIZE,
            FA_WINDOW_RESTORE,
            FA_WINE_BOTTLE,
            FA_WINE_GLASS,
            FA_WINE_GLASS_ALT,
            FA_WON_SIGN,
            FA_WRENCH,
            FA_X_RAY,
            FA_YEN_SIGN,
            FA_YIN_YANG,

    })
    public @interface Icon {
    }

    public static final String FA_AD                                  = "fa_ad";
    public static final String FA_ADDRESS_BOOK                        = "fa_address_book";
    public static final String FA_ADDRESS_CARD                        = "fa_address_card";
    public static final String FA_ADJUST                              = "fa_adjust";
    public static final String FA_AIR_FRESHENER                       = "fa_air_freshener";
    public static final String FA_ALIGN_CENTER                        = "fa_align_center";
    public static final String FA_ALIGN_JUSTIFY                       = "fa_align_justify";
    public static final String FA_ALIGN_LEFT                          = "fa_align_left";
    public static final String FA_ALIGN_RIGHT                         = "fa_align_right";
    public static final String FA_ALLERGIES                           = "fa_allergies";
    public static final String FA_AMBULANCE                           = "fa_ambulance";
    public static final String FA_AMERICAN_SIGN_LANGUAGE_INTERPRETING = "fa_american_sign_language_interpreting";
    public static final String FA_ANCHOR                              = "fa_anchor";
    public static final String FA_ANGLE_DOUBLE_DOWN                   = "fa_angle_double_down";
    public static final String FA_ANGLE_DOUBLE_LEFT                   = "fa_angle_double_left";
    public static final String FA_ANGLE_DOUBLE_RIGHT                  = "fa_angle_double_right";
    public static final String FA_ANGLE_DOUBLE_UP                     = "fa_angle_double_up";
    public static final String FA_ANGLE_DOWN                          = "fa_angle_down";
    public static final String FA_ANGLE_LEFT                          = "fa_angle_left";
    public static final String FA_ANGLE_RIGHT                         = "fa_angle_right";
    public static final String FA_ANGLE_UP                            = "fa_angle_up";
    public static final String FA_ANGRY                               = "fa_angry";
    public static final String FA_ANKH                                = "fa_ankh";
    public static final String FA_APPLE_ALT                           = "fa_apple_alt";
    public static final String FA_ARCHIVE                             = "fa_archive";
    public static final String FA_ARCHWAY                             = "fa_archway";
    public static final String FA_ARROW_ALT_CIRCLE_DOWN               = "fa_arrow_alt_circle_down";
    public static final String FA_ARROW_ALT_CIRCLE_LEFT               = "fa_arrow_alt_circle_left";
    public static final String FA_ARROW_ALT_CIRCLE_RIGHT              = "fa_arrow_alt_circle_right";
    public static final String FA_ARROW_ALT_CIRCLE_UP                 = "fa_arrow_alt_circle_up";
    public static final String FA_ARROW_CIRCLE_DOWN                   = "fa_arrow_circle_down";
    public static final String FA_ARROW_CIRCLE_LEFT                   = "fa_arrow_circle_left";
    public static final String FA_ARROW_CIRCLE_RIGHT                  = "fa_arrow_circle_right";
    public static final String FA_ARROW_CIRCLE_UP                     = "fa_arrow_circle_up";
    public static final String FA_ARROW_DOWN                          = "fa_arrow_down";
    public static final String FA_ARROW_LEFT                          = "fa_arrow_left";
    public static final String FA_ARROW_RIGHT                         = "fa_arrow_right";
    public static final String FA_ARROW_UP                            = "fa_arrow_up";
    public static final String FA_ARROWS_ALT                          = "fa_arrows_alt";
    public static final String FA_ARROWS_ALT_H                        = "fa_arrows_alt_h";
    public static final String FA_ARROWS_ALT_V                        = "fa_arrows_alt_v";
    public static final String FA_ASSISTIVE_LISTENING_SYSTEMS         = "fa_assistive_listening_systems";
    public static final String FA_ASTERISK                            = "fa_asterisk";
    public static final String FA_AT                                  = "fa_at";
    public static final String FA_ATLAS                               = "fa_atlas";
    public static final String FA_ATOM                                = "fa_atom";
    public static final String FA_AUDIO_DESCRIPTION                   = "fa_audio_description";
    public static final String FA_AWARD                               = "fa_award";
    public static final String FA_BACKSPACE                           = "fa_backspace";
    public static final String FA_BACKWARD                            = "fa_backward";
    public static final String FA_BALANCE_SCALE                       = "fa_balance_scale";
    public static final String FA_BAN                                 = "fa_ban";
    public static final String FA_BAND_AID                            = "fa_band_aid";
    public static final String FA_BARCODE                             = "fa_barcode";
    public static final String FA_BARS                                = "fa_bars";
    public static final String FA_BASEBALL_BALL                       = "fa_baseball_ball";
    public static final String FA_BASKETBALL_BALL                     = "fa_basketball_ball";
    public static final String FA_BATH                                = "fa_bath";
    public static final String FA_BATTERY_EMPTY                       = "fa_battery_empty";
    public static final String FA_BATTERY_FULL                        = "fa_battery_full";
    public static final String FA_BATTERY_HALF                        = "fa_battery_half";
    public static final String FA_BATTERY_QUARTER                     = "fa_battery_quarter";
    public static final String FA_BATTERY_THREE_QUARTERS              = "fa_battery_three_quarters";
    public static final String FA_BED                                 = "fa_bed";
    public static final String FA_BEER                                = "fa_beer";
    public static final String FA_BELL                                = "fa_bell";
    public static final String FA_BELL_SLASH                          = "fa_bell_slash";
    public static final String FA_BEZIER_CURVE                        = "fa_bezier_curve";
    public static final String FA_BIBLE                               = "fa_bible";
    public static final String FA_BICYCLE                             = "fa_bicycle";
    public static final String FA_BINOCULARS                          = "fa_binoculars";
    public static final String FA_BIRTHDAY_CAKE                       = "fa_birthday_cake";
    public static final String FA_BLENDER                             = "fa_blender";
    public static final String FA_BLENDER_PHONE                       = "fa_blender_phone";
    public static final String FA_BLIND                               = "fa_blind";
    public static final String FA_BOLD                                = "fa_bold";
    public static final String FA_BOLT                                = "fa_bolt";
    public static final String FA_BOMB                                = "fa_bomb";
    public static final String FA_BONE                                = "fa_bone";
    public static final String FA_BONG                                = "fa_bong";
    public static final String FA_BOOK                                = "fa_book";
    public static final String FA_BOOK_DEAD                           = "fa_book_dead";
    public static final String FA_BOOK_OPEN                           = "fa_book_open";
    public static final String FA_BOOK_READER                         = "fa_book_reader";
    public static final String FA_BOOKMARK                            = "fa_bookmark";
    public static final String FA_BOWLING_BALL                        = "fa_bowling_ball";
    public static final String FA_BOX                                 = "fa_box";
    public static final String FA_BOX_OPEN                            = "fa_box_open";
    public static final String FA_BOXES                               = "fa_boxes";
    public static final String FA_BRAILLE                             = "fa_braille";
    public static final String FA_BRAIN                               = "fa_brain";
    public static final String FA_BRIEFCASE                           = "fa_briefcase";
    public static final String FA_BRIEFCASE_MEDICAL                   = "fa_briefcase_medical";
    public static final String FA_BROADCAST_TOWER                     = "fa_broadcast_tower";
    public static final String FA_BROOM                               = "fa_broom";
    public static final String FA_BRUSH                               = "fa_brush";
    public static final String FA_BUG                                 = "fa_bug";
    public static final String FA_BUILDING                            = "fa_building";
    public static final String FA_BULLHORN                            = "fa_bullhorn";
    public static final String FA_BULLSEYE                            = "fa_bullseye";
    public static final String FA_BURN                                = "fa_burn";
    public static final String FA_BUS                                 = "fa_bus";
    public static final String FA_BUS_ALT                             = "fa_bus_alt";
    public static final String FA_BUSINESS_TIME                       = "fa_business_time";
    public static final String FA_CALCULATOR                          = "fa_calculator";
    public static final String FA_CALENDAR                            = "fa_calendar";
    public static final String FA_CALENDAR_ALT                        = "fa_calendar_alt";
    public static final String FA_CALENDAR_CHECK                      = "fa_calendar_check";
    public static final String FA_CALENDAR_MINUS                      = "fa_calendar_minus";
    public static final String FA_CALENDAR_PLUS                       = "fa_calendar_plus";
    public static final String FA_CALENDAR_TIMES                      = "fa_calendar_times";
    public static final String FA_CAMERA                              = "fa_camera";
    public static final String FA_CAMERA_RETRO                        = "fa_camera_retro";
    public static final String FA_CAMPGROUND                          = "fa_campground";
    public static final String FA_CANNABIS                            = "fa_cannabis";
    public static final String FA_CAPSULES                            = "fa_capsules";
    public static final String FA_CAR                                 = "fa_car";
    public static final String FA_CAR_ALT                             = "fa_car_alt";
    public static final String FA_CAR_BATTERY                         = "fa_car_battery";
    public static final String FA_CAR_CRASH                           = "fa_car_crash";
    public static final String FA_CAR_SIDE                            = "fa_car_side";
    public static final String FA_CARET_DOWN                          = "fa_caret_down";
    public static final String FA_CARET_LEFT                          = "fa_caret_left";
    public static final String FA_CARET_RIGHT                         = "fa_caret_right";
    public static final String FA_CARET_SQUARE_DOWN                   = "fa_caret_square_down";
    public static final String FA_CARET_SQUARE_LEFT                   = "fa_caret_square_left";
    public static final String FA_CARET_SQUARE_RIGHT                  = "fa_caret_square_right";
    public static final String FA_CARET_SQUARE_UP                     = "fa_caret_square_up";
    public static final String FA_CARET_UP                            = "fa_caret_up";
    public static final String FA_CART_ARROW_DOWN                     = "fa_cart_arrow_down";
    public static final String FA_CART_PLUS                           = "fa_cart_plus";
    public static final String FA_CAT                                 = "fa_cat";
    public static final String FA_CERTIFICATE                         = "fa_certificate";
    public static final String FA_CHAIR                               = "fa_chair";
    public static final String FA_CHALKBOARD                          = "fa_chalkboard";
    public static final String FA_CHALKBOARD_TEACHER                  = "fa_chalkboard_teacher";
    public static final String FA_CHARGING_STATION                    = "fa_charging_station";
    public static final String FA_CHART_AREA                          = "fa_chart_area";
    public static final String FA_CHART_BAR                           = "fa_chart_bar";
    public static final String FA_CHART_LINE                          = "fa_chart_line";
    public static final String FA_CHART_PIE                           = "fa_chart_pie";
    public static final String FA_CHECK                               = "fa_check";
    public static final String FA_CHECK_CIRCLE                        = "fa_check_circle";
    public static final String FA_CHECK_DOUBLE                        = "fa_check_double";
    public static final String FA_CHECK_SQUARE                        = "fa_check_square";
    public static final String FA_CHESS                               = "fa_chess";
    public static final String FA_CHESS_BISHOP                        = "fa_chess_bishop";
    public static final String FA_CHESS_BOARD                         = "fa_chess_board";
    public static final String FA_CHESS_KING                          = "fa_chess_king";
    public static final String FA_CHESS_KNIGHT                        = "fa_chess_knight";
    public static final String FA_CHESS_PAWN                          = "fa_chess_pawn";
    public static final String FA_CHESS_QUEEN                         = "fa_chess_queen";
    public static final String FA_CHESS_ROOK                          = "fa_chess_rook";
    public static final String FA_CHEVRON_CIRCLE_DOWN                 = "fa_chevron_circle_down";
    public static final String FA_CHEVRON_CIRCLE_LEFT                 = "fa_chevron_circle_left";
    public static final String FA_CHEVRON_CIRCLE_RIGHT                = "fa_chevron_circle_right";
    public static final String FA_CHEVRON_CIRCLE_UP                   = "fa_chevron_circle_up";
    public static final String FA_CHEVRON_DOWN                        = "fa_chevron_down";
    public static final String FA_CHEVRON_LEFT                        = "fa_chevron_left";
    public static final String FA_CHEVRON_RIGHT                       = "fa_chevron_right";
    public static final String FA_CHEVRON_UP                          = "fa_chevron_up";
    public static final String FA_CHILD                               = "fa_child";
    public static final String FA_CHURCH                              = "fa_church";
    public static final String FA_CIRCLE                              = "fa_circle";
    public static final String FA_CIRCLE_NOTCH                        = "fa_circle_notch";
    public static final String FA_CITY                                = "fa_city";
    public static final String FA_CLIPBOARD                           = "fa_clipboard";
    public static final String FA_CLIPBOARD_CHECK                     = "fa_clipboard_check";
    public static final String FA_CLIPBOARD_LIST                      = "fa_clipboard_list";
    public static final String FA_CLOCK                               = "fa_clock";
    public static final String FA_CLONE                               = "fa_clone";
    public static final String FA_CLOSED_CAPTIONING                   = "fa_closed_captioning";
    public static final String FA_CLOUD                               = "fa_cloud";
    public static final String FA_CLOUD_DOWNLOAD_ALT                  = "fa_cloud_download_alt";
    public static final String FA_CLOUD_MEATBALL                      = "fa_cloud_meatball";
    public static final String FA_CLOUD_MOON                          = "fa_cloud_moon";
    public static final String FA_CLOUD_MOON_RAIN                     = "fa_cloud_moon_rain";
    public static final String FA_CLOUD_RAIN                          = "fa_cloud_rain";
    public static final String FA_CLOUD_SHOWERS_HEAVY                 = "fa_cloud_showers_heavy";
    public static final String FA_CLOUD_SUN                           = "fa_cloud_sun";
    public static final String FA_CLOUD_SUN_RAIN                      = "fa_cloud_sun_rain";
    public static final String FA_CLOUD_UPLOAD_ALT                    = "fa_cloud_upload_alt";
    public static final String FA_COCKTAIL                            = "fa_cocktail";
    public static final String FA_CODE                                = "fa_code";
    public static final String FA_CODE_BRANCH                         = "fa_code_branch";
    public static final String FA_COFFEE                              = "fa_coffee";
    public static final String FA_COG                                 = "fa_cog";
    public static final String FA_COGS                                = "fa_cogs";
    public static final String FA_COINS                               = "fa_coins";
    public static final String FA_COLUMNS                             = "fa_columns";
    public static final String FA_COMMENT                             = "fa_comment";
    public static final String FA_COMMENT_ALT                         = "fa_comment_alt";
    public static final String FA_COMMENT_DOLLAR                      = "fa_comment_dollar";
    public static final String FA_COMMENT_DOTS                        = "fa_comment_dots";
    public static final String FA_COMMENT_SLASH                       = "fa_comment_slash";
    public static final String FA_COMMENTS                            = "fa_comments";
    public static final String FA_COMMENTS_DOLLAR                     = "fa_comments_dollar";
    public static final String FA_COMPACT_DISC                        = "fa_compact_disc";
    public static final String FA_COMPASS                             = "fa_compass";
    public static final String FA_COMPRESS                            = "fa_compress";
    public static final String FA_CONCIERGE_BELL                      = "fa_concierge_bell";
    public static final String FA_COOKIE                              = "fa_cookie";
    public static final String FA_COOKIE_BITE                         = "fa_cookie_bite";
    public static final String FA_COPY                                = "fa_copy";
    public static final String FA_COPYRIGHT                           = "fa_copyright";
    public static final String FA_COUCH                               = "fa_couch";
    public static final String FA_CREDIT_CARD                         = "fa_credit_card";
    public static final String FA_CROP                                = "fa_crop";
    public static final String FA_CROP_ALT                            = "fa_crop_alt";
    public static final String FA_CROSS                               = "fa_cross";
    public static final String FA_CROSSHAIRS                          = "fa_crosshairs";
    public static final String FA_CROW                                = "fa_crow";
    public static final String FA_CROWN                               = "fa_crown";
    public static final String FA_CUBE                                = "fa_cube";
    public static final String FA_CUBES                               = "fa_cubes";
    public static final String FA_CUT                                 = "fa_cut";
    public static final String FA_DATABASE                            = "fa_database";
    public static final String FA_DEAF                                = "fa_deaf";
    public static final String FA_DEMOCRAT                            = "fa_democrat";
    public static final String FA_DESKTOP                             = "fa_desktop";
    public static final String FA_DHARMACHAKRA                        = "fa_dharmachakra";
    public static final String FA_DIAGNOSES                           = "fa_diagnoses";
    public static final String FA_DICE                                = "fa_dice";
    public static final String FA_DICE_D20                            = "fa_dice_d20";
    public static final String FA_DICE_D6                             = "fa_dice_d6";
    public static final String FA_DICE_FIVE                           = "fa_dice_five";
    public static final String FA_DICE_FOUR                           = "fa_dice_four";
    public static final String FA_DICE_ONE                            = "fa_dice_one";
    public static final String FA_DICE_SIX                            = "fa_dice_six";
    public static final String FA_DICE_THREE                          = "fa_dice_three";
    public static final String FA_DICE_TWO                            = "fa_dice_two";
    public static final String FA_DIGITAL_TACHOGRAPH                  = "fa_digital_tachograph";
    public static final String FA_DIRECTIONS                          = "fa_directions";
    public static final String FA_DIVIDE                              = "fa_divide";
    public static final String FA_DIZZY                               = "fa_dizzy";
    public static final String FA_DNA                                 = "fa_dna";
    public static final String FA_DOG                                 = "fa_dog";
    public static final String FA_DOLLAR_SIGN                         = "fa_dollar_sign";
    public static final String FA_DOLLY                               = "fa_dolly";
    public static final String FA_DOLLY_FLATBED                       = "fa_dolly_flatbed";
    public static final String FA_DONATE                              = "fa_donate";
    public static final String FA_DOOR_CLOSED                         = "fa_door_closed";
    public static final String FA_DOOR_OPEN                           = "fa_door_open";
    public static final String FA_DOT_CIRCLE                          = "fa_dot_circle";
    public static final String FA_DOVE                                = "fa_dove";
    public static final String FA_DOWNLOAD                            = "fa_download";
    public static final String FA_DRAFTING_COMPASS                    = "fa_drafting_compass";
    public static final String FA_DRAGON                              = "fa_dragon";
    public static final String FA_DRAW_POLYGON                        = "fa_draw_polygon";
    public static final String FA_DRUM                                = "fa_drum";
    public static final String FA_DRUM_STEELPAN                       = "fa_drum_steelpan";
    public static final String FA_DRUMSTICK_BITE                      = "fa_drumstick_bite";
    public static final String FA_DUMBBELL                            = "fa_dumbbell";
    public static final String FA_DUNGEON                             = "fa_dungeon";
    public static final String FA_EDIT                                = "fa_edit";
    public static final String FA_EJECT                               = "fa_eject";
    public static final String FA_ELLIPSIS_H                          = "fa_ellipsis_h";
    public static final String FA_ELLIPSIS_V                          = "fa_ellipsis_v";
    public static final String FA_ENVELOPE                            = "fa_envelope";
    public static final String FA_ENVELOPE_OPEN                       = "fa_envelope_open";
    public static final String FA_ENVELOPE_OPEN_TEXT                  = "fa_envelope_open_text";
    public static final String FA_ENVELOPE_SQUARE                     = "fa_envelope_square";
    public static final String FA_EQUALS                              = "fa_equals";
    public static final String FA_ERASER                              = "fa_eraser";
    public static final String FA_EURO_SIGN                           = "fa_euro_sign";
    public static final String FA_EXCHANGE_ALT                        = "fa_exchange_alt";
    public static final String FA_EXCLAMATION                         = "fa_exclamation";
    public static final String FA_EXCLAMATION_CIRCLE                  = "fa_exclamation_circle";
    public static final String FA_EXCLAMATION_TRIANGLE                = "fa_exclamation_triangle";
    public static final String FA_EXPAND                              = "fa_expand";
    public static final String FA_EXPAND_ARROWS_ALT                   = "fa_expand_arrows_alt";
    public static final String FA_EXTERNAL_LINK_ALT                   = "fa_external_link_alt";
    public static final String FA_EXTERNAL_LINK_SQUARE_ALT            = "fa_external_link_square_alt";
    public static final String FA_EYE                                 = "fa_eye";
    public static final String FA_EYE_DROPPER                         = "fa_eye_dropper";
    public static final String FA_EYE_SLASH                           = "fa_eye_slash";
    public static final String FA_FAST_BACKWARD                       = "fa_fast_backward";
    public static final String FA_FAST_FORWARD                        = "fa_fast_forward";
    public static final String FA_FAX                                 = "fa_fax";
    public static final String FA_FEATHER                             = "fa_feather";
    public static final String FA_FEATHER_ALT                         = "fa_feather_alt";
    public static final String FA_FEMALE                              = "fa_female";
    public static final String FA_FIGHTER_JET                         = "fa_fighter_jet";
    public static final String FA_FILE                                = "fa_file";
    public static final String FA_FILE_ALT                            = "fa_file_alt";
    public static final String FA_FILE_ARCHIVE                        = "fa_file_archive";
    public static final String FA_FILE_AUDIO                          = "fa_file_audio";
    public static final String FA_FILE_CODE                           = "fa_file_code";
    public static final String FA_FILE_CONTRACT                       = "fa_file_contract";
    public static final String FA_FILE_CSV                            = "fa_file_csv";
    public static final String FA_FILE_DOWNLOAD                       = "fa_file_download";
    public static final String FA_FILE_EXCEL                          = "fa_file_excel";
    public static final String FA_FILE_EXPORT                         = "fa_file_export";
    public static final String FA_FILE_IMAGE                          = "fa_file_image";
    public static final String FA_FILE_IMPORT                         = "fa_file_import";
    public static final String FA_FILE_INVOICE                        = "fa_file_invoice";
    public static final String FA_FILE_INVOICE_DOLLAR                 = "fa_file_invoice_dollar";
    public static final String FA_FILE_MEDICAL                        = "fa_file_medical";
    public static final String FA_FILE_MEDICAL_ALT                    = "fa_file_medical_alt";
    public static final String FA_FILE_PDF                            = "fa_file_pdf";
    public static final String FA_FILE_POWERPOINT                     = "fa_file_powerpoint";
    public static final String FA_FILE_PRESCRIPTION                   = "fa_file_prescription";
    public static final String FA_FILE_SIGNATURE                      = "fa_file_signature";
    public static final String FA_FILE_UPLOAD                         = "fa_file_upload";
    public static final String FA_FILE_VIDEO                          = "fa_file_video";
    public static final String FA_FILE_WORD                           = "fa_file_word";
    public static final String FA_FILL                                = "fa_fill";
    public static final String FA_FILL_DRIP                           = "fa_fill_drip";
    public static final String FA_FILM                                = "fa_film";
    public static final String FA_FILTER                              = "fa_filter";
    public static final String FA_FINGERPRINT                         = "fa_fingerprint";
    public static final String FA_FIRE                                = "fa_fire";
    public static final String FA_FIRE_EXTINGUISHER                   = "fa_fire_extinguisher";
    public static final String FA_FIRST_AID                           = "fa_first_aid";
    public static final String FA_FISH                                = "fa_fish";
    public static final String FA_FIST_RAISED                         = "fa_fist_raised";
    public static final String FA_FLAG                                = "fa_flag";
    public static final String FA_FLAG_CHECKERED                      = "fa_flag_checkered";
    public static final String FA_FLAG_USA                            = "fa_flag_usa";
    public static final String FA_FLASK                               = "fa_flask";
    public static final String FA_FLUSHED                             = "fa_flushed";
    public static final String FA_FOLDER                              = "fa_folder";
    public static final String FA_FOLDER_MINUS                        = "fa_folder_minus";
    public static final String FA_FOLDER_OPEN                         = "fa_folder_open";
    public static final String FA_FOLDER_PLUS                         = "fa_folder_plus";
    public static final String FA_FONT                                = "fa_font";
    public static final String FA_FOOTBALL_BALL                       = "fa_football_ball";
    public static final String FA_FORWARD                             = "fa_forward";
    public static final String FA_FROG                                = "fa_frog";
    public static final String FA_FROWN                               = "fa_frown";
    public static final String FA_FROWN_OPEN                          = "fa_frown_open";
    public static final String FA_FUNNEL_DOLLAR                       = "fa_funnel_dollar";
    public static final String FA_FUTBOL                              = "fa_futbol";
    public static final String FA_GAMEPAD                             = "fa_gamepad";
    public static final String FA_GAS_PUMP                            = "fa_gas_pump";
    public static final String FA_GAVEL                               = "fa_gavel";
    public static final String FA_GEM                                 = "fa_gem";
    public static final String FA_GENDERLESS                          = "fa_genderless";
    public static final String FA_GHOST                               = "fa_ghost";
    public static final String FA_GIFT                                = "fa_gift";
    public static final String FA_GLASS_MARTINI                       = "fa_glass_martini";
    public static final String FA_GLASS_MARTINI_ALT                   = "fa_glass_martini_alt";
    public static final String FA_GLASSES                             = "fa_glasses";
    public static final String FA_GLOBE                               = "fa_globe";
    public static final String FA_GLOBE_AFRICA                        = "fa_globe_africa";
    public static final String FA_GLOBE_AMERICAS                      = "fa_globe_americas";
    public static final String FA_GLOBE_ASIA                          = "fa_globe_asia";
    public static final String FA_GOLF_BALL                           = "fa_golf_ball";
    public static final String FA_GOPURAM                             = "fa_gopuram";
    public static final String FA_GRADUATION_CAP                      = "fa_graduation_cap";
    public static final String FA_GREATER_THAN                        = "fa_greater_than";
    public static final String FA_GREATER_THAN_EQUAL                  = "fa_greater_than_equal";
    public static final String FA_GRIMACE                             = "fa_grimace";
    public static final String FA_GRIN                                = "fa_grin";
    public static final String FA_GRIN_ALT                            = "fa_grin_alt";
    public static final String FA_GRIN_BEAM                           = "fa_grin_beam";
    public static final String FA_GRIN_BEAM_SWEAT                     = "fa_grin_beam_sweat";
    public static final String FA_GRIN_HEARTS                         = "fa_grin_hearts";
    public static final String FA_GRIN_SQUINT                         = "fa_grin_squint";
    public static final String FA_GRIN_SQUINT_TEARS                   = "fa_grin_squint_tears";
    public static final String FA_GRIN_STARS                          = "fa_grin_stars";
    public static final String FA_GRIN_TEARS                          = "fa_grin_tears";
    public static final String FA_GRIN_TONGUE                         = "fa_grin_tongue";
    public static final String FA_GRIN_TONGUE_SQUINT                  = "fa_grin_tongue_squint";
    public static final String FA_GRIN_TONGUE_WINK                    = "fa_grin_tongue_wink";
    public static final String FA_GRIN_WINK                           = "fa_grin_wink";
    public static final String FA_GRIP_HORIZONTAL                     = "fa_grip_horizontal";
    public static final String FA_GRIP_VERTICAL                       = "fa_grip_vertical";
    public static final String FA_H_SQUARE                            = "fa_h_square";
    public static final String FA_HAMMER                              = "fa_hammer";
    public static final String FA_HAMSA                               = "fa_hamsa";
    public static final String FA_HAND_HOLDING                        = "fa_hand_holding";
    public static final String FA_HAND_HOLDING_HEART                  = "fa_hand_holding_heart";
    public static final String FA_HAND_HOLDING_USD                    = "fa_hand_holding_usd";
    public static final String FA_HAND_LIZARD                         = "fa_hand_lizard";
    public static final String FA_HAND_PAPER                          = "fa_hand_paper";
    public static final String FA_HAND_PEACE                          = "fa_hand_peace";
    public static final String FA_HAND_POINT_DOWN                     = "fa_hand_point_down";
    public static final String FA_HAND_POINT_LEFT                     = "fa_hand_point_left";
    public static final String FA_HAND_POINT_RIGHT                    = "fa_hand_point_right";
    public static final String FA_HAND_POINT_UP                       = "fa_hand_point_up";
    public static final String FA_HAND_POINTER                        = "fa_hand_pointer";
    public static final String FA_HAND_ROCK                           = "fa_hand_rock";
    public static final String FA_HAND_SCISSORS                       = "fa_hand_scissors";
    public static final String FA_HAND_SPOCK                          = "fa_hand_spock";
    public static final String FA_HANDS                               = "fa_hands";
    public static final String FA_HANDS_HELPING                       = "fa_hands_helping";
    public static final String FA_HANDSHAKE                           = "fa_handshake";
    public static final String FA_HANUKIAH                            = "fa_hanukiah";
    public static final String FA_HASHTAG                             = "fa_hashtag";
    public static final String FA_HAT_WIZARD                          = "fa_hat_wizard";
    public static final String FA_HAYKAL                              = "fa_haykal";
    public static final String FA_HDD                                 = "fa_hdd";
    public static final String FA_HEADING                             = "fa_heading";
    public static final String FA_HEADPHONES                          = "fa_headphones";
    public static final String FA_HEADPHONES_ALT                      = "fa_headphones_alt";
    public static final String FA_HEADSET                             = "fa_headset";
    public static final String FA_HEART                               = "fa_heart";
    public static final String FA_HEARTBEAT                           = "fa_heartbeat";
    public static final String FA_HELICOPTER                          = "fa_helicopter";
    public static final String FA_HIGHLIGHTER                         = "fa_highlighter";
    public static final String FA_HIKING                              = "fa_hiking";
    public static final String FA_HIPPO                               = "fa_hippo";
    public static final String FA_HISTORY                             = "fa_history";
    public static final String FA_HOCKEY_PUCK                         = "fa_hockey_puck";
    public static final String FA_HOME                                = "fa_home";
    public static final String FA_HORSE                               = "fa_horse";
    public static final String FA_HOSPITAL                            = "fa_hospital";
    public static final String FA_HOSPITAL_ALT                        = "fa_hospital_alt";
    public static final String FA_HOSPITAL_SYMBOL                     = "fa_hospital_symbol";
    public static final String FA_HOT_TUB                             = "fa_hot_tub";
    public static final String FA_HOTEL                               = "fa_hotel";
    public static final String FA_HOURGLASS                           = "fa_hourglass";
    public static final String FA_HOURGLASS_END                       = "fa_hourglass_end";
    public static final String FA_HOURGLASS_HALF                      = "fa_hourglass_half";
    public static final String FA_HOURGLASS_START                     = "fa_hourglass_start";
    public static final String FA_HOUSE_DAMAGE                        = "fa_house_damage";
    public static final String FA_HRYVNIA                             = "fa_hryvnia";
    public static final String FA_I_CURSOR                            = "fa_i_cursor";
    public static final String FA_ID_BADGE                            = "fa_id_badge";
    public static final String FA_ID_CARD                             = "fa_id_card";
    public static final String FA_ID_CARD_ALT                         = "fa_id_card_alt";
    public static final String FA_IMAGE                               = "fa_image";
    public static final String FA_IMAGES                              = "fa_images";
    public static final String FA_INBOX                               = "fa_inbox";
    public static final String FA_INDENT                              = "fa_indent";
    public static final String FA_INDUSTRY                            = "fa_industry";
    public static final String FA_INFINITY                            = "fa_infinity";
    public static final String FA_INFO                                = "fa_info";
    public static final String FA_INFO_CIRCLE                         = "fa_info_circle";
    public static final String FA_ITALIC                              = "fa_italic";
    public static final String FA_JEDI                                = "fa_jedi";
    public static final String FA_JOINT                               = "fa_joint";
    public static final String FA_JOURNAL_WHILLS                      = "fa_journal_whills";
    public static final String FA_KAABA                               = "fa_kaaba";
    public static final String FA_KEY                                 = "fa_key";
    public static final String FA_KEYBOARD                            = "fa_keyboard";
    public static final String FA_KHANDA                              = "fa_khanda";
    public static final String FA_KISS                                = "fa_kiss";
    public static final String FA_KISS_BEAM                           = "fa_kiss_beam";
    public static final String FA_KISS_WINK_HEART                     = "fa_kiss_wink_heart";
    public static final String FA_KIWI_BIRD                           = "fa_kiwi_bird";
    public static final String FA_LANDMARK                            = "fa_landmark";
    public static final String FA_LANGUAGE                            = "fa_language";
    public static final String FA_LAPTOP                              = "fa_laptop";
    public static final String FA_LAPTOP_CODE                         = "fa_laptop_code";
    public static final String FA_LAUGH                               = "fa_laugh";
    public static final String FA_LAUGH_BEAM                          = "fa_laugh_beam";
    public static final String FA_LAUGH_SQUINT                        = "fa_laugh_squint";
    public static final String FA_LAUGH_WINK                          = "fa_laugh_wink";
    public static final String FA_LAYER_GROUP                         = "fa_layer_group";
    public static final String FA_LEAF                                = "fa_leaf";
    public static final String FA_LEMON                               = "fa_lemon";
    public static final String FA_LESS_THAN                           = "fa_less_than";
    public static final String FA_LESS_THAN_EQUAL                     = "fa_less_than_equal";
    public static final String FA_LEVEL_DOWN_ALT                      = "fa_level_down_alt";
    public static final String FA_LEVEL_UP_ALT                        = "fa_level_up_alt";
    public static final String FA_LIFE_RING                           = "fa_life_ring";
    public static final String FA_LIGHTBULB                           = "fa_lightbulb";
    public static final String FA_LINK                                = "fa_link";
    public static final String FA_LIRA_SIGN                           = "fa_lira_sign";
    public static final String FA_LIST                                = "fa_list";
    public static final String FA_LIST_ALT                            = "fa_list_alt";
    public static final String FA_LIST_OL                             = "fa_list_ol";
    public static final String FA_LIST_UL                             = "fa_list_ul";
    public static final String FA_LOCATION_ARROW                      = "fa_location_arrow";
    public static final String FA_LOCK                                = "fa_lock";
    public static final String FA_LOCK_OPEN                           = "fa_lock_open";
    public static final String FA_LONG_ARROW_ALT_DOWN                 = "fa_long_arrow_alt_down";
    public static final String FA_LONG_ARROW_ALT_LEFT                 = "fa_long_arrow_alt_left";
    public static final String FA_LONG_ARROW_ALT_RIGHT                = "fa_long_arrow_alt_right";
    public static final String FA_LONG_ARROW_ALT_UP                   = "fa_long_arrow_alt_up";
    public static final String FA_LOW_VISION                          = "fa_low_vision";
    public static final String FA_LUGGAGE_CART                        = "fa_luggage_cart";
    public static final String FA_MAGIC                               = "fa_magic";
    public static final String FA_MAGNET                              = "fa_magnet";
    public static final String FA_MAIL_BULK                           = "fa_mail_bulk";
    public static final String FA_MALE                                = "fa_male";
    public static final String FA_MAP                                 = "fa_map";
    public static final String FA_MAP_MARKED                          = "fa_map_marked";
    public static final String FA_MAP_MARKED_ALT                      = "fa_map_marked_alt";
    public static final String FA_MAP_MARKER                          = "fa_map_marker";
    public static final String FA_MAP_MARKER_ALT                      = "fa_map_marker_alt";
    public static final String FA_MAP_PIN                             = "fa_map_pin";
    public static final String FA_MAP_SIGNS                           = "fa_map_signs";
    public static final String FA_MARKER                              = "fa_marker";
    public static final String FA_MARS                                = "fa_mars";
    public static final String FA_MARS_DOUBLE                         = "fa_mars_double";
    public static final String FA_MARS_STROKE                         = "fa_mars_stroke";
    public static final String FA_MARS_STROKE_H                       = "fa_mars_stroke_h";
    public static final String FA_MARS_STROKE_V                       = "fa_mars_stroke_v";
    public static final String FA_MASK                                = "fa_mask";
    public static final String FA_MEDAL                               = "fa_medal";
    public static final String FA_MEDKIT                              = "fa_medkit";
    public static final String FA_MEH                                 = "fa_meh";
    public static final String FA_MEH_BLANK                           = "fa_meh_blank";
    public static final String FA_MEH_ROLLING_EYES                    = "fa_meh_rolling_eyes";
    public static final String FA_MEMORY                              = "fa_memory";
    public static final String FA_MENORAH                             = "fa_menorah";
    public static final String FA_MERCURY                             = "fa_mercury";
    public static final String FA_METEOR                              = "fa_meteor";
    public static final String FA_MICROCHIP                           = "fa_microchip";
    public static final String FA_MICROPHONE                          = "fa_microphone";
    public static final String FA_MICROPHONE_ALT                      = "fa_microphone_alt";
    public static final String FA_MICROPHONE_ALT_SLASH                = "fa_microphone_alt_slash";
    public static final String FA_MICROPHONE_SLASH                    = "fa_microphone_slash";
    public static final String FA_MICROSCOPE                          = "fa_microscope";
    public static final String FA_MINUS                               = "fa_minus";
    public static final String FA_MINUS_CIRCLE                        = "fa_minus_circle";
    public static final String FA_MINUS_SQUARE                        = "fa_minus_square";
    public static final String FA_MOBILE                              = "fa_mobile";
    public static final String FA_MOBILE_ALT                          = "fa_mobile_alt";
    public static final String FA_MONEY_BILL                          = "fa_money_bill";
    public static final String FA_MONEY_BILL_ALT                      = "fa_money_bill_alt";
    public static final String FA_MONEY_BILL_WAVE                     = "fa_money_bill_wave";
    public static final String FA_MONEY_BILL_WAVE_ALT                 = "fa_money_bill_wave_alt";
    public static final String FA_MONEY_CHECK                         = "fa_money_check";
    public static final String FA_MONEY_CHECK_ALT                     = "fa_money_check_alt";
    public static final String FA_MONUMENT                            = "fa_monument";
    public static final String FA_MOON                                = "fa_moon";
    public static final String FA_MORTAR_PESTLE                       = "fa_mortar_pestle";
    public static final String FA_MOSQUE                              = "fa_mosque";
    public static final String FA_MOTORCYCLE                          = "fa_motorcycle";
    public static final String FA_MOUNTAIN                            = "fa_mountain";
    public static final String FA_MOUSE_POINTER                       = "fa_mouse_pointer";
    public static final String FA_MUSIC                               = "fa_music";
    public static final String FA_NETWORK_WIRED                       = "fa_network_wired";
    public static final String FA_NEUTER                              = "fa_neuter";
    public static final String FA_NEWSPAPER                           = "fa_newspaper";
    public static final String FA_NOT_EQUAL                           = "fa_not_equal";
    public static final String FA_NOTES_MEDICAL                       = "fa_notes_medical";
    public static final String FA_OBJECT_GROUP                        = "fa_object_group";
    public static final String FA_OBJECT_UNGROUP                      = "fa_object_ungroup";
    public static final String FA_OIL_CAN                             = "fa_oil_can";
    public static final String FA_OM                                  = "fa_om";
    public static final String FA_OTTER                               = "fa_otter";
    public static final String FA_OUTDENT                             = "fa_outdent";
    public static final String FA_PAINT_BRUSH                         = "fa_paint_brush";
    public static final String FA_PAINT_ROLLER                        = "fa_paint_roller";
    public static final String FA_PALETTE                             = "fa_palette";
    public static final String FA_PALLET                              = "fa_pallet";
    public static final String FA_PAPER_PLANE                         = "fa_paper_plane";
    public static final String FA_PAPERCLIP                           = "fa_paperclip";
    public static final String FA_PARACHUTE_BOX                       = "fa_parachute_box";
    public static final String FA_PARAGRAPH                           = "fa_paragraph";
    public static final String FA_PARKING                             = "fa_parking";
    public static final String FA_PASSPORT                            = "fa_passport";
    public static final String FA_PASTAFARIANISM                      = "fa_pastafarianism";
    public static final String FA_PASTE                               = "fa_paste";
    public static final String FA_PAUSE                               = "fa_pause";
    public static final String FA_PAUSE_CIRCLE                        = "fa_pause_circle";
    public static final String FA_PAW                                 = "fa_paw";
    public static final String FA_PEACE                               = "fa_peace";
    public static final String FA_PEN                                 = "fa_pen";
    public static final String FA_PEN_ALT                             = "fa_pen_alt";
    public static final String FA_PEN_FANCY                           = "fa_pen_fancy";
    public static final String FA_PEN_NIB                             = "fa_pen_nib";
    public static final String FA_PEN_SQUARE                          = "fa_pen_square";
    public static final String FA_PENCIL_ALT                          = "fa_pencil_alt";
    public static final String FA_PENCIL_RULER                        = "fa_pencil_ruler";
    public static final String FA_PEOPLE_CARRY                        = "fa_people_carry";
    public static final String FA_PERCENT                             = "fa_percent";
    public static final String FA_PERCENTAGE                          = "fa_percentage";
    public static final String FA_PERSON_BOOTH                        = "fa_person_booth";
    public static final String FA_PHONE                               = "fa_phone";
    public static final String FA_PHONE_SLASH                         = "fa_phone_slash";
    public static final String FA_PHONE_SQUARE                        = "fa_phone_square";
    public static final String FA_PHONE_VOLUME                        = "fa_phone_volume";
    public static final String FA_PIGGY_BANK                          = "fa_piggy_bank";
    public static final String FA_PILLS                               = "fa_pills";
    public static final String FA_PLACE_OF_WORSHIP                    = "fa_place_of_worship";
    public static final String FA_PLANE                               = "fa_plane";
    public static final String FA_PLANE_ARRIVAL                       = "fa_plane_arrival";
    public static final String FA_PLANE_DEPARTURE                     = "fa_plane_departure";
    public static final String FA_PLAY                                = "fa_play";
    public static final String FA_PLAY_CIRCLE                         = "fa_play_circle";
    public static final String FA_PLUG                                = "fa_plug";
    public static final String FA_PLUS                                = "fa_plus";
    public static final String FA_PLUS_CIRCLE                         = "fa_plus_circle";
    public static final String FA_PLUS_SQUARE                         = "fa_plus_square";
    public static final String FA_PODCAST                             = "fa_podcast";
    public static final String FA_POLL                                = "fa_poll";
    public static final String FA_POLL_H                              = "fa_poll_h";
    public static final String FA_POO                                 = "fa_poo";
    public static final String FA_POO_STORM                           = "fa_poo_storm";
    public static final String FA_POOP                                = "fa_poop";
    public static final String FA_PORTRAIT                            = "fa_portrait";
    public static final String FA_POUND_SIGN                          = "fa_pound_sign";
    public static final String FA_POWER_OFF                           = "fa_power_off";
    public static final String FA_PRAY                                = "fa_pray";
    public static final String FA_PRAYING_HANDS                       = "fa_praying_hands";
    public static final String FA_PRESCRIPTION                        = "fa_prescription";
    public static final String FA_PRESCRIPTION_BOTTLE                 = "fa_prescription_bottle";
    public static final String FA_PRESCRIPTION_BOTTLE_ALT             = "fa_prescription_bottle_alt";
    public static final String FA_PRINT                               = "fa_print";
    public static final String FA_PROCEDURES                          = "fa_procedures";
    public static final String FA_PROJECT_DIAGRAM                     = "fa_project_diagram";
    public static final String FA_PUZZLE_PIECE                        = "fa_puzzle_piece";
    public static final String FA_QRCODE                              = "fa_qrcode";
    public static final String FA_QUESTION                            = "fa_question";
    public static final String FA_QUESTION_CIRCLE                     = "fa_question_circle";
    public static final String FA_QUIDDITCH                           = "fa_quidditch";
    public static final String FA_QUOTE_LEFT                          = "fa_quote_left";
    public static final String FA_QUOTE_RIGHT                         = "fa_quote_right";
    public static final String FA_QURAN                               = "fa_quran";
    public static final String FA_RAINBOW                             = "fa_rainbow";
    public static final String FA_RANDOM                              = "fa_random";
    public static final String FA_RECEIPT                             = "fa_receipt";
    public static final String FA_RECYCLE                             = "fa_recycle";
    public static final String FA_REDO                                = "fa_redo";
    public static final String FA_REDO_ALT                            = "fa_redo_alt";
    public static final String FA_REGISTERED                          = "fa_registered";
    public static final String FA_REPLY                               = "fa_reply";
    public static final String FA_REPLY_ALL                           = "fa_reply_all";
    public static final String FA_REPUBLICAN                          = "fa_republican";
    public static final String FA_RETWEET                             = "fa_retweet";
    public static final String FA_RIBBON                              = "fa_ribbon";
    public static final String FA_RING                                = "fa_ring";
    public static final String FA_ROAD                                = "fa_road";
    public static final String FA_ROBOT                               = "fa_robot";
    public static final String FA_ROCKET                              = "fa_rocket";
    public static final String FA_ROUTE                               = "fa_route";
    public static final String FA_RSS                                 = "fa_rss";
    public static final String FA_RSS_SQUARE                          = "fa_rss_square";
    public static final String FA_RUBLE_SIGN                          = "fa_ruble_sign";
    public static final String FA_RULER                               = "fa_ruler";
    public static final String FA_RULER_COMBINED                      = "fa_ruler_combined";
    public static final String FA_RULER_HORIZONTAL                    = "fa_ruler_horizontal";
    public static final String FA_RULER_VERTICAL                      = "fa_ruler_vertical";
    public static final String FA_RUNNING                             = "fa_running";
    public static final String FA_RUPEE_SIGN                          = "fa_rupee_sign";
    public static final String FA_SAD_CRY                             = "fa_sad_cry";
    public static final String FA_SAD_TEAR                            = "fa_sad_tear";
    public static final String FA_SAVE                                = "fa_save";
    public static final String FA_SCHOOL                              = "fa_school";
    public static final String FA_SCREWDRIVER                         = "fa_screwdriver";
    public static final String FA_SCROLL                              = "fa_scroll";
    public static final String FA_SEARCH                              = "fa_search";
    public static final String FA_SEARCH_DOLLAR                       = "fa_search_dollar";
    public static final String FA_SEARCH_LOCATION                     = "fa_search_location";
    public static final String FA_SEARCH_MINUS                        = "fa_search_minus";
    public static final String FA_SEARCH_PLUS                         = "fa_search_plus";
    public static final String FA_SEEDLING                            = "fa_seedling";
    public static final String FA_SERVER                              = "fa_server";
    public static final String FA_SHAPES                              = "fa_shapes";
    public static final String FA_SHARE                               = "fa_share";
    public static final String FA_SHARE_ALT                           = "fa_share_alt";
    public static final String FA_SHARE_ALT_SQUARE                    = "fa_share_alt_square";
    public static final String FA_SHARE_SQUARE                        = "fa_share_square";
    public static final String FA_SHEKEL_SIGN                         = "fa_shekel_sign";
    public static final String FA_SHIELD_ALT                          = "fa_shield_alt";
    public static final String FA_SHIP                                = "fa_ship";
    public static final String FA_SHIPPING_FAST                       = "fa_shipping_fast";
    public static final String FA_SHOE_PRINTS                         = "fa_shoe_prints";
    public static final String FA_SHOPPING_BAG                        = "fa_shopping_bag";
    public static final String FA_SHOPPING_BASKET                     = "fa_shopping_basket";
    public static final String FA_SHOPPING_CART                       = "fa_shopping_cart";
    public static final String FA_SHOWER                              = "fa_shower";
    public static final String FA_SHUTTLE_VAN                         = "fa_shuttle_van";
    public static final String FA_SIGN                                = "fa_sign";
    public static final String FA_SIGN_IN_ALT                         = "fa_sign_in_alt";
    public static final String FA_SIGN_LANGUAGE                       = "fa_sign_language";
    public static final String FA_SIGN_OUT_ALT                        = "fa_sign_out_alt";
    public static final String FA_SIGNAL                              = "fa_signal";
    public static final String FA_SIGNATURE                           = "fa_signature";
    public static final String FA_SITEMAP                             = "fa_sitemap";
    public static final String FA_SKULL                               = "fa_skull";
    public static final String FA_SKULL_CROSSBONES                    = "fa_skull_crossbones";
    public static final String FA_SLASH                               = "fa_slash";
    public static final String FA_SLIDERS_H                           = "fa_sliders_h";
    public static final String FA_SMILE                               = "fa_smile";
    public static final String FA_SMILE_BEAM                          = "fa_smile_beam";
    public static final String FA_SMILE_WINK                          = "fa_smile_wink";
    public static final String FA_SMOG                                = "fa_smog";
    public static final String FA_SMOKING                             = "fa_smoking";
    public static final String FA_SMOKING_BAN                         = "fa_smoking_ban";
    public static final String FA_SNOWFLAKE                           = "fa_snowflake";
    public static final String FA_SOCKS                               = "fa_socks";
    public static final String FA_SOLAR_PANEL                         = "fa_solar_panel";
    public static final String FA_SORT                                = "fa_sort";
    public static final String FA_SORT_ALPHA_DOWN                     = "fa_sort_alpha_down";
    public static final String FA_SORT_ALPHA_UP                       = "fa_sort_alpha_up";
    public static final String FA_SORT_AMOUNT_DOWN                    = "fa_sort_amount_down";
    public static final String FA_SORT_AMOUNT_UP                      = "fa_sort_amount_up";
    public static final String FA_SORT_DOWN                           = "fa_sort_down";
    public static final String FA_SORT_NUMERIC_DOWN                   = "fa_sort_numeric_down";
    public static final String FA_SORT_NUMERIC_UP                     = "fa_sort_numeric_up";
    public static final String FA_SORT_UP                             = "fa_sort_up";
    public static final String FA_SPA                                 = "fa_spa";
    public static final String FA_SPACE_SHUTTLE                       = "fa_space_shuttle";
    public static final String FA_SPIDER                              = "fa_spider";
    public static final String FA_SPINNER                             = "fa_spinner";
    public static final String FA_SPLOTCH                             = "fa_splotch";
    public static final String FA_SPRAY_CAN                           = "fa_spray_can";
    public static final String FA_SQUARE                              = "fa_square";
    public static final String FA_SQUARE_FULL                         = "fa_square_full";
    public static final String FA_SQUARE_ROOT_ALT                     = "fa_square_root_alt";
    public static final String FA_STAMP                               = "fa_stamp";
    public static final String FA_STAR                                = "fa_star";
    public static final String FA_STAR_AND_CRESCENT                   = "fa_star_and_crescent";
    public static final String FA_STAR_HALF                           = "fa_star_half";
    public static final String FA_STAR_HALF_ALT                       = "fa_star_half_alt";
    public static final String FA_STAR_OF_DAVID                       = "fa_star_of_david";
    public static final String FA_STAR_OF_LIFE                        = "fa_star_of_life";
    public static final String FA_STEP_BACKWARD                       = "fa_step_backward";
    public static final String FA_STEP_FORWARD                        = "fa_step_forward";
    public static final String FA_STETHOSCOPE                         = "fa_stethoscope";
    public static final String FA_STICKY_NOTE                         = "fa_sticky_note";
    public static final String FA_STOP                                = "fa_stop";
    public static final String FA_STOP_CIRCLE                         = "fa_stop_circle";
    public static final String FA_STOPWATCH                           = "fa_stopwatch";
    public static final String FA_STORE                               = "fa_store";
    public static final String FA_STORE_ALT                           = "fa_store_alt";
    public static final String FA_STREAM                              = "fa_stream";
    public static final String FA_STREET_VIEW                         = "fa_street_view";
    public static final String FA_STRIKETHROUGH                       = "fa_strikethrough";
    public static final String FA_STROOPWAFEL                         = "fa_stroopwafel";
    public static final String FA_SUBSCRIPT                           = "fa_subscript";
    public static final String FA_SUBWAY                              = "fa_subway";
    public static final String FA_SUITCASE                            = "fa_suitcase";
    public static final String FA_SUITCASE_ROLLING                    = "fa_suitcase_rolling";
    public static final String FA_SUN                                 = "fa_sun";
    public static final String FA_SUPERSCRIPT                         = "fa_superscript";
    public static final String FA_SURPRISE                            = "fa_surprise";
    public static final String FA_SWATCHBOOK                          = "fa_swatchbook";
    public static final String FA_SWIMMER                             = "fa_swimmer";
    public static final String FA_SWIMMING_POOL                       = "fa_swimming_pool";
    public static final String FA_SYNAGOGUE                           = "fa_synagogue";
    public static final String FA_SYNC                                = "fa_sync";
    public static final String FA_SYNC_ALT                            = "fa_sync_alt";
    public static final String FA_SYRINGE                             = "fa_syringe";
    public static final String FA_TABLE                               = "fa_table";
    public static final String FA_TABLE_TENNIS                        = "fa_table_tennis";
    public static final String FA_TABLET                              = "fa_tablet";
    public static final String FA_TABLET_ALT                          = "fa_tablet_alt";
    public static final String FA_TABLETS                             = "fa_tablets";
    public static final String FA_TACHOMETER_ALT                      = "fa_tachometer_alt";
    public static final String FA_TAG                                 = "fa_tag";
    public static final String FA_TAGS                                = "fa_tags";
    public static final String FA_TAPE                                = "fa_tape";
    public static final String FA_TASKS                               = "fa_tasks";
    public static final String FA_TAXI                                = "fa_taxi";
    public static final String FA_TEETH                               = "fa_teeth";
    public static final String FA_TEETH_OPEN                          = "fa_teeth_open";
    public static final String FA_TEMPERATURE_HIGH                    = "fa_temperature_high";
    public static final String FA_TEMPERATURE_LOW                     = "fa_temperature_low";
    public static final String FA_TERMINAL                            = "fa_terminal";
    public static final String FA_TEXT_HEIGHT                         = "fa_text_height";
    public static final String FA_TEXT_WIDTH                          = "fa_text_width";
    public static final String FA_TH                                  = "fa_th";
    public static final String FA_TH_LARGE                            = "fa_th_large";
    public static final String FA_TH_LIST                             = "fa_th_list";
    public static final String FA_THEATER_MASKS                       = "fa_theater_masks";
    public static final String FA_THERMOMETER                         = "fa_thermometer";
    public static final String FA_THERMOMETER_EMPTY                   = "fa_thermometer_empty";
    public static final String FA_THERMOMETER_FULL                    = "fa_thermometer_full";
    public static final String FA_THERMOMETER_HALF                    = "fa_thermometer_half";
    public static final String FA_THERMOMETER_QUARTER                 = "fa_thermometer_quarter";
    public static final String FA_THERMOMETER_THREE_QUARTERS          = "fa_thermometer_three_quarters";
    public static final String FA_THUMBS_DOWN                         = "fa_thumbs_down";
    public static final String FA_THUMBS_UP                           = "fa_thumbs_up";
    public static final String FA_THUMBTACK                           = "fa_thumbtack";
    public static final String FA_TICKET_ALT                          = "fa_ticket_alt";
    public static final String FA_TIMES                               = "fa_times";
    public static final String FA_TIMES_CIRCLE                        = "fa_times_circle";
    public static final String FA_TINT                                = "fa_tint";
    public static final String FA_TINT_SLASH                          = "fa_tint_slash";
    public static final String FA_TIRED                               = "fa_tired";
    public static final String FA_TOGGLE_OFF                          = "fa_toggle_off";
    public static final String FA_TOGGLE_ON                           = "fa_toggle_on";
    public static final String FA_TOILET_PAPER                        = "fa_toilet_paper";
    public static final String FA_TOOLBOX                             = "fa_toolbox";
    public static final String FA_TOOTH                               = "fa_tooth";
    public static final String FA_TORAH                               = "fa_torah";
    public static final String FA_TORII_GATE                          = "fa_torii_gate";
    public static final String FA_TRACTOR                             = "fa_tractor";
    public static final String FA_TRADEMARK                           = "fa_trademark";
    public static final String FA_TRAFFIC_LIGHT                       = "fa_traffic_light";
    public static final String FA_TRAIN                               = "fa_train";
    public static final String FA_TRANSGENDER                         = "fa_transgender";
    public static final String FA_TRANSGENDER_ALT                     = "fa_transgender_alt";
    public static final String FA_TRASH                               = "fa_trash";
    public static final String FA_TRASH_ALT                           = "fa_trash_alt";
    public static final String FA_TREE                                = "fa_tree";
    public static final String FA_TROPHY                              = "fa_trophy";
    public static final String FA_TRUCK                               = "fa_truck";
    public static final String FA_TRUCK_LOADING                       = "fa_truck_loading";
    public static final String FA_TRUCK_MONSTER                       = "fa_truck_monster";
    public static final String FA_TRUCK_MOVING                        = "fa_truck_moving";
    public static final String FA_TRUCK_PICKUP                        = "fa_truck_pickup";
    public static final String FA_TSHIRT                              = "fa_tshirt";
    public static final String FA_TTY                                 = "fa_tty";
    public static final String FA_TV                                  = "fa_tv";
    public static final String FA_UMBRELLA                            = "fa_umbrella";
    public static final String FA_UMBRELLA_BEACH                      = "fa_umbrella_beach";
    public static final String FA_UNDERLINE                           = "fa_underline";
    public static final String FA_UNDO                                = "fa_undo";
    public static final String FA_UNDO_ALT                            = "fa_undo_alt";
    public static final String FA_UNIVERSAL_ACCESS                    = "fa_universal_access";
    public static final String FA_UNIVERSITY                          = "fa_university";
    public static final String FA_UNLINK                              = "fa_unlink";
    public static final String FA_UNLOCK                              = "fa_unlock";
    public static final String FA_UNLOCK_ALT                          = "fa_unlock_alt";
    public static final String FA_UPLOAD                              = "fa_upload";
    public static final String FA_USER                                = "fa_user";
    public static final String FA_USER_ALT                            = "fa_user_alt";
    public static final String FA_USER_ALT_SLASH                      = "fa_user_alt_slash";
    public static final String FA_USER_ASTRONAUT                      = "fa_user_astronaut";
    public static final String FA_USER_CHECK                          = "fa_user_check";
    public static final String FA_USER_CIRCLE                         = "fa_user_circle";
    public static final String FA_USER_CLOCK                          = "fa_user_clock";
    public static final String FA_USER_COG                            = "fa_user_cog";
    public static final String FA_USER_EDIT                           = "fa_user_edit";
    public static final String FA_USER_FRIENDS                        = "fa_user_friends";
    public static final String FA_USER_GRADUATE                       = "fa_user_graduate";
    public static final String FA_USER_INJURED                        = "fa_user_injured";
    public static final String FA_USER_LOCK                           = "fa_user_lock";
    public static final String FA_USER_MD                             = "fa_user_md";
    public static final String FA_USER_MINUS                          = "fa_user_minus";
    public static final String FA_USER_NINJA                          = "fa_user_ninja";
    public static final String FA_USER_PLUS                           = "fa_user_plus";
    public static final String FA_USER_SECRET                         = "fa_user_secret";
    public static final String FA_USER_SHIELD                         = "fa_user_shield";
    public static final String FA_USER_SLASH                          = "fa_user_slash";
    public static final String FA_USER_TAG                            = "fa_user_tag";
    public static final String FA_USER_TIE                            = "fa_user_tie";
    public static final String FA_USER_TIMES                          = "fa_user_times";
    public static final String FA_USERS                               = "fa_users";
    public static final String FA_USERS_COG                           = "fa_users_cog";
    public static final String FA_UTENSIL_SPOON                       = "fa_utensil_spoon";
    public static final String FA_UTENSILS                            = "fa_utensils";
    public static final String FA_VECTOR_SQUARE                       = "fa_vector_square";
    public static final String FA_VENUS                               = "fa_venus";
    public static final String FA_VENUS_DOUBLE                        = "fa_venus_double";
    public static final String FA_VENUS_MARS                          = "fa_venus_mars";
    public static final String FA_VIAL                                = "fa_vial";
    public static final String FA_VIALS                               = "fa_vials";
    public static final String FA_VIDEO                               = "fa_video";
    public static final String FA_VIDEO_SLASH                         = "fa_video_slash";
    public static final String FA_VIHARA                              = "fa_vihara";
    public static final String FA_VOLLEYBALL_BALL                     = "fa_volleyball_ball";
    public static final String FA_VOLUME_DOWN                         = "fa_volume_down";
    public static final String FA_VOLUME_MUTE                         = "fa_volume_mute";
    public static final String FA_VOLUME_OFF                          = "fa_volume_off";
    public static final String FA_VOLUME_UP                           = "fa_volume_up";
    public static final String FA_VOTE_YEA                            = "fa_vote_yea";
    public static final String FA_VR_CARDBOARD                        = "fa_vr_cardboard";
    public static final String FA_WALKING                             = "fa_walking";
    public static final String FA_WALLET                              = "fa_wallet";
    public static final String FA_WAREHOUSE                           = "fa_warehouse";
    public static final String FA_WATER                               = "fa_water";
    public static final String FA_WEIGHT                              = "fa_weight";
    public static final String FA_WEIGHT_HANGING                      = "fa_weight_hanging";
    public static final String FA_WHEELCHAIR                          = "fa_wheelchair";
    public static final String FA_WIFI                                = "fa_wifi";
    public static final String FA_WIND                                = "fa_wind";
    public static final String FA_WINDOW_CLOSE                        = "fa_window_close";
    public static final String FA_WINDOW_MAXIMIZE                     = "fa_window_maximize";
    public static final String FA_WINDOW_MINIMIZE                     = "fa_window_minimize";
    public static final String FA_WINDOW_RESTORE                      = "fa_window_restore";
    public static final String FA_WINE_BOTTLE                         = "fa_wine_bottle";
    public static final String FA_WINE_GLASS                          = "fa_wine_glass";
    public static final String FA_WINE_GLASS_ALT                      = "fa_wine_glass_alt";
    public static final String FA_WON_SIGN                            = "fa_won_sign";
    public static final String FA_WRENCH                              = "fa_wrench";
    public static final String FA_X_RAY                               = "fa_x_ray";
    public static final String FA_YEN_SIGN                            = "fa_yen_sign";
    public static final String FA_YIN_YANG                            = "fa_yin_yang";


    static {
        ICON_MAP.put(FA_AD, "\uf641");
        ICON_MAP.put(FA_ADDRESS_BOOK, "\uf2b9");
        ICON_MAP.put(FA_ADDRESS_CARD, "\uf2bb");
        ICON_MAP.put(FA_ADJUST, "\uf042");
        ICON_MAP.put(FA_AIR_FRESHENER, "\uf5d0");
        ICON_MAP.put(FA_ALIGN_CENTER, "\uf037");
        ICON_MAP.put(FA_ALIGN_JUSTIFY, "\uf039");
        ICON_MAP.put(FA_ALIGN_LEFT, "\uf036");
        ICON_MAP.put(FA_ALIGN_RIGHT, "\uf038");
        ICON_MAP.put(FA_ALLERGIES, "\uf461");
        ICON_MAP.put(FA_AMBULANCE, "\uf0f9");
        ICON_MAP.put(FA_AMERICAN_SIGN_LANGUAGE_INTERPRETING, "\uf2a3");
        ICON_MAP.put(FA_ANCHOR, "\uf13d");
        ICON_MAP.put(FA_ANGLE_DOUBLE_DOWN, "\uf103");
        ICON_MAP.put(FA_ANGLE_DOUBLE_LEFT, "\uf100");
        ICON_MAP.put(FA_ANGLE_DOUBLE_RIGHT, "\uf101");
        ICON_MAP.put(FA_ANGLE_DOUBLE_UP, "\uf102");
        ICON_MAP.put(FA_ANGLE_DOWN, "\uf107");
        ICON_MAP.put(FA_ANGLE_LEFT, "\uf104");
        ICON_MAP.put(FA_ANGLE_RIGHT, "\uf105");
        ICON_MAP.put(FA_ANGLE_UP, "\uf106");
        ICON_MAP.put(FA_ANGRY, "\uf556");
        ICON_MAP.put(FA_ANKH, "\uf644");
        ICON_MAP.put(FA_APPLE_ALT, "\uf5d1");
        ICON_MAP.put(FA_ARCHIVE, "\uf187");
        ICON_MAP.put(FA_ARCHWAY, "\uf557");
        ICON_MAP.put(FA_ARROW_ALT_CIRCLE_DOWN, "\uf358");
        ICON_MAP.put(FA_ARROW_ALT_CIRCLE_LEFT, "\uf359");
        ICON_MAP.put(FA_ARROW_ALT_CIRCLE_RIGHT, "\uf35a");
        ICON_MAP.put(FA_ARROW_ALT_CIRCLE_UP, "\uf35b");
        ICON_MAP.put(FA_ARROW_CIRCLE_DOWN, "\uf0ab");
        ICON_MAP.put(FA_ARROW_CIRCLE_LEFT, "\uf0a8");
        ICON_MAP.put(FA_ARROW_CIRCLE_RIGHT, "\uf0a9");
        ICON_MAP.put(FA_ARROW_CIRCLE_UP, "\uf0aa");
        ICON_MAP.put(FA_ARROW_DOWN, "\uf063");
        ICON_MAP.put(FA_ARROW_LEFT, "\uf060");
        ICON_MAP.put(FA_ARROW_RIGHT, "\uf061");
        ICON_MAP.put(FA_ARROW_UP, "\uf062");
        ICON_MAP.put(FA_ARROWS_ALT, "\uf0b2");
        ICON_MAP.put(FA_ARROWS_ALT_H, "\uf337");
        ICON_MAP.put(FA_ARROWS_ALT_V, "\uf338");
        ICON_MAP.put(FA_ASSISTIVE_LISTENING_SYSTEMS, "\uf2a2");
        ICON_MAP.put(FA_ASTERISK, "\uf069");
        ICON_MAP.put(FA_AT, "\uf1fa");
        ICON_MAP.put(FA_ATLAS, "\uf558");
        ICON_MAP.put(FA_ATOM, "\uf5d2");
        ICON_MAP.put(FA_AUDIO_DESCRIPTION, "\uf29e");
        ICON_MAP.put(FA_AWARD, "\uf559");
        ICON_MAP.put(FA_BACKSPACE, "\uf55a");
        ICON_MAP.put(FA_BACKWARD, "\uf04a");
        ICON_MAP.put(FA_BALANCE_SCALE, "\uf24e");
        ICON_MAP.put(FA_BAN, "\uf05e");
        ICON_MAP.put(FA_BAND_AID, "\uf462");
        ICON_MAP.put(FA_BARCODE, "\uf02a");
        ICON_MAP.put(FA_BARS, "\uf0c9");
        ICON_MAP.put(FA_BASEBALL_BALL, "\uf433");
        ICON_MAP.put(FA_BASKETBALL_BALL, "\uf434");
        ICON_MAP.put(FA_BATH, "\uf2cd");
        ICON_MAP.put(FA_BATTERY_EMPTY, "\uf244");
        ICON_MAP.put(FA_BATTERY_FULL, "\uf240");
        ICON_MAP.put(FA_BATTERY_HALF, "\uf242");
        ICON_MAP.put(FA_BATTERY_QUARTER, "\uf243");
        ICON_MAP.put(FA_BATTERY_THREE_QUARTERS, "\uf241");
        ICON_MAP.put(FA_BED, "\uf236");
        ICON_MAP.put(FA_BEER, "\uf0fc");
        ICON_MAP.put(FA_BELL, "\uf0f3");
        ICON_MAP.put(FA_BELL_SLASH, "\uf1f6");
        ICON_MAP.put(FA_BEZIER_CURVE, "\uf55b");
        ICON_MAP.put(FA_BIBLE, "\uf647");
        ICON_MAP.put(FA_BICYCLE, "\uf206");
        ICON_MAP.put(FA_BINOCULARS, "\uf1e5");
        ICON_MAP.put(FA_BIRTHDAY_CAKE, "\uf1fd");
        ICON_MAP.put(FA_BLENDER, "\uf517");
        ICON_MAP.put(FA_BLENDER_PHONE, "\uf6b6");
        ICON_MAP.put(FA_BLIND, "\uf29d");
        ICON_MAP.put(FA_BOLD, "\uf032");
        ICON_MAP.put(FA_BOLT, "\uf0e7");
        ICON_MAP.put(FA_BOMB, "\uf1e2");
        ICON_MAP.put(FA_BONE, "\uf5d7");
        ICON_MAP.put(FA_BONG, "\uf55c");
        ICON_MAP.put(FA_BOOK, "\uf02d");
        ICON_MAP.put(FA_BOOK_DEAD, "\uf6b7");
        ICON_MAP.put(FA_BOOK_OPEN, "\uf518");
        ICON_MAP.put(FA_BOOK_READER, "\uf5da");
        ICON_MAP.put(FA_BOOKMARK, "\uf02e");
        ICON_MAP.put(FA_BOWLING_BALL, "\uf436");
        ICON_MAP.put(FA_BOX, "\uf466");
        ICON_MAP.put(FA_BOX_OPEN, "\uf49e");
        ICON_MAP.put(FA_BOXES, "\uf468");
        ICON_MAP.put(FA_BRAILLE, "\uf2a1");
        ICON_MAP.put(FA_BRAIN, "\uf5dc");
        ICON_MAP.put(FA_BRIEFCASE, "\uf0b1");
        ICON_MAP.put(FA_BRIEFCASE_MEDICAL, "\uf469");
        ICON_MAP.put(FA_BROADCAST_TOWER, "\uf519");
        ICON_MAP.put(FA_BROOM, "\uf51a");
        ICON_MAP.put(FA_BRUSH, "\uf55d");
        ICON_MAP.put(FA_BUG, "\uf188");
        ICON_MAP.put(FA_BUILDING, "\uf1ad");
        ICON_MAP.put(FA_BULLHORN, "\uf0a1");
        ICON_MAP.put(FA_BULLSEYE, "\uf140");
        ICON_MAP.put(FA_BURN, "\uf46a");
        ICON_MAP.put(FA_BUS, "\uf207");
        ICON_MAP.put(FA_BUS_ALT, "\uf55e");
        ICON_MAP.put(FA_BUSINESS_TIME, "\uf64a");
        ICON_MAP.put(FA_CALCULATOR, "\uf1ec");
        ICON_MAP.put(FA_CALENDAR, "\uf133");
        ICON_MAP.put(FA_CALENDAR_ALT, "\uf073");
        ICON_MAP.put(FA_CALENDAR_CHECK, "\uf274");
        ICON_MAP.put(FA_CALENDAR_MINUS, "\uf272");
        ICON_MAP.put(FA_CALENDAR_PLUS, "\uf271");
        ICON_MAP.put(FA_CALENDAR_TIMES, "\uf273");
        ICON_MAP.put(FA_CAMERA, "\uf030");
        ICON_MAP.put(FA_CAMERA_RETRO, "\uf083");
        ICON_MAP.put(FA_CAMPGROUND, "\uf6bb");
        ICON_MAP.put(FA_CANNABIS, "\uf55f");
        ICON_MAP.put(FA_CAPSULES, "\uf46b");
        ICON_MAP.put(FA_CAR, "\uf1b9");
        ICON_MAP.put(FA_CAR_ALT, "\uf5de");
        ICON_MAP.put(FA_CAR_BATTERY, "\uf5df");
        ICON_MAP.put(FA_CAR_CRASH, "\uf5e1");
        ICON_MAP.put(FA_CAR_SIDE, "\uf5e4");
        ICON_MAP.put(FA_CARET_DOWN, "\uf0d7");
        ICON_MAP.put(FA_CARET_LEFT, "\uf0d9");
        ICON_MAP.put(FA_CARET_RIGHT, "\uf0da");
        ICON_MAP.put(FA_CARET_SQUARE_DOWN, "\uf150");
        ICON_MAP.put(FA_CARET_SQUARE_LEFT, "\uf191");
        ICON_MAP.put(FA_CARET_SQUARE_RIGHT, "\uf152");
        ICON_MAP.put(FA_CARET_SQUARE_UP, "\uf151");
        ICON_MAP.put(FA_CARET_UP, "\uf0d8");
        ICON_MAP.put(FA_CART_ARROW_DOWN, "\uf218");
        ICON_MAP.put(FA_CART_PLUS, "\uf217");
        ICON_MAP.put(FA_CAT, "\uf6be");
        ICON_MAP.put(FA_CERTIFICATE, "\uf0a3");
        ICON_MAP.put(FA_CHAIR, "\uf6c0");
        ICON_MAP.put(FA_CHALKBOARD, "\uf51b");
        ICON_MAP.put(FA_CHALKBOARD_TEACHER, "\uf51c");
        ICON_MAP.put(FA_CHARGING_STATION, "\uf5e7");
        ICON_MAP.put(FA_CHART_AREA, "\uf1fe");
        ICON_MAP.put(FA_CHART_BAR, "\uf080");
        ICON_MAP.put(FA_CHART_LINE, "\uf201");
        ICON_MAP.put(FA_CHART_PIE, "\uf200");
        ICON_MAP.put(FA_CHECK, "\uf00c");
        ICON_MAP.put(FA_CHECK_CIRCLE, "\uf058");
        ICON_MAP.put(FA_CHECK_DOUBLE, "\uf560");
        ICON_MAP.put(FA_CHECK_SQUARE, "\uf14a");
        ICON_MAP.put(FA_CHESS, "\uf439");
        ICON_MAP.put(FA_CHESS_BISHOP, "\uf43a");
        ICON_MAP.put(FA_CHESS_BOARD, "\uf43c");
        ICON_MAP.put(FA_CHESS_KING, "\uf43f");
        ICON_MAP.put(FA_CHESS_KNIGHT, "\uf441");
        ICON_MAP.put(FA_CHESS_PAWN, "\uf443");
        ICON_MAP.put(FA_CHESS_QUEEN, "\uf445");
        ICON_MAP.put(FA_CHESS_ROOK, "\uf447");
        ICON_MAP.put(FA_CHEVRON_CIRCLE_DOWN, "\uf13a");
        ICON_MAP.put(FA_CHEVRON_CIRCLE_LEFT, "\uf137");
        ICON_MAP.put(FA_CHEVRON_CIRCLE_RIGHT, "\uf138");
        ICON_MAP.put(FA_CHEVRON_CIRCLE_UP, "\uf139");
        ICON_MAP.put(FA_CHEVRON_DOWN, "\uf078");
        ICON_MAP.put(FA_CHEVRON_LEFT, "\uf053");
        ICON_MAP.put(FA_CHEVRON_RIGHT, "\uf054");
        ICON_MAP.put(FA_CHEVRON_UP, "\uf077");
        ICON_MAP.put(FA_CHILD, "\uf1ae");
        ICON_MAP.put(FA_CHURCH, "\uf51d");
        ICON_MAP.put(FA_CIRCLE, "\uf111");
        ICON_MAP.put(FA_CIRCLE_NOTCH, "\uf1ce");
        ICON_MAP.put(FA_CITY, "\uf64f");
        ICON_MAP.put(FA_CLIPBOARD, "\uf328");
        ICON_MAP.put(FA_CLIPBOARD_CHECK, "\uf46c");
        ICON_MAP.put(FA_CLIPBOARD_LIST, "\uf46d");
        ICON_MAP.put(FA_CLOCK, "\uf017");
        ICON_MAP.put(FA_CLONE, "\uf24d");
        ICON_MAP.put(FA_CLOSED_CAPTIONING, "\uf20a");
        ICON_MAP.put(FA_CLOUD, "\uf0c2");
        ICON_MAP.put(FA_CLOUD_DOWNLOAD_ALT, "\uf381");
        ICON_MAP.put(FA_CLOUD_MEATBALL, "\uf73b");
        ICON_MAP.put(FA_CLOUD_MOON, "\uf6c3");
        ICON_MAP.put(FA_CLOUD_MOON_RAIN, "\uf73c");
        ICON_MAP.put(FA_CLOUD_RAIN, "\uf73d");
        ICON_MAP.put(FA_CLOUD_SHOWERS_HEAVY, "\uf740");
        ICON_MAP.put(FA_CLOUD_SUN, "\uf6c4");
        ICON_MAP.put(FA_CLOUD_SUN_RAIN, "\uf743");
        ICON_MAP.put(FA_CLOUD_UPLOAD_ALT, "\uf382");
        ICON_MAP.put(FA_COCKTAIL, "\uf561");
        ICON_MAP.put(FA_CODE, "\uf121");
        ICON_MAP.put(FA_CODE_BRANCH, "\uf126");
        ICON_MAP.put(FA_COFFEE, "\uf0f4");
        ICON_MAP.put(FA_COG, "\uf013");
        ICON_MAP.put(FA_COGS, "\uf085");
        ICON_MAP.put(FA_COINS, "\uf51e");
        ICON_MAP.put(FA_COLUMNS, "\uf0db");
        ICON_MAP.put(FA_COMMENT, "\uf075");
        ICON_MAP.put(FA_COMMENT_ALT, "\uf27a");
        ICON_MAP.put(FA_COMMENT_DOLLAR, "\uf651");
        ICON_MAP.put(FA_COMMENT_DOTS, "\uf4ad");
        ICON_MAP.put(FA_COMMENT_SLASH, "\uf4b3");
        ICON_MAP.put(FA_COMMENTS, "\uf086");
        ICON_MAP.put(FA_COMMENTS_DOLLAR, "\uf653");
        ICON_MAP.put(FA_COMPACT_DISC, "\uf51f");
        ICON_MAP.put(FA_COMPASS, "\uf14e");
        ICON_MAP.put(FA_COMPRESS, "\uf066");
        ICON_MAP.put(FA_CONCIERGE_BELL, "\uf562");
        ICON_MAP.put(FA_COOKIE, "\uf563");
        ICON_MAP.put(FA_COOKIE_BITE, "\uf564");
        ICON_MAP.put(FA_COPY, "\uf0c5");
        ICON_MAP.put(FA_COPYRIGHT, "\uf1f9");
        ICON_MAP.put(FA_COUCH, "\uf4b8");
        ICON_MAP.put(FA_CREDIT_CARD, "\uf09d");
        ICON_MAP.put(FA_CROP, "\uf125");
        ICON_MAP.put(FA_CROP_ALT, "\uf565");
        ICON_MAP.put(FA_CROSS, "\uf654");
        ICON_MAP.put(FA_CROSSHAIRS, "\uf05b");
        ICON_MAP.put(FA_CROW, "\uf520");
        ICON_MAP.put(FA_CROWN, "\uf521");
        ICON_MAP.put(FA_CUBE, "\uf1b2");
        ICON_MAP.put(FA_CUBES, "\uf1b3");
        ICON_MAP.put(FA_CUT, "\uf0c4");
        ICON_MAP.put(FA_DATABASE, "\uf1c0");
        ICON_MAP.put(FA_DEAF, "\uf2a4");
        ICON_MAP.put(FA_DEMOCRAT, "\uf747");
        ICON_MAP.put(FA_DESKTOP, "\uf108");
        ICON_MAP.put(FA_DHARMACHAKRA, "\uf655");
        ICON_MAP.put(FA_DIAGNOSES, "\uf470");
        ICON_MAP.put(FA_DICE, "\uf522");
        ICON_MAP.put(FA_DICE_D20, "\uf6cf");
        ICON_MAP.put(FA_DICE_D6, "\uf6d1");
        ICON_MAP.put(FA_DICE_FIVE, "\uf523");
        ICON_MAP.put(FA_DICE_FOUR, "\uf524");
        ICON_MAP.put(FA_DICE_ONE, "\uf525");
        ICON_MAP.put(FA_DICE_SIX, "\uf526");
        ICON_MAP.put(FA_DICE_THREE, "\uf527");
        ICON_MAP.put(FA_DICE_TWO, "\uf528");
        ICON_MAP.put(FA_DIGITAL_TACHOGRAPH, "\uf566");
        ICON_MAP.put(FA_DIRECTIONS, "\uf5eb");
        ICON_MAP.put(FA_DIVIDE, "\uf529");
        ICON_MAP.put(FA_DIZZY, "\uf567");
        ICON_MAP.put(FA_DNA, "\uf471");
        ICON_MAP.put(FA_DOG, "\uf6d3");
        ICON_MAP.put(FA_DOLLAR_SIGN, "\uf155");
        ICON_MAP.put(FA_DOLLY, "\uf472");
        ICON_MAP.put(FA_DOLLY_FLATBED, "\uf474");
        ICON_MAP.put(FA_DONATE, "\uf4b9");
        ICON_MAP.put(FA_DOOR_CLOSED, "\uf52a");
        ICON_MAP.put(FA_DOOR_OPEN, "\uf52b");
        ICON_MAP.put(FA_DOT_CIRCLE, "\uf192");
        ICON_MAP.put(FA_DOVE, "\uf4ba");
        ICON_MAP.put(FA_DOWNLOAD, "\uf019");
        ICON_MAP.put(FA_DRAFTING_COMPASS, "\uf568");
        ICON_MAP.put(FA_DRAGON, "\uf6d5");
        ICON_MAP.put(FA_DRAW_POLYGON, "\uf5ee");
        ICON_MAP.put(FA_DRUM, "\uf569");
        ICON_MAP.put(FA_DRUM_STEELPAN, "\uf56a");
        ICON_MAP.put(FA_DRUMSTICK_BITE, "\uf6d7");
        ICON_MAP.put(FA_DUMBBELL, "\uf44b");
        ICON_MAP.put(FA_DUNGEON, "\uf6d9");
        ICON_MAP.put(FA_EDIT, "\uf044");
        ICON_MAP.put(FA_EJECT, "\uf052");
        ICON_MAP.put(FA_ELLIPSIS_H, "\uf141");
        ICON_MAP.put(FA_ELLIPSIS_V, "\uf142");
        ICON_MAP.put(FA_ENVELOPE, "\uf0e0");
        ICON_MAP.put(FA_ENVELOPE_OPEN, "\uf2b6");
        ICON_MAP.put(FA_ENVELOPE_OPEN_TEXT, "\uf658");
        ICON_MAP.put(FA_ENVELOPE_SQUARE, "\uf199");
        ICON_MAP.put(FA_EQUALS, "\uf52c");
        ICON_MAP.put(FA_ERASER, "\uf12d");
        ICON_MAP.put(FA_EURO_SIGN, "\uf153");
        ICON_MAP.put(FA_EXCHANGE_ALT, "\uf362");
        ICON_MAP.put(FA_EXCLAMATION, "\uf12a");
        ICON_MAP.put(FA_EXCLAMATION_CIRCLE, "\uf06a");
        ICON_MAP.put(FA_EXCLAMATION_TRIANGLE, "\uf071");
        ICON_MAP.put(FA_EXPAND, "\uf065");
        ICON_MAP.put(FA_EXPAND_ARROWS_ALT, "\uf31e");
        ICON_MAP.put(FA_EXTERNAL_LINK_ALT, "\uf35d");
        ICON_MAP.put(FA_EXTERNAL_LINK_SQUARE_ALT, "\uf360");
        ICON_MAP.put(FA_EYE, "\uf06e");
        ICON_MAP.put(FA_EYE_DROPPER, "\uf1fb");
        ICON_MAP.put(FA_EYE_SLASH, "\uf070");
        ICON_MAP.put(FA_FAST_BACKWARD, "\uf049");
        ICON_MAP.put(FA_FAST_FORWARD, "\uf050");
        ICON_MAP.put(FA_FAX, "\uf1ac");
        ICON_MAP.put(FA_FEATHER, "\uf52d");
        ICON_MAP.put(FA_FEATHER_ALT, "\uf56b");
        ICON_MAP.put(FA_FEMALE, "\uf182");
        ICON_MAP.put(FA_FIGHTER_JET, "\uf0fb");
        ICON_MAP.put(FA_FILE, "\uf15b");
        ICON_MAP.put(FA_FILE_ALT, "\uf15c");
        ICON_MAP.put(FA_FILE_ARCHIVE, "\uf1c6");
        ICON_MAP.put(FA_FILE_AUDIO, "\uf1c7");
        ICON_MAP.put(FA_FILE_CODE, "\uf1c9");
        ICON_MAP.put(FA_FILE_CONTRACT, "\uf56c");
        ICON_MAP.put(FA_FILE_CSV, "\uf6dd");
        ICON_MAP.put(FA_FILE_DOWNLOAD, "\uf56d");
        ICON_MAP.put(FA_FILE_EXCEL, "\uf1c3");
        ICON_MAP.put(FA_FILE_EXPORT, "\uf56e");
        ICON_MAP.put(FA_FILE_IMAGE, "\uf1c5");
        ICON_MAP.put(FA_FILE_IMPORT, "\uf56f");
        ICON_MAP.put(FA_FILE_INVOICE, "\uf570");
        ICON_MAP.put(FA_FILE_INVOICE_DOLLAR, "\uf571");
        ICON_MAP.put(FA_FILE_MEDICAL, "\uf477");
        ICON_MAP.put(FA_FILE_MEDICAL_ALT, "\uf478");
        ICON_MAP.put(FA_FILE_PDF, "\uf1c1");
        ICON_MAP.put(FA_FILE_POWERPOINT, "\uf1c4");
        ICON_MAP.put(FA_FILE_PRESCRIPTION, "\uf572");
        ICON_MAP.put(FA_FILE_SIGNATURE, "\uf573");
        ICON_MAP.put(FA_FILE_UPLOAD, "\uf574");
        ICON_MAP.put(FA_FILE_VIDEO, "\uf1c8");
        ICON_MAP.put(FA_FILE_WORD, "\uf1c2");
        ICON_MAP.put(FA_FILL, "\uf575");
        ICON_MAP.put(FA_FILL_DRIP, "\uf576");
        ICON_MAP.put(FA_FILM, "\uf008");
        ICON_MAP.put(FA_FILTER, "\uf0b0");
        ICON_MAP.put(FA_FINGERPRINT, "\uf577");
        ICON_MAP.put(FA_FIRE, "\uf06d");
        ICON_MAP.put(FA_FIRE_EXTINGUISHER, "\uf134");
        ICON_MAP.put(FA_FIRST_AID, "\uf479");
        ICON_MAP.put(FA_FISH, "\uf578");
        ICON_MAP.put(FA_FIST_RAISED, "\uf6de");
        ICON_MAP.put(FA_FLAG, "\uf024");
        ICON_MAP.put(FA_FLAG_CHECKERED, "\uf11e");
        ICON_MAP.put(FA_FLAG_USA, "\uf74d");
        ICON_MAP.put(FA_FLASK, "\uf0c3");
        ICON_MAP.put(FA_FLUSHED, "\uf579");
        ICON_MAP.put(FA_FOLDER, "\uf07b");
        ICON_MAP.put(FA_FOLDER_MINUS, "\uf65d");
        ICON_MAP.put(FA_FOLDER_OPEN, "\uf07c");
        ICON_MAP.put(FA_FOLDER_PLUS, "\uf65e");
        ICON_MAP.put(FA_FONT, "\uf031");
        ICON_MAP.put(FA_FOOTBALL_BALL, "\uf44e");
        ICON_MAP.put(FA_FORWARD, "\uf04e");
        ICON_MAP.put(FA_FROG, "\uf52e");
        ICON_MAP.put(FA_FROWN, "\uf119");
        ICON_MAP.put(FA_FROWN_OPEN, "\uf57a");
        ICON_MAP.put(FA_FUNNEL_DOLLAR, "\uf662");
        ICON_MAP.put(FA_FUTBOL, "\uf1e3");
        ICON_MAP.put(FA_GAMEPAD, "\uf11b");
        ICON_MAP.put(FA_GAS_PUMP, "\uf52f");
        ICON_MAP.put(FA_GAVEL, "\uf0e3");
        ICON_MAP.put(FA_GEM, "\uf3a5");
        ICON_MAP.put(FA_GENDERLESS, "\uf22d");
        ICON_MAP.put(FA_GHOST, "\uf6e2");
        ICON_MAP.put(FA_GIFT, "\uf06b");
        ICON_MAP.put(FA_GLASS_MARTINI, "\uf000");
        ICON_MAP.put(FA_GLASS_MARTINI_ALT, "\uf57b");
        ICON_MAP.put(FA_GLASSES, "\uf530");
        ICON_MAP.put(FA_GLOBE, "\uf0ac");
        ICON_MAP.put(FA_GLOBE_AFRICA, "\uf57c");
        ICON_MAP.put(FA_GLOBE_AMERICAS, "\uf57d");
        ICON_MAP.put(FA_GLOBE_ASIA, "\uf57e");
        ICON_MAP.put(FA_GOLF_BALL, "\uf450");
        ICON_MAP.put(FA_GOPURAM, "\uf664");
        ICON_MAP.put(FA_GRADUATION_CAP, "\uf19d");
        ICON_MAP.put(FA_GREATER_THAN, "\uf531");
        ICON_MAP.put(FA_GREATER_THAN_EQUAL, "\uf532");
        ICON_MAP.put(FA_GRIMACE, "\uf57f");
        ICON_MAP.put(FA_GRIN, "\uf580");
        ICON_MAP.put(FA_GRIN_ALT, "\uf581");
        ICON_MAP.put(FA_GRIN_BEAM, "\uf582");
        ICON_MAP.put(FA_GRIN_BEAM_SWEAT, "\uf583");
        ICON_MAP.put(FA_GRIN_HEARTS, "\uf584");
        ICON_MAP.put(FA_GRIN_SQUINT, "\uf585");
        ICON_MAP.put(FA_GRIN_SQUINT_TEARS, "\uf586");
        ICON_MAP.put(FA_GRIN_STARS, "\uf587");
        ICON_MAP.put(FA_GRIN_TEARS, "\uf588");
        ICON_MAP.put(FA_GRIN_TONGUE, "\uf589");
        ICON_MAP.put(FA_GRIN_TONGUE_SQUINT, "\uf58a");
        ICON_MAP.put(FA_GRIN_TONGUE_WINK, "\uf58b");
        ICON_MAP.put(FA_GRIN_WINK, "\uf58c");
        ICON_MAP.put(FA_GRIP_HORIZONTAL, "\uf58d");
        ICON_MAP.put(FA_GRIP_VERTICAL, "\uf58e");
        ICON_MAP.put(FA_H_SQUARE, "\uf0fd");
        ICON_MAP.put(FA_HAMMER, "\uf6e3");
        ICON_MAP.put(FA_HAMSA, "\uf665");
        ICON_MAP.put(FA_HAND_HOLDING, "\uf4bd");
        ICON_MAP.put(FA_HAND_HOLDING_HEART, "\uf4be");
        ICON_MAP.put(FA_HAND_HOLDING_USD, "\uf4c0");
        ICON_MAP.put(FA_HAND_LIZARD, "\uf258");
        ICON_MAP.put(FA_HAND_PAPER, "\uf256");
        ICON_MAP.put(FA_HAND_PEACE, "\uf25b");
        ICON_MAP.put(FA_HAND_POINT_DOWN, "\uf0a7");
        ICON_MAP.put(FA_HAND_POINT_LEFT, "\uf0a5");
        ICON_MAP.put(FA_HAND_POINT_RIGHT, "\uf0a4");
        ICON_MAP.put(FA_HAND_POINT_UP, "\uf0a6");
        ICON_MAP.put(FA_HAND_POINTER, "\uf25a");
        ICON_MAP.put(FA_HAND_ROCK, "\uf255");
        ICON_MAP.put(FA_HAND_SCISSORS, "\uf257");
        ICON_MAP.put(FA_HAND_SPOCK, "\uf259");
        ICON_MAP.put(FA_HANDS, "\uf4c2");
        ICON_MAP.put(FA_HANDS_HELPING, "\uf4c4");
        ICON_MAP.put(FA_HANDSHAKE, "\uf2b5");
        ICON_MAP.put(FA_HANUKIAH, "\uf6e6");
        ICON_MAP.put(FA_HASHTAG, "\uf292");
        ICON_MAP.put(FA_HAT_WIZARD, "\uf6e8");
        ICON_MAP.put(FA_HAYKAL, "\uf666");
        ICON_MAP.put(FA_HDD, "\uf0a0");
        ICON_MAP.put(FA_HEADING, "\uf1dc");
        ICON_MAP.put(FA_HEADPHONES, "\uf025");
        ICON_MAP.put(FA_HEADPHONES_ALT, "\uf58f");
        ICON_MAP.put(FA_HEADSET, "\uf590");
        ICON_MAP.put(FA_HEART, "\uf004");
        ICON_MAP.put(FA_HEARTBEAT, "\uf21e");
        ICON_MAP.put(FA_HELICOPTER, "\uf533");
        ICON_MAP.put(FA_HIGHLIGHTER, "\uf591");
        ICON_MAP.put(FA_HIKING, "\uf6ec");
        ICON_MAP.put(FA_HIPPO, "\uf6ed");
        ICON_MAP.put(FA_HISTORY, "\uf1da");
        ICON_MAP.put(FA_HOCKEY_PUCK, "\uf453");
        ICON_MAP.put(FA_HOME, "\uf015");
        ICON_MAP.put(FA_HORSE, "\uf6f0");
        ICON_MAP.put(FA_HOSPITAL, "\uf0f8");
        ICON_MAP.put(FA_HOSPITAL_ALT, "\uf47d");
        ICON_MAP.put(FA_HOSPITAL_SYMBOL, "\uf47e");
        ICON_MAP.put(FA_HOT_TUB, "\uf593");
        ICON_MAP.put(FA_HOTEL, "\uf594");
        ICON_MAP.put(FA_HOURGLASS, "\uf254");
        ICON_MAP.put(FA_HOURGLASS_END, "\uf253");
        ICON_MAP.put(FA_HOURGLASS_HALF, "\uf252");
        ICON_MAP.put(FA_HOURGLASS_START, "\uf251");
        ICON_MAP.put(FA_HOUSE_DAMAGE, "\uf6f1");
        ICON_MAP.put(FA_HRYVNIA, "\uf6f2");
        ICON_MAP.put(FA_I_CURSOR, "\uf246");
        ICON_MAP.put(FA_ID_BADGE, "\uf2c1");
        ICON_MAP.put(FA_ID_CARD, "\uf2c2");
        ICON_MAP.put(FA_ID_CARD_ALT, "\uf47f");
        ICON_MAP.put(FA_IMAGE, "\uf03e");
        ICON_MAP.put(FA_IMAGES, "\uf302");
        ICON_MAP.put(FA_INBOX, "\uf01c");
        ICON_MAP.put(FA_INDENT, "\uf03c");
        ICON_MAP.put(FA_INDUSTRY, "\uf275");
        ICON_MAP.put(FA_INFINITY, "\uf534");
        ICON_MAP.put(FA_INFO, "\uf129");
        ICON_MAP.put(FA_INFO_CIRCLE, "\uf05a");
        ICON_MAP.put(FA_ITALIC, "\uf033");
        ICON_MAP.put(FA_JEDI, "\uf669");
        ICON_MAP.put(FA_JOINT, "\uf595");
        ICON_MAP.put(FA_JOURNAL_WHILLS, "\uf66a");
        ICON_MAP.put(FA_KAABA, "\uf66b");
        ICON_MAP.put(FA_KEY, "\uf084");
        ICON_MAP.put(FA_KEYBOARD, "\uf11c");
        ICON_MAP.put(FA_KHANDA, "\uf66d");
        ICON_MAP.put(FA_KISS, "\uf596");
        ICON_MAP.put(FA_KISS_BEAM, "\uf597");
        ICON_MAP.put(FA_KISS_WINK_HEART, "\uf598");
        ICON_MAP.put(FA_KIWI_BIRD, "\uf535");
        ICON_MAP.put(FA_LANDMARK, "\uf66f");
        ICON_MAP.put(FA_LANGUAGE, "\uf1ab");
        ICON_MAP.put(FA_LAPTOP, "\uf109");
        ICON_MAP.put(FA_LAPTOP_CODE, "\uf5fc");
        ICON_MAP.put(FA_LAUGH, "\uf599");
        ICON_MAP.put(FA_LAUGH_BEAM, "\uf59a");
        ICON_MAP.put(FA_LAUGH_SQUINT, "\uf59b");
        ICON_MAP.put(FA_LAUGH_WINK, "\uf59c");
        ICON_MAP.put(FA_LAYER_GROUP, "\uf5fd");
        ICON_MAP.put(FA_LEAF, "\uf06c");
        ICON_MAP.put(FA_LEMON, "\uf094");
        ICON_MAP.put(FA_LESS_THAN, "\uf536");
        ICON_MAP.put(FA_LESS_THAN_EQUAL, "\uf537");
        ICON_MAP.put(FA_LEVEL_DOWN_ALT, "\uf3be");
        ICON_MAP.put(FA_LEVEL_UP_ALT, "\uf3bf");
        ICON_MAP.put(FA_LIFE_RING, "\uf1cd");
        ICON_MAP.put(FA_LIGHTBULB, "\uf0eb");
        ICON_MAP.put(FA_LINK, "\uf0c1");
        ICON_MAP.put(FA_LIRA_SIGN, "\uf195");
        ICON_MAP.put(FA_LIST, "\uf03a");
        ICON_MAP.put(FA_LIST_ALT, "\uf022");
        ICON_MAP.put(FA_LIST_OL, "\uf0cb");
        ICON_MAP.put(FA_LIST_UL, "\uf0ca");
        ICON_MAP.put(FA_LOCATION_ARROW, "\uf124");
        ICON_MAP.put(FA_LOCK, "\uf023");
        ICON_MAP.put(FA_LOCK_OPEN, "\uf3c1");
        ICON_MAP.put(FA_LONG_ARROW_ALT_DOWN, "\uf309");
        ICON_MAP.put(FA_LONG_ARROW_ALT_LEFT, "\uf30a");
        ICON_MAP.put(FA_LONG_ARROW_ALT_RIGHT, "\uf30b");
        ICON_MAP.put(FA_LONG_ARROW_ALT_UP, "\uf30c");
        ICON_MAP.put(FA_LOW_VISION, "\uf2a8");
        ICON_MAP.put(FA_LUGGAGE_CART, "\uf59d");
        ICON_MAP.put(FA_MAGIC, "\uf0d0");
        ICON_MAP.put(FA_MAGNET, "\uf076");
        ICON_MAP.put(FA_MAIL_BULK, "\uf674");
        ICON_MAP.put(FA_MALE, "\uf183");
        ICON_MAP.put(FA_MAP, "\uf279");
        ICON_MAP.put(FA_MAP_MARKED, "\uf59f");
        ICON_MAP.put(FA_MAP_MARKED_ALT, "\uf5a0");
        ICON_MAP.put(FA_MAP_MARKER, "\uf041");
        ICON_MAP.put(FA_MAP_MARKER_ALT, "\uf3c5");
        ICON_MAP.put(FA_MAP_PIN, "\uf276");
        ICON_MAP.put(FA_MAP_SIGNS, "\uf277");
        ICON_MAP.put(FA_MARKER, "\uf5a1");
        ICON_MAP.put(FA_MARS, "\uf222");
        ICON_MAP.put(FA_MARS_DOUBLE, "\uf227");
        ICON_MAP.put(FA_MARS_STROKE, "\uf229");
        ICON_MAP.put(FA_MARS_STROKE_H, "\uf22b");
        ICON_MAP.put(FA_MARS_STROKE_V, "\uf22a");
        ICON_MAP.put(FA_MASK, "\uf6fa");
        ICON_MAP.put(FA_MEDAL, "\uf5a2");
        ICON_MAP.put(FA_MEDKIT, "\uf0fa");
        ICON_MAP.put(FA_MEH, "\uf11a");
        ICON_MAP.put(FA_MEH_BLANK, "\uf5a4");
        ICON_MAP.put(FA_MEH_ROLLING_EYES, "\uf5a5");
        ICON_MAP.put(FA_MEMORY, "\uf538");
        ICON_MAP.put(FA_MENORAH, "\uf676");
        ICON_MAP.put(FA_MERCURY, "\uf223");
        ICON_MAP.put(FA_METEOR, "\uf753");
        ICON_MAP.put(FA_MICROCHIP, "\uf2db");
        ICON_MAP.put(FA_MICROPHONE, "\uf130");
        ICON_MAP.put(FA_MICROPHONE_ALT, "\uf3c9");
        ICON_MAP.put(FA_MICROPHONE_ALT_SLASH, "\uf539");
        ICON_MAP.put(FA_MICROPHONE_SLASH, "\uf131");
        ICON_MAP.put(FA_MICROSCOPE, "\uf610");
        ICON_MAP.put(FA_MINUS, "\uf068");
        ICON_MAP.put(FA_MINUS_CIRCLE, "\uf056");
        ICON_MAP.put(FA_MINUS_SQUARE, "\uf146");
        ICON_MAP.put(FA_MOBILE, "\uf10b");
        ICON_MAP.put(FA_MOBILE_ALT, "\uf3cd");
        ICON_MAP.put(FA_MONEY_BILL, "\uf0d6");
        ICON_MAP.put(FA_MONEY_BILL_ALT, "\uf3d1");
        ICON_MAP.put(FA_MONEY_BILL_WAVE, "\uf53a");
        ICON_MAP.put(FA_MONEY_BILL_WAVE_ALT, "\uf53b");
        ICON_MAP.put(FA_MONEY_CHECK, "\uf53c");
        ICON_MAP.put(FA_MONEY_CHECK_ALT, "\uf53d");
        ICON_MAP.put(FA_MONUMENT, "\uf5a6");
        ICON_MAP.put(FA_MOON, "\uf186");
        ICON_MAP.put(FA_MORTAR_PESTLE, "\uf5a7");
        ICON_MAP.put(FA_MOSQUE, "\uf678");
        ICON_MAP.put(FA_MOTORCYCLE, "\uf21c");
        ICON_MAP.put(FA_MOUNTAIN, "\uf6fc");
        ICON_MAP.put(FA_MOUSE_POINTER, "\uf245");
        ICON_MAP.put(FA_MUSIC, "\uf001");
        ICON_MAP.put(FA_NETWORK_WIRED, "\uf6ff");
        ICON_MAP.put(FA_NEUTER, "\uf22c");
        ICON_MAP.put(FA_NEWSPAPER, "\uf1ea");
        ICON_MAP.put(FA_NOT_EQUAL, "\uf53e");
        ICON_MAP.put(FA_NOTES_MEDICAL, "\uf481");
        ICON_MAP.put(FA_OBJECT_GROUP, "\uf247");
        ICON_MAP.put(FA_OBJECT_UNGROUP, "\uf248");
        ICON_MAP.put(FA_OIL_CAN, "\uf613");
        ICON_MAP.put(FA_OM, "\uf679");
        ICON_MAP.put(FA_OTTER, "\uf700");
        ICON_MAP.put(FA_OUTDENT, "\uf03b");
        ICON_MAP.put(FA_PAINT_BRUSH, "\uf1fc");
        ICON_MAP.put(FA_PAINT_ROLLER, "\uf5aa");
        ICON_MAP.put(FA_PALETTE, "\uf53f");
        ICON_MAP.put(FA_PALLET, "\uf482");
        ICON_MAP.put(FA_PAPER_PLANE, "\uf1d8");
        ICON_MAP.put(FA_PAPERCLIP, "\uf0c6");
        ICON_MAP.put(FA_PARACHUTE_BOX, "\uf4cd");
        ICON_MAP.put(FA_PARAGRAPH, "\uf1dd");
        ICON_MAP.put(FA_PARKING, "\uf540");
        ICON_MAP.put(FA_PASSPORT, "\uf5ab");
        ICON_MAP.put(FA_PASTAFARIANISM, "\uf67b");
        ICON_MAP.put(FA_PASTE, "\uf0ea");
        ICON_MAP.put(FA_PAUSE, "\uf04c");
        ICON_MAP.put(FA_PAUSE_CIRCLE, "\uf28b");
        ICON_MAP.put(FA_PAW, "\uf1b0");
        ICON_MAP.put(FA_PEACE, "\uf67c");
        ICON_MAP.put(FA_PEN, "\uf304");
        ICON_MAP.put(FA_PEN_ALT, "\uf305");
        ICON_MAP.put(FA_PEN_FANCY, "\uf5ac");
        ICON_MAP.put(FA_PEN_NIB, "\uf5ad");
        ICON_MAP.put(FA_PEN_SQUARE, "\uf14b");
        ICON_MAP.put(FA_PENCIL_ALT, "\uf303");
        ICON_MAP.put(FA_PENCIL_RULER, "\uf5ae");
        ICON_MAP.put(FA_PEOPLE_CARRY, "\uf4ce");
        ICON_MAP.put(FA_PERCENT, "\uf295");
        ICON_MAP.put(FA_PERCENTAGE, "\uf541");
        ICON_MAP.put(FA_PERSON_BOOTH, "\uf756");
        ICON_MAP.put(FA_PHONE, "\uf095");
        ICON_MAP.put(FA_PHONE_SLASH, "\uf3dd");
        ICON_MAP.put(FA_PHONE_SQUARE, "\uf098");
        ICON_MAP.put(FA_PHONE_VOLUME, "\uf2a0");
        ICON_MAP.put(FA_PIGGY_BANK, "\uf4d3");
        ICON_MAP.put(FA_PILLS, "\uf484");
        ICON_MAP.put(FA_PLACE_OF_WORSHIP, "\uf67f");
        ICON_MAP.put(FA_PLANE, "\uf072");
        ICON_MAP.put(FA_PLANE_ARRIVAL, "\uf5af");
        ICON_MAP.put(FA_PLANE_DEPARTURE, "\uf5b0");
        ICON_MAP.put(FA_PLAY, "\uf04b");
        ICON_MAP.put(FA_PLAY_CIRCLE, "\uf144");
        ICON_MAP.put(FA_PLUG, "\uf1e6");
        ICON_MAP.put(FA_PLUS, "\uf067");
        ICON_MAP.put(FA_PLUS_CIRCLE, "\uf055");
        ICON_MAP.put(FA_PLUS_SQUARE, "\uf0fe");
        ICON_MAP.put(FA_PODCAST, "\uf2ce");
        ICON_MAP.put(FA_POLL, "\uf681");
        ICON_MAP.put(FA_POLL_H, "\uf682");
        ICON_MAP.put(FA_POO, "\uf2fe");
        ICON_MAP.put(FA_POO_STORM, "\uf75a");
        ICON_MAP.put(FA_POOP, "\uf619");
        ICON_MAP.put(FA_PORTRAIT, "\uf3e0");
        ICON_MAP.put(FA_POUND_SIGN, "\uf154");
        ICON_MAP.put(FA_POWER_OFF, "\uf011");
        ICON_MAP.put(FA_PRAY, "\uf683");
        ICON_MAP.put(FA_PRAYING_HANDS, "\uf684");
        ICON_MAP.put(FA_PRESCRIPTION, "\uf5b1");
        ICON_MAP.put(FA_PRESCRIPTION_BOTTLE, "\uf485");
        ICON_MAP.put(FA_PRESCRIPTION_BOTTLE_ALT, "\uf486");
        ICON_MAP.put(FA_PRINT, "\uf02f");
        ICON_MAP.put(FA_PROCEDURES, "\uf487");
        ICON_MAP.put(FA_PROJECT_DIAGRAM, "\uf542");
        ICON_MAP.put(FA_PUZZLE_PIECE, "\uf12e");
        ICON_MAP.put(FA_QRCODE, "\uf029");
        ICON_MAP.put(FA_QUESTION, "\uf128");
        ICON_MAP.put(FA_QUESTION_CIRCLE, "\uf059");
        ICON_MAP.put(FA_QUIDDITCH, "\uf458");
        ICON_MAP.put(FA_QUOTE_LEFT, "\uf10d");
        ICON_MAP.put(FA_QUOTE_RIGHT, "\uf10e");
        ICON_MAP.put(FA_QURAN, "\uf687");
        ICON_MAP.put(FA_RAINBOW, "\uf75b");
        ICON_MAP.put(FA_RANDOM, "\uf074");
        ICON_MAP.put(FA_RECEIPT, "\uf543");
        ICON_MAP.put(FA_RECYCLE, "\uf1b8");
        ICON_MAP.put(FA_REDO, "\uf01e");
        ICON_MAP.put(FA_REDO_ALT, "\uf2f9");
        ICON_MAP.put(FA_REGISTERED, "\uf25d");
        ICON_MAP.put(FA_REPLY, "\uf3e5");
        ICON_MAP.put(FA_REPLY_ALL, "\uf122");
        ICON_MAP.put(FA_REPUBLICAN, "\uf75e");
        ICON_MAP.put(FA_RETWEET, "\uf079");
        ICON_MAP.put(FA_RIBBON, "\uf4d6");
        ICON_MAP.put(FA_RING, "\uf70b");
        ICON_MAP.put(FA_ROAD, "\uf018");
        ICON_MAP.put(FA_ROBOT, "\uf544");
        ICON_MAP.put(FA_ROCKET, "\uf135");
        ICON_MAP.put(FA_ROUTE, "\uf4d7");
        ICON_MAP.put(FA_RSS, "\uf09e");
        ICON_MAP.put(FA_RSS_SQUARE, "\uf143");
        ICON_MAP.put(FA_RUBLE_SIGN, "\uf158");
        ICON_MAP.put(FA_RULER, "\uf545");
        ICON_MAP.put(FA_RULER_COMBINED, "\uf546");
        ICON_MAP.put(FA_RULER_HORIZONTAL, "\uf547");
        ICON_MAP.put(FA_RULER_VERTICAL, "\uf548");
        ICON_MAP.put(FA_RUNNING, "\uf70c");
        ICON_MAP.put(FA_RUPEE_SIGN, "\uf156");
        ICON_MAP.put(FA_SAD_CRY, "\uf5b3");
        ICON_MAP.put(FA_SAD_TEAR, "\uf5b4");
        ICON_MAP.put(FA_SAVE, "\uf0c7");
        ICON_MAP.put(FA_SCHOOL, "\uf549");
        ICON_MAP.put(FA_SCREWDRIVER, "\uf54a");
        ICON_MAP.put(FA_SCROLL, "\uf70e");
        ICON_MAP.put(FA_SEARCH, "\uf002");
        ICON_MAP.put(FA_SEARCH_DOLLAR, "\uf688");
        ICON_MAP.put(FA_SEARCH_LOCATION, "\uf689");
        ICON_MAP.put(FA_SEARCH_MINUS, "\uf010");
        ICON_MAP.put(FA_SEARCH_PLUS, "\uf00e");
        ICON_MAP.put(FA_SEEDLING, "\uf4d8");
        ICON_MAP.put(FA_SERVER, "\uf233");
        ICON_MAP.put(FA_SHAPES, "\uf61f");
        ICON_MAP.put(FA_SHARE, "\uf064");
        ICON_MAP.put(FA_SHARE_ALT, "\uf1e0");
        ICON_MAP.put(FA_SHARE_ALT_SQUARE, "\uf1e1");
        ICON_MAP.put(FA_SHARE_SQUARE, "\uf14d");
        ICON_MAP.put(FA_SHEKEL_SIGN, "\uf20b");
        ICON_MAP.put(FA_SHIELD_ALT, "\uf3ed");
        ICON_MAP.put(FA_SHIP, "\uf21a");
        ICON_MAP.put(FA_SHIPPING_FAST, "\uf48b");
        ICON_MAP.put(FA_SHOE_PRINTS, "\uf54b");
        ICON_MAP.put(FA_SHOPPING_BAG, "\uf290");
        ICON_MAP.put(FA_SHOPPING_BASKET, "\uf291");
        ICON_MAP.put(FA_SHOPPING_CART, "\uf07a");
        ICON_MAP.put(FA_SHOWER, "\uf2cc");
        ICON_MAP.put(FA_SHUTTLE_VAN, "\uf5b6");
        ICON_MAP.put(FA_SIGN, "\uf4d9");
        ICON_MAP.put(FA_SIGN_IN_ALT, "\uf2f6");
        ICON_MAP.put(FA_SIGN_LANGUAGE, "\uf2a7");
        ICON_MAP.put(FA_SIGN_OUT_ALT, "\uf2f5");
        ICON_MAP.put(FA_SIGNAL, "\uf012");
        ICON_MAP.put(FA_SIGNATURE, "\uf5b7");
        ICON_MAP.put(FA_SITEMAP, "\uf0e8");
        ICON_MAP.put(FA_SKULL, "\uf54c");
        ICON_MAP.put(FA_SKULL_CROSSBONES, "\uf714");
        ICON_MAP.put(FA_SLASH, "\uf715");
        ICON_MAP.put(FA_SLIDERS_H, "\uf1de");
        ICON_MAP.put(FA_SMILE, "\uf118");
        ICON_MAP.put(FA_SMILE_BEAM, "\uf5b8");
        ICON_MAP.put(FA_SMILE_WINK, "\uf4da");
        ICON_MAP.put(FA_SMOG, "\uf75f");
        ICON_MAP.put(FA_SMOKING, "\uf48d");
        ICON_MAP.put(FA_SMOKING_BAN, "\uf54d");
        ICON_MAP.put(FA_SNOWFLAKE, "\uf2dc");
        ICON_MAP.put(FA_SOCKS, "\uf696");
        ICON_MAP.put(FA_SOLAR_PANEL, "\uf5ba");
        ICON_MAP.put(FA_SORT, "\uf0dc");
        ICON_MAP.put(FA_SORT_ALPHA_DOWN, "\uf15d");
        ICON_MAP.put(FA_SORT_ALPHA_UP, "\uf15e");
        ICON_MAP.put(FA_SORT_AMOUNT_DOWN, "\uf160");
        ICON_MAP.put(FA_SORT_AMOUNT_UP, "\uf161");
        ICON_MAP.put(FA_SORT_DOWN, "\uf0dd");
        ICON_MAP.put(FA_SORT_NUMERIC_DOWN, "\uf162");
        ICON_MAP.put(FA_SORT_NUMERIC_UP, "\uf163");
        ICON_MAP.put(FA_SORT_UP, "\uf0de");
        ICON_MAP.put(FA_SPA, "\uf5bb");
        ICON_MAP.put(FA_SPACE_SHUTTLE, "\uf197");
        ICON_MAP.put(FA_SPIDER, "\uf717");
        ICON_MAP.put(FA_SPINNER, "\uf110");
        ICON_MAP.put(FA_SPLOTCH, "\uf5bc");
        ICON_MAP.put(FA_SPRAY_CAN, "\uf5bd");
        ICON_MAP.put(FA_SQUARE, "\uf0c8");
        ICON_MAP.put(FA_SQUARE_FULL, "\uf45c");
        ICON_MAP.put(FA_SQUARE_ROOT_ALT, "\uf698");
        ICON_MAP.put(FA_STAMP, "\uf5bf");
        ICON_MAP.put(FA_STAR, "\uf005");
        ICON_MAP.put(FA_STAR_AND_CRESCENT, "\uf699");
        ICON_MAP.put(FA_STAR_HALF, "\uf089");
        ICON_MAP.put(FA_STAR_HALF_ALT, "\uf5c0");
        ICON_MAP.put(FA_STAR_OF_DAVID, "\uf69a");
        ICON_MAP.put(FA_STAR_OF_LIFE, "\uf621");
        ICON_MAP.put(FA_STEP_BACKWARD, "\uf048");
        ICON_MAP.put(FA_STEP_FORWARD, "\uf051");
        ICON_MAP.put(FA_STETHOSCOPE, "\uf0f1");
        ICON_MAP.put(FA_STICKY_NOTE, "\uf249");
        ICON_MAP.put(FA_STOP, "\uf04d");
        ICON_MAP.put(FA_STOP_CIRCLE, "\uf28d");
        ICON_MAP.put(FA_STOPWATCH, "\uf2f2");
        ICON_MAP.put(FA_STORE, "\uf54e");
        ICON_MAP.put(FA_STORE_ALT, "\uf54f");
        ICON_MAP.put(FA_STREAM, "\uf550");
        ICON_MAP.put(FA_STREET_VIEW, "\uf21d");
        ICON_MAP.put(FA_STRIKETHROUGH, "\uf0cc");
        ICON_MAP.put(FA_STROOPWAFEL, "\uf551");
        ICON_MAP.put(FA_SUBSCRIPT, "\uf12c");
        ICON_MAP.put(FA_SUBWAY, "\uf239");
        ICON_MAP.put(FA_SUITCASE, "\uf0f2");
        ICON_MAP.put(FA_SUITCASE_ROLLING, "\uf5c1");
        ICON_MAP.put(FA_SUN, "\uf185");
        ICON_MAP.put(FA_SUPERSCRIPT, "\uf12b");
        ICON_MAP.put(FA_SURPRISE, "\uf5c2");
        ICON_MAP.put(FA_SWATCHBOOK, "\uf5c3");
        ICON_MAP.put(FA_SWIMMER, "\uf5c4");
        ICON_MAP.put(FA_SWIMMING_POOL, "\uf5c5");
        ICON_MAP.put(FA_SYNAGOGUE, "\uf69b");
        ICON_MAP.put(FA_SYNC, "\uf021");
        ICON_MAP.put(FA_SYNC_ALT, "\uf2f1");
        ICON_MAP.put(FA_SYRINGE, "\uf48e");
        ICON_MAP.put(FA_TABLE, "\uf0ce");
        ICON_MAP.put(FA_TABLE_TENNIS, "\uf45d");
        ICON_MAP.put(FA_TABLET, "\uf10a");
        ICON_MAP.put(FA_TABLET_ALT, "\uf3fa");
        ICON_MAP.put(FA_TABLETS, "\uf490");
        ICON_MAP.put(FA_TACHOMETER_ALT, "\uf3fd");
        ICON_MAP.put(FA_TAG, "\uf02b");
        ICON_MAP.put(FA_TAGS, "\uf02c");
        ICON_MAP.put(FA_TAPE, "\uf4db");
        ICON_MAP.put(FA_TASKS, "\uf0ae");
        ICON_MAP.put(FA_TAXI, "\uf1ba");
        ICON_MAP.put(FA_TEETH, "\uf62e");
        ICON_MAP.put(FA_TEETH_OPEN, "\uf62f");
        ICON_MAP.put(FA_TEMPERATURE_HIGH, "\uf769");
        ICON_MAP.put(FA_TEMPERATURE_LOW, "\uf76b");
        ICON_MAP.put(FA_TERMINAL, "\uf120");
        ICON_MAP.put(FA_TEXT_HEIGHT, "\uf034");
        ICON_MAP.put(FA_TEXT_WIDTH, "\uf035");
        ICON_MAP.put(FA_TH, "\uf00a");
        ICON_MAP.put(FA_TH_LARGE, "\uf009");
        ICON_MAP.put(FA_TH_LIST, "\uf00b");
        ICON_MAP.put(FA_THEATER_MASKS, "\uf630");
        ICON_MAP.put(FA_THERMOMETER, "\uf491");
        ICON_MAP.put(FA_THERMOMETER_EMPTY, "\uf2cb");
        ICON_MAP.put(FA_THERMOMETER_FULL, "\uf2c7");
        ICON_MAP.put(FA_THERMOMETER_HALF, "\uf2c9");
        ICON_MAP.put(FA_THERMOMETER_QUARTER, "\uf2ca");
        ICON_MAP.put(FA_THERMOMETER_THREE_QUARTERS, "\uf2c8");
        ICON_MAP.put(FA_THUMBS_DOWN, "\uf165");
        ICON_MAP.put(FA_THUMBS_UP, "\uf164");
        ICON_MAP.put(FA_THUMBTACK, "\uf08d");
        ICON_MAP.put(FA_TICKET_ALT, "\uf3ff");
        ICON_MAP.put(FA_TIMES, "\uf00d");
        ICON_MAP.put(FA_TIMES_CIRCLE, "\uf057");
        ICON_MAP.put(FA_TINT, "\uf043");
        ICON_MAP.put(FA_TINT_SLASH, "\uf5c7");
        ICON_MAP.put(FA_TIRED, "\uf5c8");
        ICON_MAP.put(FA_TOGGLE_OFF, "\uf204");
        ICON_MAP.put(FA_TOGGLE_ON, "\uf205");
        ICON_MAP.put(FA_TOILET_PAPER, "\uf71e");
        ICON_MAP.put(FA_TOOLBOX, "\uf552");
        ICON_MAP.put(FA_TOOTH, "\uf5c9");
        ICON_MAP.put(FA_TORAH, "\uf6a0");
        ICON_MAP.put(FA_TORII_GATE, "\uf6a1");
        ICON_MAP.put(FA_TRACTOR, "\uf722");
        ICON_MAP.put(FA_TRADEMARK, "\uf25c");
        ICON_MAP.put(FA_TRAFFIC_LIGHT, "\uf637");
        ICON_MAP.put(FA_TRAIN, "\uf238");
        ICON_MAP.put(FA_TRANSGENDER, "\uf224");
        ICON_MAP.put(FA_TRANSGENDER_ALT, "\uf225");
        ICON_MAP.put(FA_TRASH, "\uf1f8");
        ICON_MAP.put(FA_TRASH_ALT, "\uf2ed");
        ICON_MAP.put(FA_TREE, "\uf1bb");
        ICON_MAP.put(FA_TROPHY, "\uf091");
        ICON_MAP.put(FA_TRUCK, "\uf0d1");
        ICON_MAP.put(FA_TRUCK_LOADING, "\uf4de");
        ICON_MAP.put(FA_TRUCK_MONSTER, "\uf63b");
        ICON_MAP.put(FA_TRUCK_MOVING, "\uf4df");
        ICON_MAP.put(FA_TRUCK_PICKUP, "\uf63c");
        ICON_MAP.put(FA_TSHIRT, "\uf553");
        ICON_MAP.put(FA_TTY, "\uf1e4");
        ICON_MAP.put(FA_TV, "\uf26c");
        ICON_MAP.put(FA_UMBRELLA, "\uf0e9");
        ICON_MAP.put(FA_UMBRELLA_BEACH, "\uf5ca");
        ICON_MAP.put(FA_UNDERLINE, "\uf0cd");
        ICON_MAP.put(FA_UNDO, "\uf0e2");
        ICON_MAP.put(FA_UNDO_ALT, "\uf2ea");
        ICON_MAP.put(FA_UNIVERSAL_ACCESS, "\uf29a");
        ICON_MAP.put(FA_UNIVERSITY, "\uf19c");
        ICON_MAP.put(FA_UNLINK, "\uf127");
        ICON_MAP.put(FA_UNLOCK, "\uf09c");
        ICON_MAP.put(FA_UNLOCK_ALT, "\uf13e");
        ICON_MAP.put(FA_UPLOAD, "\uf093");
        ICON_MAP.put(FA_USER, "\uf007");
        ICON_MAP.put(FA_USER_ALT, "\uf406");
        ICON_MAP.put(FA_USER_ALT_SLASH, "\uf4fa");
        ICON_MAP.put(FA_USER_ASTRONAUT, "\uf4fb");
        ICON_MAP.put(FA_USER_CHECK, "\uf4fc");
        ICON_MAP.put(FA_USER_CIRCLE, "\uf2bd");
        ICON_MAP.put(FA_USER_CLOCK, "\uf4fd");
        ICON_MAP.put(FA_USER_COG, "\uf4fe");
        ICON_MAP.put(FA_USER_EDIT, "\uf4ff");
        ICON_MAP.put(FA_USER_FRIENDS, "\uf500");
        ICON_MAP.put(FA_USER_GRADUATE, "\uf501");
        ICON_MAP.put(FA_USER_INJURED, "\uf728");
        ICON_MAP.put(FA_USER_LOCK, "\uf502");
        ICON_MAP.put(FA_USER_MD, "\uf0f0");
        ICON_MAP.put(FA_USER_MINUS, "\uf503");
        ICON_MAP.put(FA_USER_NINJA, "\uf504");
        ICON_MAP.put(FA_USER_PLUS, "\uf234");
        ICON_MAP.put(FA_USER_SECRET, "\uf21b");
        ICON_MAP.put(FA_USER_SHIELD, "\uf505");
        ICON_MAP.put(FA_USER_SLASH, "\uf506");
        ICON_MAP.put(FA_USER_TAG, "\uf507");
        ICON_MAP.put(FA_USER_TIE, "\uf508");
        ICON_MAP.put(FA_USER_TIMES, "\uf235");
        ICON_MAP.put(FA_USERS, "\uf0c0");
        ICON_MAP.put(FA_USERS_COG, "\uf509");
        ICON_MAP.put(FA_UTENSIL_SPOON, "\uf2e5");
        ICON_MAP.put(FA_UTENSILS, "\uf2e7");
        ICON_MAP.put(FA_VECTOR_SQUARE, "\uf5cb");
        ICON_MAP.put(FA_VENUS, "\uf221");
        ICON_MAP.put(FA_VENUS_DOUBLE, "\uf226");
        ICON_MAP.put(FA_VENUS_MARS, "\uf228");
        ICON_MAP.put(FA_VIAL, "\uf492");
        ICON_MAP.put(FA_VIALS, "\uf493");
        ICON_MAP.put(FA_VIDEO, "\uf03d");
        ICON_MAP.put(FA_VIDEO_SLASH, "\uf4e2");
        ICON_MAP.put(FA_VIHARA, "\uf6a7");
        ICON_MAP.put(FA_VOLLEYBALL_BALL, "\uf45f");
        ICON_MAP.put(FA_VOLUME_DOWN, "\uf027");
        ICON_MAP.put(FA_VOLUME_MUTE, "\uf6a9");
        ICON_MAP.put(FA_VOLUME_OFF, "\uf026");
        ICON_MAP.put(FA_VOLUME_UP, "\uf028");
        ICON_MAP.put(FA_VOTE_YEA, "\uf772");
        ICON_MAP.put(FA_VR_CARDBOARD, "\uf729");
        ICON_MAP.put(FA_WALKING, "\uf554");
        ICON_MAP.put(FA_WALLET, "\uf555");
        ICON_MAP.put(FA_WAREHOUSE, "\uf494");
        ICON_MAP.put(FA_WATER, "\uf773");
        ICON_MAP.put(FA_WEIGHT, "\uf496");
        ICON_MAP.put(FA_WEIGHT_HANGING, "\uf5cd");
        ICON_MAP.put(FA_WHEELCHAIR, "\uf193");
        ICON_MAP.put(FA_WIFI, "\uf1eb");
        ICON_MAP.put(FA_WIND, "\uf72e");
        ICON_MAP.put(FA_WINDOW_CLOSE, "\uf410");
        ICON_MAP.put(FA_WINDOW_MAXIMIZE, "\uf2d0");
        ICON_MAP.put(FA_WINDOW_MINIMIZE, "\uf2d1");
        ICON_MAP.put(FA_WINDOW_RESTORE, "\uf2d2");
        ICON_MAP.put(FA_WINE_BOTTLE, "\uf72f");
        ICON_MAP.put(FA_WINE_GLASS, "\uf4e3");
        ICON_MAP.put(FA_WINE_GLASS_ALT, "\uf5ce");
        ICON_MAP.put(FA_WON_SIGN, "\uf159");
        ICON_MAP.put(FA_WRENCH, "\uf0ad");
        ICON_MAP.put(FA_X_RAY, "\uf497");
        ICON_MAP.put(FA_YEN_SIGN, "\uf157");
        ICON_MAP.put(FA_YIN_YANG, "\uf6ad");

        ATTR_MAP.put(0, FA_AD);
        ATTR_MAP.put(1, FA_ADDRESS_BOOK);
        ATTR_MAP.put(2, FA_ADDRESS_CARD);
        ATTR_MAP.put(3, FA_ADJUST);
        ATTR_MAP.put(4, FA_AIR_FRESHENER);
        ATTR_MAP.put(5, FA_ALIGN_CENTER);
        ATTR_MAP.put(6, FA_ALIGN_JUSTIFY);
        ATTR_MAP.put(7, FA_ALIGN_LEFT);
        ATTR_MAP.put(8, FA_ALIGN_RIGHT);
        ATTR_MAP.put(9, FA_ALLERGIES);
        ATTR_MAP.put(10, FA_AMBULANCE);
        ATTR_MAP.put(11, FA_AMERICAN_SIGN_LANGUAGE_INTERPRETING);
        ATTR_MAP.put(12, FA_ANCHOR);
        ATTR_MAP.put(13, FA_ANGLE_DOUBLE_DOWN);
        ATTR_MAP.put(14, FA_ANGLE_DOUBLE_LEFT);
        ATTR_MAP.put(15, FA_ANGLE_DOUBLE_RIGHT);
        ATTR_MAP.put(16, FA_ANGLE_DOUBLE_UP);
        ATTR_MAP.put(17, FA_ANGLE_DOWN);
        ATTR_MAP.put(18, FA_ANGLE_LEFT);
        ATTR_MAP.put(19, FA_ANGLE_RIGHT);
        ATTR_MAP.put(20, FA_ANGLE_UP);
        ATTR_MAP.put(21, FA_ANGRY);
        ATTR_MAP.put(22, FA_ANKH);
        ATTR_MAP.put(23, FA_APPLE_ALT);
        ATTR_MAP.put(24, FA_ARCHIVE);
        ATTR_MAP.put(25, FA_ARCHWAY);
        ATTR_MAP.put(26, FA_ARROW_ALT_CIRCLE_DOWN);
        ATTR_MAP.put(27, FA_ARROW_ALT_CIRCLE_LEFT);
        ATTR_MAP.put(28, FA_ARROW_ALT_CIRCLE_RIGHT);
        ATTR_MAP.put(29, FA_ARROW_ALT_CIRCLE_UP);
        ATTR_MAP.put(30, FA_ARROW_CIRCLE_DOWN);
        ATTR_MAP.put(31, FA_ARROW_CIRCLE_LEFT);
        ATTR_MAP.put(32, FA_ARROW_CIRCLE_RIGHT);
        ATTR_MAP.put(33, FA_ARROW_CIRCLE_UP);
        ATTR_MAP.put(34, FA_ARROW_DOWN);
        ATTR_MAP.put(35, FA_ARROW_LEFT);
        ATTR_MAP.put(36, FA_ARROW_RIGHT);
        ATTR_MAP.put(37, FA_ARROW_UP);
        ATTR_MAP.put(38, FA_ARROWS_ALT);
        ATTR_MAP.put(39, FA_ARROWS_ALT_H);
        ATTR_MAP.put(40, FA_ARROWS_ALT_V);
        ATTR_MAP.put(41, FA_ASSISTIVE_LISTENING_SYSTEMS);
        ATTR_MAP.put(42, FA_ASTERISK);
        ATTR_MAP.put(43, FA_AT);
        ATTR_MAP.put(44, FA_ATLAS);
        ATTR_MAP.put(45, FA_ATOM);
        ATTR_MAP.put(46, FA_AUDIO_DESCRIPTION);
        ATTR_MAP.put(47, FA_AWARD);
        ATTR_MAP.put(48, FA_BACKSPACE);
        ATTR_MAP.put(49, FA_BACKWARD);
        ATTR_MAP.put(50, FA_BALANCE_SCALE);
        ATTR_MAP.put(51, FA_BAN);
        ATTR_MAP.put(52, FA_BAND_AID);
        ATTR_MAP.put(53, FA_BARCODE);
        ATTR_MAP.put(54, FA_BARS);
        ATTR_MAP.put(55, FA_BASEBALL_BALL);
        ATTR_MAP.put(56, FA_BASKETBALL_BALL);
        ATTR_MAP.put(57, FA_BATH);
        ATTR_MAP.put(58, FA_BATTERY_EMPTY);
        ATTR_MAP.put(59, FA_BATTERY_FULL);
        ATTR_MAP.put(60, FA_BATTERY_HALF);
        ATTR_MAP.put(61, FA_BATTERY_QUARTER);
        ATTR_MAP.put(62, FA_BATTERY_THREE_QUARTERS);
        ATTR_MAP.put(63, FA_BED);
        ATTR_MAP.put(64, FA_BEER);
        ATTR_MAP.put(65, FA_BELL);
        ATTR_MAP.put(66, FA_BELL_SLASH);
        ATTR_MAP.put(67, FA_BEZIER_CURVE);
        ATTR_MAP.put(68, FA_BIBLE);
        ATTR_MAP.put(69, FA_BICYCLE);
        ATTR_MAP.put(70, FA_BINOCULARS);
        ATTR_MAP.put(71, FA_BIRTHDAY_CAKE);
        ATTR_MAP.put(72, FA_BLENDER);
        ATTR_MAP.put(73, FA_BLENDER_PHONE);
        ATTR_MAP.put(74, FA_BLIND);
        ATTR_MAP.put(75, FA_BOLD);
        ATTR_MAP.put(76, FA_BOLT);
        ATTR_MAP.put(77, FA_BOMB);
        ATTR_MAP.put(78, FA_BONE);
        ATTR_MAP.put(79, FA_BONG);
        ATTR_MAP.put(80, FA_BOOK);
        ATTR_MAP.put(81, FA_BOOK_DEAD);
        ATTR_MAP.put(82, FA_BOOK_OPEN);
        ATTR_MAP.put(83, FA_BOOK_READER);
        ATTR_MAP.put(84, FA_BOOKMARK);
        ATTR_MAP.put(85, FA_BOWLING_BALL);
        ATTR_MAP.put(86, FA_BOX);
        ATTR_MAP.put(87, FA_BOX_OPEN);
        ATTR_MAP.put(88, FA_BOXES);
        ATTR_MAP.put(89, FA_BRAILLE);
        ATTR_MAP.put(90, FA_BRAIN);
        ATTR_MAP.put(91, FA_BRIEFCASE);
        ATTR_MAP.put(92, FA_BRIEFCASE_MEDICAL);
        ATTR_MAP.put(93, FA_BROADCAST_TOWER);
        ATTR_MAP.put(94, FA_BROOM);
        ATTR_MAP.put(95, FA_BRUSH);
        ATTR_MAP.put(96, FA_BUG);
        ATTR_MAP.put(97, FA_BUILDING);
        ATTR_MAP.put(98, FA_BULLHORN);
        ATTR_MAP.put(99, FA_BULLSEYE);
        ATTR_MAP.put(100, FA_BURN);
        ATTR_MAP.put(101, FA_BUS);
        ATTR_MAP.put(102, FA_BUS_ALT);
        ATTR_MAP.put(103, FA_BUSINESS_TIME);
        ATTR_MAP.put(104, FA_CALCULATOR);
        ATTR_MAP.put(105, FA_CALENDAR);
        ATTR_MAP.put(106, FA_CALENDAR_ALT);
        ATTR_MAP.put(107, FA_CALENDAR_CHECK);
        ATTR_MAP.put(108, FA_CALENDAR_MINUS);
        ATTR_MAP.put(109, FA_CALENDAR_PLUS);
        ATTR_MAP.put(110, FA_CALENDAR_TIMES);
        ATTR_MAP.put(111, FA_CAMERA);
        ATTR_MAP.put(112, FA_CAMERA_RETRO);
        ATTR_MAP.put(113, FA_CAMPGROUND);
        ATTR_MAP.put(114, FA_CANNABIS);
        ATTR_MAP.put(115, FA_CAPSULES);
        ATTR_MAP.put(116, FA_CAR);
        ATTR_MAP.put(117, FA_CAR_ALT);
        ATTR_MAP.put(118, FA_CAR_BATTERY);
        ATTR_MAP.put(119, FA_CAR_CRASH);
        ATTR_MAP.put(120, FA_CAR_SIDE);
        ATTR_MAP.put(121, FA_CARET_DOWN);
        ATTR_MAP.put(122, FA_CARET_LEFT);
        ATTR_MAP.put(123, FA_CARET_RIGHT);
        ATTR_MAP.put(124, FA_CARET_SQUARE_DOWN);
        ATTR_MAP.put(125, FA_CARET_SQUARE_LEFT);
        ATTR_MAP.put(126, FA_CARET_SQUARE_RIGHT);
        ATTR_MAP.put(127, FA_CARET_SQUARE_UP);
        ATTR_MAP.put(128, FA_CARET_UP);
        ATTR_MAP.put(129, FA_CART_ARROW_DOWN);
        ATTR_MAP.put(130, FA_CART_PLUS);
        ATTR_MAP.put(131, FA_CAT);
        ATTR_MAP.put(132, FA_CERTIFICATE);
        ATTR_MAP.put(133, FA_CHAIR);
        ATTR_MAP.put(134, FA_CHALKBOARD);
        ATTR_MAP.put(135, FA_CHALKBOARD_TEACHER);
        ATTR_MAP.put(136, FA_CHARGING_STATION);
        ATTR_MAP.put(137, FA_CHART_AREA);
        ATTR_MAP.put(138, FA_CHART_BAR);
        ATTR_MAP.put(139, FA_CHART_LINE);
        ATTR_MAP.put(140, FA_CHART_PIE);
        ATTR_MAP.put(141, FA_CHECK);
        ATTR_MAP.put(142, FA_CHECK_CIRCLE);
        ATTR_MAP.put(143, FA_CHECK_DOUBLE);
        ATTR_MAP.put(144, FA_CHECK_SQUARE);
        ATTR_MAP.put(145, FA_CHESS);
        ATTR_MAP.put(146, FA_CHESS_BISHOP);
        ATTR_MAP.put(147, FA_CHESS_BOARD);
        ATTR_MAP.put(148, FA_CHESS_KING);
        ATTR_MAP.put(149, FA_CHESS_KNIGHT);
        ATTR_MAP.put(150, FA_CHESS_PAWN);
        ATTR_MAP.put(151, FA_CHESS_QUEEN);
        ATTR_MAP.put(152, FA_CHESS_ROOK);
        ATTR_MAP.put(153, FA_CHEVRON_CIRCLE_DOWN);
        ATTR_MAP.put(154, FA_CHEVRON_CIRCLE_LEFT);
        ATTR_MAP.put(155, FA_CHEVRON_CIRCLE_RIGHT);
        ATTR_MAP.put(156, FA_CHEVRON_CIRCLE_UP);
        ATTR_MAP.put(157, FA_CHEVRON_DOWN);
        ATTR_MAP.put(158, FA_CHEVRON_LEFT);
        ATTR_MAP.put(159, FA_CHEVRON_RIGHT);
        ATTR_MAP.put(160, FA_CHEVRON_UP);
        ATTR_MAP.put(161, FA_CHILD);
        ATTR_MAP.put(162, FA_CHURCH);
        ATTR_MAP.put(163, FA_CIRCLE);
        ATTR_MAP.put(164, FA_CIRCLE_NOTCH);
        ATTR_MAP.put(165, FA_CITY);
        ATTR_MAP.put(166, FA_CLIPBOARD);
        ATTR_MAP.put(167, FA_CLIPBOARD_CHECK);
        ATTR_MAP.put(168, FA_CLIPBOARD_LIST);
        ATTR_MAP.put(169, FA_CLOCK);
        ATTR_MAP.put(170, FA_CLONE);
        ATTR_MAP.put(171, FA_CLOSED_CAPTIONING);
        ATTR_MAP.put(172, FA_CLOUD);
        ATTR_MAP.put(173, FA_CLOUD_DOWNLOAD_ALT);
        ATTR_MAP.put(174, FA_CLOUD_MEATBALL);
        ATTR_MAP.put(175, FA_CLOUD_MOON);
        ATTR_MAP.put(176, FA_CLOUD_MOON_RAIN);
        ATTR_MAP.put(177, FA_CLOUD_RAIN);
        ATTR_MAP.put(178, FA_CLOUD_SHOWERS_HEAVY);
        ATTR_MAP.put(179, FA_CLOUD_SUN);
        ATTR_MAP.put(180, FA_CLOUD_SUN_RAIN);
        ATTR_MAP.put(181, FA_CLOUD_UPLOAD_ALT);
        ATTR_MAP.put(182, FA_COCKTAIL);
        ATTR_MAP.put(183, FA_CODE);
        ATTR_MAP.put(184, FA_CODE_BRANCH);
        ATTR_MAP.put(185, FA_COFFEE);
        ATTR_MAP.put(186, FA_COG);
        ATTR_MAP.put(187, FA_COGS);
        ATTR_MAP.put(188, FA_COINS);
        ATTR_MAP.put(189, FA_COLUMNS);
        ATTR_MAP.put(190, FA_COMMENT);
        ATTR_MAP.put(191, FA_COMMENT_ALT);
        ATTR_MAP.put(192, FA_COMMENT_DOLLAR);
        ATTR_MAP.put(193, FA_COMMENT_DOTS);
        ATTR_MAP.put(194, FA_COMMENT_SLASH);
        ATTR_MAP.put(195, FA_COMMENTS);
        ATTR_MAP.put(196, FA_COMMENTS_DOLLAR);
        ATTR_MAP.put(197, FA_COMPACT_DISC);
        ATTR_MAP.put(198, FA_COMPASS);
        ATTR_MAP.put(199, FA_COMPRESS);
        ATTR_MAP.put(200, FA_CONCIERGE_BELL);
        ATTR_MAP.put(201, FA_COOKIE);
        ATTR_MAP.put(202, FA_COOKIE_BITE);
        ATTR_MAP.put(203, FA_COPY);
        ATTR_MAP.put(204, FA_COPYRIGHT);
        ATTR_MAP.put(205, FA_COUCH);
        ATTR_MAP.put(206, FA_CREDIT_CARD);
        ATTR_MAP.put(207, FA_CROP);
        ATTR_MAP.put(208, FA_CROP_ALT);
        ATTR_MAP.put(209, FA_CROSS);
        ATTR_MAP.put(210, FA_CROSSHAIRS);
        ATTR_MAP.put(211, FA_CROW);
        ATTR_MAP.put(212, FA_CROWN);
        ATTR_MAP.put(213, FA_CUBE);
        ATTR_MAP.put(214, FA_CUBES);
        ATTR_MAP.put(215, FA_CUT);
        ATTR_MAP.put(216, FA_DATABASE);
        ATTR_MAP.put(217, FA_DEAF);
        ATTR_MAP.put(218, FA_DEMOCRAT);
        ATTR_MAP.put(219, FA_DESKTOP);
        ATTR_MAP.put(220, FA_DHARMACHAKRA);
        ATTR_MAP.put(221, FA_DIAGNOSES);
        ATTR_MAP.put(222, FA_DICE);
        ATTR_MAP.put(223, FA_DICE_D20);
        ATTR_MAP.put(224, FA_DICE_D6);
        ATTR_MAP.put(225, FA_DICE_FIVE);
        ATTR_MAP.put(226, FA_DICE_FOUR);
        ATTR_MAP.put(227, FA_DICE_ONE);
        ATTR_MAP.put(228, FA_DICE_SIX);
        ATTR_MAP.put(229, FA_DICE_THREE);
        ATTR_MAP.put(230, FA_DICE_TWO);
        ATTR_MAP.put(231, FA_DIGITAL_TACHOGRAPH);
        ATTR_MAP.put(232, FA_DIRECTIONS);
        ATTR_MAP.put(233, FA_DIVIDE);
        ATTR_MAP.put(234, FA_DIZZY);
        ATTR_MAP.put(235, FA_DNA);
        ATTR_MAP.put(236, FA_DOG);
        ATTR_MAP.put(237, FA_DOLLAR_SIGN);
        ATTR_MAP.put(238, FA_DOLLY);
        ATTR_MAP.put(239, FA_DOLLY_FLATBED);
        ATTR_MAP.put(240, FA_DONATE);
        ATTR_MAP.put(241, FA_DOOR_CLOSED);
        ATTR_MAP.put(242, FA_DOOR_OPEN);
        ATTR_MAP.put(243, FA_DOT_CIRCLE);
        ATTR_MAP.put(244, FA_DOVE);
        ATTR_MAP.put(245, FA_DOWNLOAD);
        ATTR_MAP.put(246, FA_DRAFTING_COMPASS);
        ATTR_MAP.put(247, FA_DRAGON);
        ATTR_MAP.put(248, FA_DRAW_POLYGON);
        ATTR_MAP.put(249, FA_DRUM);
        ATTR_MAP.put(250, FA_DRUM_STEELPAN);
        ATTR_MAP.put(251, FA_DRUMSTICK_BITE);
        ATTR_MAP.put(252, FA_DUMBBELL);
        ATTR_MAP.put(253, FA_DUNGEON);
        ATTR_MAP.put(254, FA_EDIT);
        ATTR_MAP.put(255, FA_EJECT);
        ATTR_MAP.put(256, FA_ELLIPSIS_H);
        ATTR_MAP.put(257, FA_ELLIPSIS_V);
        ATTR_MAP.put(258, FA_ENVELOPE);
        ATTR_MAP.put(259, FA_ENVELOPE_OPEN);
        ATTR_MAP.put(260, FA_ENVELOPE_OPEN_TEXT);
        ATTR_MAP.put(261, FA_ENVELOPE_SQUARE);
        ATTR_MAP.put(262, FA_EQUALS);
        ATTR_MAP.put(263, FA_ERASER);
        ATTR_MAP.put(264, FA_EURO_SIGN);
        ATTR_MAP.put(265, FA_EXCHANGE_ALT);
        ATTR_MAP.put(266, FA_EXCLAMATION);
        ATTR_MAP.put(267, FA_EXCLAMATION_CIRCLE);
        ATTR_MAP.put(268, FA_EXCLAMATION_TRIANGLE);
        ATTR_MAP.put(269, FA_EXPAND);
        ATTR_MAP.put(270, FA_EXPAND_ARROWS_ALT);
        ATTR_MAP.put(271, FA_EXTERNAL_LINK_ALT);
        ATTR_MAP.put(272, FA_EXTERNAL_LINK_SQUARE_ALT);
        ATTR_MAP.put(273, FA_EYE);
        ATTR_MAP.put(274, FA_EYE_DROPPER);
        ATTR_MAP.put(275, FA_EYE_SLASH);
        ATTR_MAP.put(276, FA_FAST_BACKWARD);
        ATTR_MAP.put(277, FA_FAST_FORWARD);
        ATTR_MAP.put(278, FA_FAX);
        ATTR_MAP.put(279, FA_FEATHER);
        ATTR_MAP.put(280, FA_FEATHER_ALT);
        ATTR_MAP.put(281, FA_FEMALE);
        ATTR_MAP.put(282, FA_FIGHTER_JET);
        ATTR_MAP.put(283, FA_FILE);
        ATTR_MAP.put(284, FA_FILE_ALT);
        ATTR_MAP.put(285, FA_FILE_ARCHIVE);
        ATTR_MAP.put(286, FA_FILE_AUDIO);
        ATTR_MAP.put(287, FA_FILE_CODE);
        ATTR_MAP.put(288, FA_FILE_CONTRACT);
        ATTR_MAP.put(289, FA_FILE_CSV);
        ATTR_MAP.put(290, FA_FILE_DOWNLOAD);
        ATTR_MAP.put(291, FA_FILE_EXCEL);
        ATTR_MAP.put(292, FA_FILE_EXPORT);
        ATTR_MAP.put(293, FA_FILE_IMAGE);
        ATTR_MAP.put(294, FA_FILE_IMPORT);
        ATTR_MAP.put(295, FA_FILE_INVOICE);
        ATTR_MAP.put(296, FA_FILE_INVOICE_DOLLAR);
        ATTR_MAP.put(297, FA_FILE_MEDICAL);
        ATTR_MAP.put(298, FA_FILE_MEDICAL_ALT);
        ATTR_MAP.put(299, FA_FILE_PDF);
        ATTR_MAP.put(300, FA_FILE_POWERPOINT);
        ATTR_MAP.put(301, FA_FILE_PRESCRIPTION);
        ATTR_MAP.put(302, FA_FILE_SIGNATURE);
        ATTR_MAP.put(303, FA_FILE_UPLOAD);
        ATTR_MAP.put(304, FA_FILE_VIDEO);
        ATTR_MAP.put(305, FA_FILE_WORD);
        ATTR_MAP.put(306, FA_FILL);
        ATTR_MAP.put(307, FA_FILL_DRIP);
        ATTR_MAP.put(308, FA_FILM);
        ATTR_MAP.put(309, FA_FILTER);
        ATTR_MAP.put(310, FA_FINGERPRINT);
        ATTR_MAP.put(311, FA_FIRE);
        ATTR_MAP.put(312, FA_FIRE_EXTINGUISHER);
        ATTR_MAP.put(313, FA_FIRST_AID);
        ATTR_MAP.put(314, FA_FISH);
        ATTR_MAP.put(315, FA_FIST_RAISED);
        ATTR_MAP.put(316, FA_FLAG);
        ATTR_MAP.put(317, FA_FLAG_CHECKERED);
        ATTR_MAP.put(318, FA_FLAG_USA);
        ATTR_MAP.put(319, FA_FLASK);
        ATTR_MAP.put(320, FA_FLUSHED);
        ATTR_MAP.put(321, FA_FOLDER);
        ATTR_MAP.put(322, FA_FOLDER_MINUS);
        ATTR_MAP.put(323, FA_FOLDER_OPEN);
        ATTR_MAP.put(324, FA_FOLDER_PLUS);
        ATTR_MAP.put(325, FA_FONT);
        ATTR_MAP.put(326, FA_FOOTBALL_BALL);
        ATTR_MAP.put(327, FA_FORWARD);
        ATTR_MAP.put(328, FA_FROG);
        ATTR_MAP.put(329, FA_FROWN);
        ATTR_MAP.put(330, FA_FROWN_OPEN);
        ATTR_MAP.put(331, FA_FUNNEL_DOLLAR);
        ATTR_MAP.put(332, FA_FUTBOL);
        ATTR_MAP.put(333, FA_GAMEPAD);
        ATTR_MAP.put(334, FA_GAS_PUMP);
        ATTR_MAP.put(335, FA_GAVEL);
        ATTR_MAP.put(336, FA_GEM);
        ATTR_MAP.put(337, FA_GENDERLESS);
        ATTR_MAP.put(338, FA_GHOST);
        ATTR_MAP.put(339, FA_GIFT);
        ATTR_MAP.put(340, FA_GLASS_MARTINI);
        ATTR_MAP.put(341, FA_GLASS_MARTINI_ALT);
        ATTR_MAP.put(342, FA_GLASSES);
        ATTR_MAP.put(343, FA_GLOBE);
        ATTR_MAP.put(344, FA_GLOBE_AFRICA);
        ATTR_MAP.put(345, FA_GLOBE_AMERICAS);
        ATTR_MAP.put(346, FA_GLOBE_ASIA);
        ATTR_MAP.put(347, FA_GOLF_BALL);
        ATTR_MAP.put(348, FA_GOPURAM);
        ATTR_MAP.put(349, FA_GRADUATION_CAP);
        ATTR_MAP.put(350, FA_GREATER_THAN);
        ATTR_MAP.put(351, FA_GREATER_THAN_EQUAL);
        ATTR_MAP.put(352, FA_GRIMACE);
        ATTR_MAP.put(353, FA_GRIN);
        ATTR_MAP.put(354, FA_GRIN_ALT);
        ATTR_MAP.put(355, FA_GRIN_BEAM);
        ATTR_MAP.put(356, FA_GRIN_BEAM_SWEAT);
        ATTR_MAP.put(357, FA_GRIN_HEARTS);
        ATTR_MAP.put(358, FA_GRIN_SQUINT);
        ATTR_MAP.put(359, FA_GRIN_SQUINT_TEARS);
        ATTR_MAP.put(360, FA_GRIN_STARS);
        ATTR_MAP.put(361, FA_GRIN_TEARS);
        ATTR_MAP.put(362, FA_GRIN_TONGUE);
        ATTR_MAP.put(363, FA_GRIN_TONGUE_SQUINT);
        ATTR_MAP.put(364, FA_GRIN_TONGUE_WINK);
        ATTR_MAP.put(365, FA_GRIN_WINK);
        ATTR_MAP.put(366, FA_GRIP_HORIZONTAL);
        ATTR_MAP.put(367, FA_GRIP_VERTICAL);
        ATTR_MAP.put(368, FA_H_SQUARE);
        ATTR_MAP.put(369, FA_HAMMER);
        ATTR_MAP.put(370, FA_HAMSA);
        ATTR_MAP.put(371, FA_HAND_HOLDING);
        ATTR_MAP.put(372, FA_HAND_HOLDING_HEART);
        ATTR_MAP.put(373, FA_HAND_HOLDING_USD);
        ATTR_MAP.put(374, FA_HAND_LIZARD);
        ATTR_MAP.put(375, FA_HAND_PAPER);
        ATTR_MAP.put(376, FA_HAND_PEACE);
        ATTR_MAP.put(377, FA_HAND_POINT_DOWN);
        ATTR_MAP.put(378, FA_HAND_POINT_LEFT);
        ATTR_MAP.put(379, FA_HAND_POINT_RIGHT);
        ATTR_MAP.put(380, FA_HAND_POINT_UP);
        ATTR_MAP.put(381, FA_HAND_POINTER);
        ATTR_MAP.put(382, FA_HAND_ROCK);
        ATTR_MAP.put(383, FA_HAND_SCISSORS);
        ATTR_MAP.put(384, FA_HAND_SPOCK);
        ATTR_MAP.put(385, FA_HANDS);
        ATTR_MAP.put(386, FA_HANDS_HELPING);
        ATTR_MAP.put(387, FA_HANDSHAKE);
        ATTR_MAP.put(388, FA_HANUKIAH);
        ATTR_MAP.put(389, FA_HASHTAG);
        ATTR_MAP.put(390, FA_HAT_WIZARD);
        ATTR_MAP.put(391, FA_HAYKAL);
        ATTR_MAP.put(392, FA_HDD);
        ATTR_MAP.put(393, FA_HEADING);
        ATTR_MAP.put(394, FA_HEADPHONES);
        ATTR_MAP.put(395, FA_HEADPHONES_ALT);
        ATTR_MAP.put(396, FA_HEADSET);
        ATTR_MAP.put(397, FA_HEART);
        ATTR_MAP.put(398, FA_HEARTBEAT);
        ATTR_MAP.put(399, FA_HELICOPTER);
        ATTR_MAP.put(400, FA_HIGHLIGHTER);
        ATTR_MAP.put(401, FA_HIKING);
        ATTR_MAP.put(402, FA_HIPPO);
        ATTR_MAP.put(403, FA_HISTORY);
        ATTR_MAP.put(404, FA_HOCKEY_PUCK);
        ATTR_MAP.put(405, FA_HOME);
        ATTR_MAP.put(406, FA_HORSE);
        ATTR_MAP.put(407, FA_HOSPITAL);
        ATTR_MAP.put(408, FA_HOSPITAL_ALT);
        ATTR_MAP.put(409, FA_HOSPITAL_SYMBOL);
        ATTR_MAP.put(410, FA_HOT_TUB);
        ATTR_MAP.put(411, FA_HOTEL);
        ATTR_MAP.put(412, FA_HOURGLASS);
        ATTR_MAP.put(413, FA_HOURGLASS_END);
        ATTR_MAP.put(414, FA_HOURGLASS_HALF);
        ATTR_MAP.put(415, FA_HOURGLASS_START);
        ATTR_MAP.put(416, FA_HOUSE_DAMAGE);
        ATTR_MAP.put(417, FA_HRYVNIA);
        ATTR_MAP.put(418, FA_I_CURSOR);
        ATTR_MAP.put(419, FA_ID_BADGE);
        ATTR_MAP.put(420, FA_ID_CARD);
        ATTR_MAP.put(421, FA_ID_CARD_ALT);
        ATTR_MAP.put(422, FA_IMAGE);
        ATTR_MAP.put(423, FA_IMAGES);
        ATTR_MAP.put(424, FA_INBOX);
        ATTR_MAP.put(425, FA_INDENT);
        ATTR_MAP.put(426, FA_INDUSTRY);
        ATTR_MAP.put(427, FA_INFINITY);
        ATTR_MAP.put(428, FA_INFO);
        ATTR_MAP.put(429, FA_INFO_CIRCLE);
        ATTR_MAP.put(430, FA_ITALIC);
        ATTR_MAP.put(431, FA_JEDI);
        ATTR_MAP.put(432, FA_JOINT);
        ATTR_MAP.put(433, FA_JOURNAL_WHILLS);
        ATTR_MAP.put(434, FA_KAABA);
        ATTR_MAP.put(435, FA_KEY);
        ATTR_MAP.put(436, FA_KEYBOARD);
        ATTR_MAP.put(437, FA_KHANDA);
        ATTR_MAP.put(438, FA_KISS);
        ATTR_MAP.put(439, FA_KISS_BEAM);
        ATTR_MAP.put(440, FA_KISS_WINK_HEART);
        ATTR_MAP.put(441, FA_KIWI_BIRD);
        ATTR_MAP.put(442, FA_LANDMARK);
        ATTR_MAP.put(443, FA_LANGUAGE);
        ATTR_MAP.put(444, FA_LAPTOP);
        ATTR_MAP.put(445, FA_LAPTOP_CODE);
        ATTR_MAP.put(446, FA_LAUGH);
        ATTR_MAP.put(447, FA_LAUGH_BEAM);
        ATTR_MAP.put(448, FA_LAUGH_SQUINT);
        ATTR_MAP.put(449, FA_LAUGH_WINK);
        ATTR_MAP.put(450, FA_LAYER_GROUP);
        ATTR_MAP.put(451, FA_LEAF);
        ATTR_MAP.put(452, FA_LEMON);
        ATTR_MAP.put(453, FA_LESS_THAN);
        ATTR_MAP.put(454, FA_LESS_THAN_EQUAL);
        ATTR_MAP.put(455, FA_LEVEL_DOWN_ALT);
        ATTR_MAP.put(456, FA_LEVEL_UP_ALT);
        ATTR_MAP.put(457, FA_LIFE_RING);
        ATTR_MAP.put(458, FA_LIGHTBULB);
        ATTR_MAP.put(459, FA_LINK);
        ATTR_MAP.put(460, FA_LIRA_SIGN);
        ATTR_MAP.put(461, FA_LIST);
        ATTR_MAP.put(462, FA_LIST_ALT);
        ATTR_MAP.put(463, FA_LIST_OL);
        ATTR_MAP.put(464, FA_LIST_UL);
        ATTR_MAP.put(465, FA_LOCATION_ARROW);
        ATTR_MAP.put(466, FA_LOCK);
        ATTR_MAP.put(467, FA_LOCK_OPEN);
        ATTR_MAP.put(468, FA_LONG_ARROW_ALT_DOWN);
        ATTR_MAP.put(469, FA_LONG_ARROW_ALT_LEFT);
        ATTR_MAP.put(470, FA_LONG_ARROW_ALT_RIGHT);
        ATTR_MAP.put(471, FA_LONG_ARROW_ALT_UP);
        ATTR_MAP.put(472, FA_LOW_VISION);
        ATTR_MAP.put(473, FA_LUGGAGE_CART);
        ATTR_MAP.put(474, FA_MAGIC);
        ATTR_MAP.put(475, FA_MAGNET);
        ATTR_MAP.put(476, FA_MAIL_BULK);
        ATTR_MAP.put(477, FA_MALE);
        ATTR_MAP.put(478, FA_MAP);
        ATTR_MAP.put(479, FA_MAP_MARKED);
        ATTR_MAP.put(480, FA_MAP_MARKED_ALT);
        ATTR_MAP.put(481, FA_MAP_MARKER);
        ATTR_MAP.put(482, FA_MAP_MARKER_ALT);
        ATTR_MAP.put(483, FA_MAP_PIN);
        ATTR_MAP.put(484, FA_MAP_SIGNS);
        ATTR_MAP.put(485, FA_MARKER);
        ATTR_MAP.put(486, FA_MARS);
        ATTR_MAP.put(487, FA_MARS_DOUBLE);
        ATTR_MAP.put(488, FA_MARS_STROKE);
        ATTR_MAP.put(489, FA_MARS_STROKE_H);
        ATTR_MAP.put(490, FA_MARS_STROKE_V);
        ATTR_MAP.put(491, FA_MASK);
        ATTR_MAP.put(492, FA_MEDAL);
        ATTR_MAP.put(493, FA_MEDKIT);
        ATTR_MAP.put(494, FA_MEH);
        ATTR_MAP.put(495, FA_MEH_BLANK);
        ATTR_MAP.put(496, FA_MEH_ROLLING_EYES);
        ATTR_MAP.put(497, FA_MEMORY);
        ATTR_MAP.put(498, FA_MENORAH);
        ATTR_MAP.put(499, FA_MERCURY);
        ATTR_MAP.put(500, FA_METEOR);
        ATTR_MAP.put(501, FA_MICROCHIP);
        ATTR_MAP.put(502, FA_MICROPHONE);
        ATTR_MAP.put(503, FA_MICROPHONE_ALT);
        ATTR_MAP.put(504, FA_MICROPHONE_ALT_SLASH);
        ATTR_MAP.put(505, FA_MICROPHONE_SLASH);
        ATTR_MAP.put(506, FA_MICROSCOPE);
        ATTR_MAP.put(507, FA_MINUS);
        ATTR_MAP.put(508, FA_MINUS_CIRCLE);
        ATTR_MAP.put(509, FA_MINUS_SQUARE);
        ATTR_MAP.put(510, FA_MOBILE);
        ATTR_MAP.put(511, FA_MOBILE_ALT);
        ATTR_MAP.put(512, FA_MONEY_BILL);
        ATTR_MAP.put(513, FA_MONEY_BILL_ALT);
        ATTR_MAP.put(514, FA_MONEY_BILL_WAVE);
        ATTR_MAP.put(515, FA_MONEY_BILL_WAVE_ALT);
        ATTR_MAP.put(516, FA_MONEY_CHECK);
        ATTR_MAP.put(517, FA_MONEY_CHECK_ALT);
        ATTR_MAP.put(518, FA_MONUMENT);
        ATTR_MAP.put(519, FA_MOON);
        ATTR_MAP.put(520, FA_MORTAR_PESTLE);
        ATTR_MAP.put(521, FA_MOSQUE);
        ATTR_MAP.put(522, FA_MOTORCYCLE);
        ATTR_MAP.put(523, FA_MOUNTAIN);
        ATTR_MAP.put(524, FA_MOUSE_POINTER);
        ATTR_MAP.put(525, FA_MUSIC);
        ATTR_MAP.put(526, FA_NETWORK_WIRED);
        ATTR_MAP.put(527, FA_NEUTER);
        ATTR_MAP.put(528, FA_NEWSPAPER);
        ATTR_MAP.put(529, FA_NOT_EQUAL);
        ATTR_MAP.put(530, FA_NOTES_MEDICAL);
        ATTR_MAP.put(531, FA_OBJECT_GROUP);
        ATTR_MAP.put(532, FA_OBJECT_UNGROUP);
        ATTR_MAP.put(533, FA_OIL_CAN);
        ATTR_MAP.put(534, FA_OM);
        ATTR_MAP.put(535, FA_OTTER);
        ATTR_MAP.put(536, FA_OUTDENT);
        ATTR_MAP.put(537, FA_PAINT_BRUSH);
        ATTR_MAP.put(538, FA_PAINT_ROLLER);
        ATTR_MAP.put(539, FA_PALETTE);
        ATTR_MAP.put(540, FA_PALLET);
        ATTR_MAP.put(541, FA_PAPER_PLANE);
        ATTR_MAP.put(542, FA_PAPERCLIP);
        ATTR_MAP.put(543, FA_PARACHUTE_BOX);
        ATTR_MAP.put(544, FA_PARAGRAPH);
        ATTR_MAP.put(545, FA_PARKING);
        ATTR_MAP.put(546, FA_PASSPORT);
        ATTR_MAP.put(547, FA_PASTAFARIANISM);
        ATTR_MAP.put(548, FA_PASTE);
        ATTR_MAP.put(549, FA_PAUSE);
        ATTR_MAP.put(550, FA_PAUSE_CIRCLE);
        ATTR_MAP.put(551, FA_PAW);
        ATTR_MAP.put(552, FA_PEACE);
        ATTR_MAP.put(553, FA_PEN);
        ATTR_MAP.put(554, FA_PEN_ALT);
        ATTR_MAP.put(555, FA_PEN_FANCY);
        ATTR_MAP.put(556, FA_PEN_NIB);
        ATTR_MAP.put(557, FA_PEN_SQUARE);
        ATTR_MAP.put(558, FA_PENCIL_ALT);
        ATTR_MAP.put(559, FA_PENCIL_RULER);
        ATTR_MAP.put(560, FA_PEOPLE_CARRY);
        ATTR_MAP.put(561, FA_PERCENT);
        ATTR_MAP.put(562, FA_PERCENTAGE);
        ATTR_MAP.put(563, FA_PERSON_BOOTH);
        ATTR_MAP.put(564, FA_PHONE);
        ATTR_MAP.put(565, FA_PHONE_SLASH);
        ATTR_MAP.put(566, FA_PHONE_SQUARE);
        ATTR_MAP.put(567, FA_PHONE_VOLUME);
        ATTR_MAP.put(568, FA_PIGGY_BANK);
        ATTR_MAP.put(569, FA_PILLS);
        ATTR_MAP.put(570, FA_PLACE_OF_WORSHIP);
        ATTR_MAP.put(571, FA_PLANE);
        ATTR_MAP.put(572, FA_PLANE_ARRIVAL);
        ATTR_MAP.put(573, FA_PLANE_DEPARTURE);
        ATTR_MAP.put(574, FA_PLAY);
        ATTR_MAP.put(575, FA_PLAY_CIRCLE);
        ATTR_MAP.put(576, FA_PLUG);
        ATTR_MAP.put(577, FA_PLUS);
        ATTR_MAP.put(578, FA_PLUS_CIRCLE);
        ATTR_MAP.put(579, FA_PLUS_SQUARE);
        ATTR_MAP.put(580, FA_PODCAST);
        ATTR_MAP.put(581, FA_POLL);
        ATTR_MAP.put(582, FA_POLL_H);
        ATTR_MAP.put(583, FA_POO);
        ATTR_MAP.put(584, FA_POO_STORM);
        ATTR_MAP.put(585, FA_POOP);
        ATTR_MAP.put(586, FA_PORTRAIT);
        ATTR_MAP.put(587, FA_POUND_SIGN);
        ATTR_MAP.put(588, FA_POWER_OFF);
        ATTR_MAP.put(589, FA_PRAY);
        ATTR_MAP.put(590, FA_PRAYING_HANDS);
        ATTR_MAP.put(591, FA_PRESCRIPTION);
        ATTR_MAP.put(592, FA_PRESCRIPTION_BOTTLE);
        ATTR_MAP.put(593, FA_PRESCRIPTION_BOTTLE_ALT);
        ATTR_MAP.put(594, FA_PRINT);
        ATTR_MAP.put(595, FA_PROCEDURES);
        ATTR_MAP.put(596, FA_PROJECT_DIAGRAM);
        ATTR_MAP.put(597, FA_PUZZLE_PIECE);
        ATTR_MAP.put(598, FA_QRCODE);
        ATTR_MAP.put(599, FA_QUESTION);
        ATTR_MAP.put(600, FA_QUESTION_CIRCLE);
        ATTR_MAP.put(601, FA_QUIDDITCH);
        ATTR_MAP.put(602, FA_QUOTE_LEFT);
        ATTR_MAP.put(603, FA_QUOTE_RIGHT);
        ATTR_MAP.put(604, FA_QURAN);
        ATTR_MAP.put(605, FA_RAINBOW);
        ATTR_MAP.put(606, FA_RANDOM);
        ATTR_MAP.put(607, FA_RECEIPT);
        ATTR_MAP.put(608, FA_RECYCLE);
        ATTR_MAP.put(609, FA_REDO);
        ATTR_MAP.put(610, FA_REDO_ALT);
        ATTR_MAP.put(611, FA_REGISTERED);
        ATTR_MAP.put(612, FA_REPLY);
        ATTR_MAP.put(613, FA_REPLY_ALL);
        ATTR_MAP.put(614, FA_REPUBLICAN);
        ATTR_MAP.put(615, FA_RETWEET);
        ATTR_MAP.put(616, FA_RIBBON);
        ATTR_MAP.put(617, FA_RING);
        ATTR_MAP.put(618, FA_ROAD);
        ATTR_MAP.put(619, FA_ROBOT);
        ATTR_MAP.put(620, FA_ROCKET);
        ATTR_MAP.put(621, FA_ROUTE);
        ATTR_MAP.put(622, FA_RSS);
        ATTR_MAP.put(623, FA_RSS_SQUARE);
        ATTR_MAP.put(624, FA_RUBLE_SIGN);
        ATTR_MAP.put(625, FA_RULER);
        ATTR_MAP.put(626, FA_RULER_COMBINED);
        ATTR_MAP.put(627, FA_RULER_HORIZONTAL);
        ATTR_MAP.put(628, FA_RULER_VERTICAL);
        ATTR_MAP.put(629, FA_RUNNING);
        ATTR_MAP.put(630, FA_RUPEE_SIGN);
        ATTR_MAP.put(631, FA_SAD_CRY);
        ATTR_MAP.put(632, FA_SAD_TEAR);
        ATTR_MAP.put(633, FA_SAVE);
        ATTR_MAP.put(634, FA_SCHOOL);
        ATTR_MAP.put(635, FA_SCREWDRIVER);
        ATTR_MAP.put(636, FA_SCROLL);
        ATTR_MAP.put(637, FA_SEARCH);
        ATTR_MAP.put(638, FA_SEARCH_DOLLAR);
        ATTR_MAP.put(639, FA_SEARCH_LOCATION);
        ATTR_MAP.put(640, FA_SEARCH_MINUS);
        ATTR_MAP.put(641, FA_SEARCH_PLUS);
        ATTR_MAP.put(642, FA_SEEDLING);
        ATTR_MAP.put(643, FA_SERVER);
        ATTR_MAP.put(644, FA_SHAPES);
        ATTR_MAP.put(645, FA_SHARE);
        ATTR_MAP.put(646, FA_SHARE_ALT);
        ATTR_MAP.put(647, FA_SHARE_ALT_SQUARE);
        ATTR_MAP.put(648, FA_SHARE_SQUARE);
        ATTR_MAP.put(649, FA_SHEKEL_SIGN);
        ATTR_MAP.put(650, FA_SHIELD_ALT);
        ATTR_MAP.put(651, FA_SHIP);
        ATTR_MAP.put(652, FA_SHIPPING_FAST);
        ATTR_MAP.put(653, FA_SHOE_PRINTS);
        ATTR_MAP.put(654, FA_SHOPPING_BAG);
        ATTR_MAP.put(655, FA_SHOPPING_BASKET);
        ATTR_MAP.put(656, FA_SHOPPING_CART);
        ATTR_MAP.put(657, FA_SHOWER);
        ATTR_MAP.put(658, FA_SHUTTLE_VAN);
        ATTR_MAP.put(659, FA_SIGN);
        ATTR_MAP.put(660, FA_SIGN_IN_ALT);
        ATTR_MAP.put(661, FA_SIGN_LANGUAGE);
        ATTR_MAP.put(662, FA_SIGN_OUT_ALT);
        ATTR_MAP.put(663, FA_SIGNAL);
        ATTR_MAP.put(664, FA_SIGNATURE);
        ATTR_MAP.put(665, FA_SITEMAP);
        ATTR_MAP.put(666, FA_SKULL);
        ATTR_MAP.put(667, FA_SKULL_CROSSBONES);
        ATTR_MAP.put(668, FA_SLASH);
        ATTR_MAP.put(669, FA_SLIDERS_H);
        ATTR_MAP.put(670, FA_SMILE);
        ATTR_MAP.put(671, FA_SMILE_BEAM);
        ATTR_MAP.put(672, FA_SMILE_WINK);
        ATTR_MAP.put(673, FA_SMOG);
        ATTR_MAP.put(674, FA_SMOKING);
        ATTR_MAP.put(675, FA_SMOKING_BAN);
        ATTR_MAP.put(676, FA_SNOWFLAKE);
        ATTR_MAP.put(677, FA_SOCKS);
        ATTR_MAP.put(678, FA_SOLAR_PANEL);
        ATTR_MAP.put(679, FA_SORT);
        ATTR_MAP.put(680, FA_SORT_ALPHA_DOWN);
        ATTR_MAP.put(681, FA_SORT_ALPHA_UP);
        ATTR_MAP.put(682, FA_SORT_AMOUNT_DOWN);
        ATTR_MAP.put(683, FA_SORT_AMOUNT_UP);
        ATTR_MAP.put(684, FA_SORT_DOWN);
        ATTR_MAP.put(685, FA_SORT_NUMERIC_DOWN);
        ATTR_MAP.put(686, FA_SORT_NUMERIC_UP);
        ATTR_MAP.put(687, FA_SORT_UP);
        ATTR_MAP.put(688, FA_SPA);
        ATTR_MAP.put(689, FA_SPACE_SHUTTLE);
        ATTR_MAP.put(690, FA_SPIDER);
        ATTR_MAP.put(691, FA_SPINNER);
        ATTR_MAP.put(692, FA_SPLOTCH);
        ATTR_MAP.put(693, FA_SPRAY_CAN);
        ATTR_MAP.put(694, FA_SQUARE);
        ATTR_MAP.put(695, FA_SQUARE_FULL);
        ATTR_MAP.put(696, FA_SQUARE_ROOT_ALT);
        ATTR_MAP.put(697, FA_STAMP);
        ATTR_MAP.put(698, FA_STAR);
        ATTR_MAP.put(699, FA_STAR_AND_CRESCENT);
        ATTR_MAP.put(700, FA_STAR_HALF);
        ATTR_MAP.put(701, FA_STAR_HALF_ALT);
        ATTR_MAP.put(702, FA_STAR_OF_DAVID);
        ATTR_MAP.put(703, FA_STAR_OF_LIFE);
        ATTR_MAP.put(704, FA_STEP_BACKWARD);
        ATTR_MAP.put(705, FA_STEP_FORWARD);
        ATTR_MAP.put(706, FA_STETHOSCOPE);
        ATTR_MAP.put(707, FA_STICKY_NOTE);
        ATTR_MAP.put(708, FA_STOP);
        ATTR_MAP.put(709, FA_STOP_CIRCLE);
        ATTR_MAP.put(710, FA_STOPWATCH);
        ATTR_MAP.put(711, FA_STORE);
        ATTR_MAP.put(712, FA_STORE_ALT);
        ATTR_MAP.put(713, FA_STREAM);
        ATTR_MAP.put(714, FA_STREET_VIEW);
        ATTR_MAP.put(715, FA_STRIKETHROUGH);
        ATTR_MAP.put(716, FA_STROOPWAFEL);
        ATTR_MAP.put(717, FA_SUBSCRIPT);
        ATTR_MAP.put(718, FA_SUBWAY);
        ATTR_MAP.put(719, FA_SUITCASE);
        ATTR_MAP.put(720, FA_SUITCASE_ROLLING);
        ATTR_MAP.put(721, FA_SUN);
        ATTR_MAP.put(722, FA_SUPERSCRIPT);
        ATTR_MAP.put(723, FA_SURPRISE);
        ATTR_MAP.put(724, FA_SWATCHBOOK);
        ATTR_MAP.put(725, FA_SWIMMER);
        ATTR_MAP.put(726, FA_SWIMMING_POOL);
        ATTR_MAP.put(727, FA_SYNAGOGUE);
        ATTR_MAP.put(728, FA_SYNC);
        ATTR_MAP.put(729, FA_SYNC_ALT);
        ATTR_MAP.put(730, FA_SYRINGE);
        ATTR_MAP.put(731, FA_TABLE);
        ATTR_MAP.put(732, FA_TABLE_TENNIS);
        ATTR_MAP.put(733, FA_TABLET);
        ATTR_MAP.put(734, FA_TABLET_ALT);
        ATTR_MAP.put(735, FA_TABLETS);
        ATTR_MAP.put(736, FA_TACHOMETER_ALT);
        ATTR_MAP.put(737, FA_TAG);
        ATTR_MAP.put(738, FA_TAGS);
        ATTR_MAP.put(739, FA_TAPE);
        ATTR_MAP.put(740, FA_TASKS);
        ATTR_MAP.put(741, FA_TAXI);
        ATTR_MAP.put(742, FA_TEETH);
        ATTR_MAP.put(743, FA_TEETH_OPEN);
        ATTR_MAP.put(744, FA_TEMPERATURE_HIGH);
        ATTR_MAP.put(745, FA_TEMPERATURE_LOW);
        ATTR_MAP.put(746, FA_TERMINAL);
        ATTR_MAP.put(747, FA_TEXT_HEIGHT);
        ATTR_MAP.put(748, FA_TEXT_WIDTH);
        ATTR_MAP.put(749, FA_TH);
        ATTR_MAP.put(750, FA_TH_LARGE);
        ATTR_MAP.put(751, FA_TH_LIST);
        ATTR_MAP.put(752, FA_THEATER_MASKS);
        ATTR_MAP.put(753, FA_THERMOMETER);
        ATTR_MAP.put(754, FA_THERMOMETER_EMPTY);
        ATTR_MAP.put(755, FA_THERMOMETER_FULL);
        ATTR_MAP.put(756, FA_THERMOMETER_HALF);
        ATTR_MAP.put(757, FA_THERMOMETER_QUARTER);
        ATTR_MAP.put(758, FA_THERMOMETER_THREE_QUARTERS);
        ATTR_MAP.put(759, FA_THUMBS_DOWN);
        ATTR_MAP.put(760, FA_THUMBS_UP);
        ATTR_MAP.put(761, FA_THUMBTACK);
        ATTR_MAP.put(762, FA_TICKET_ALT);
        ATTR_MAP.put(763, FA_TIMES);
        ATTR_MAP.put(764, FA_TIMES_CIRCLE);
        ATTR_MAP.put(765, FA_TINT);
        ATTR_MAP.put(766, FA_TINT_SLASH);
        ATTR_MAP.put(767, FA_TIRED);
        ATTR_MAP.put(768, FA_TOGGLE_OFF);
        ATTR_MAP.put(769, FA_TOGGLE_ON);
        ATTR_MAP.put(770, FA_TOILET_PAPER);
        ATTR_MAP.put(771, FA_TOOLBOX);
        ATTR_MAP.put(772, FA_TOOTH);
        ATTR_MAP.put(773, FA_TORAH);
        ATTR_MAP.put(774, FA_TORII_GATE);
        ATTR_MAP.put(775, FA_TRACTOR);
        ATTR_MAP.put(776, FA_TRADEMARK);
        ATTR_MAP.put(777, FA_TRAFFIC_LIGHT);
        ATTR_MAP.put(778, FA_TRAIN);
        ATTR_MAP.put(779, FA_TRANSGENDER);
        ATTR_MAP.put(780, FA_TRANSGENDER_ALT);
        ATTR_MAP.put(781, FA_TRASH);
        ATTR_MAP.put(782, FA_TRASH_ALT);
        ATTR_MAP.put(783, FA_TREE);
        ATTR_MAP.put(784, FA_TROPHY);
        ATTR_MAP.put(785, FA_TRUCK);
        ATTR_MAP.put(786, FA_TRUCK_LOADING);
        ATTR_MAP.put(787, FA_TRUCK_MONSTER);
        ATTR_MAP.put(788, FA_TRUCK_MOVING);
        ATTR_MAP.put(789, FA_TRUCK_PICKUP);
        ATTR_MAP.put(790, FA_TSHIRT);
        ATTR_MAP.put(791, FA_TTY);
        ATTR_MAP.put(792, FA_TV);
        ATTR_MAP.put(793, FA_UMBRELLA);
        ATTR_MAP.put(794, FA_UMBRELLA_BEACH);
        ATTR_MAP.put(795, FA_UNDERLINE);
        ATTR_MAP.put(796, FA_UNDO);
        ATTR_MAP.put(797, FA_UNDO_ALT);
        ATTR_MAP.put(798, FA_UNIVERSAL_ACCESS);
        ATTR_MAP.put(799, FA_UNIVERSITY);
        ATTR_MAP.put(800, FA_UNLINK);
        ATTR_MAP.put(801, FA_UNLOCK);
        ATTR_MAP.put(802, FA_UNLOCK_ALT);
        ATTR_MAP.put(803, FA_UPLOAD);
        ATTR_MAP.put(804, FA_USER);
        ATTR_MAP.put(805, FA_USER_ALT);
        ATTR_MAP.put(806, FA_USER_ALT_SLASH);
        ATTR_MAP.put(807, FA_USER_ASTRONAUT);
        ATTR_MAP.put(808, FA_USER_CHECK);
        ATTR_MAP.put(809, FA_USER_CIRCLE);
        ATTR_MAP.put(810, FA_USER_CLOCK);
        ATTR_MAP.put(811, FA_USER_COG);
        ATTR_MAP.put(812, FA_USER_EDIT);
        ATTR_MAP.put(813, FA_USER_FRIENDS);
        ATTR_MAP.put(814, FA_USER_GRADUATE);
        ATTR_MAP.put(815, FA_USER_INJURED);
        ATTR_MAP.put(816, FA_USER_LOCK);
        ATTR_MAP.put(817, FA_USER_MD);
        ATTR_MAP.put(818, FA_USER_MINUS);
        ATTR_MAP.put(819, FA_USER_NINJA);
        ATTR_MAP.put(820, FA_USER_PLUS);
        ATTR_MAP.put(821, FA_USER_SECRET);
        ATTR_MAP.put(822, FA_USER_SHIELD);
        ATTR_MAP.put(823, FA_USER_SLASH);
        ATTR_MAP.put(824, FA_USER_TAG);
        ATTR_MAP.put(825, FA_USER_TIE);
        ATTR_MAP.put(826, FA_USER_TIMES);
        ATTR_MAP.put(827, FA_USERS);
        ATTR_MAP.put(828, FA_USERS_COG);
        ATTR_MAP.put(829, FA_UTENSIL_SPOON);
        ATTR_MAP.put(830, FA_UTENSILS);
        ATTR_MAP.put(831, FA_VECTOR_SQUARE);
        ATTR_MAP.put(832, FA_VENUS);
        ATTR_MAP.put(833, FA_VENUS_DOUBLE);
        ATTR_MAP.put(834, FA_VENUS_MARS);
        ATTR_MAP.put(835, FA_VIAL);
        ATTR_MAP.put(836, FA_VIALS);
        ATTR_MAP.put(837, FA_VIDEO);
        ATTR_MAP.put(838, FA_VIDEO_SLASH);
        ATTR_MAP.put(839, FA_VIHARA);
        ATTR_MAP.put(840, FA_VOLLEYBALL_BALL);
        ATTR_MAP.put(841, FA_VOLUME_DOWN);
        ATTR_MAP.put(842, FA_VOLUME_MUTE);
        ATTR_MAP.put(843, FA_VOLUME_OFF);
        ATTR_MAP.put(844, FA_VOLUME_UP);
        ATTR_MAP.put(845, FA_VOTE_YEA);
        ATTR_MAP.put(846, FA_VR_CARDBOARD);
        ATTR_MAP.put(847, FA_WALKING);
        ATTR_MAP.put(848, FA_WALLET);
        ATTR_MAP.put(849, FA_WAREHOUSE);
        ATTR_MAP.put(850, FA_WATER);
        ATTR_MAP.put(851, FA_WEIGHT);
        ATTR_MAP.put(852, FA_WEIGHT_HANGING);
        ATTR_MAP.put(853, FA_WHEELCHAIR);
        ATTR_MAP.put(854, FA_WIFI);
        ATTR_MAP.put(855, FA_WIND);
        ATTR_MAP.put(856, FA_WINDOW_CLOSE);
        ATTR_MAP.put(857, FA_WINDOW_MAXIMIZE);
        ATTR_MAP.put(858, FA_WINDOW_MINIMIZE);
        ATTR_MAP.put(859, FA_WINDOW_RESTORE);
        ATTR_MAP.put(860, FA_WINE_BOTTLE);
        ATTR_MAP.put(861, FA_WINE_GLASS);
        ATTR_MAP.put(862, FA_WINE_GLASS_ALT);
        ATTR_MAP.put(863, FA_WON_SIGN);
        ATTR_MAP.put(864, FA_WRENCH);
        ATTR_MAP.put(865, FA_X_RAY);
        ATTR_MAP.put(866, FA_YEN_SIGN);
        ATTR_MAP.put(867, FA_YIN_YANG);


    }

}
