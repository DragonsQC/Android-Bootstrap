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
public class FontAwesomeBrands implements IconSet {

    public static final String FONT_PATH = "fa-brands-v550.ttf";

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
            FA_500PX,
            FA_ACCESSIBLE_ICON,
            FA_ACCUSOFT,
            FA_ACQUISITIONS_INCORPORATED,
            FA_ADN,
            FA_ADVERSAL,
            FA_AFFILIATETHEME,
            FA_ALGOLIA,
            FA_ALIPAY,
            FA_AMAZON,
            FA_AMAZON_PAY,
            FA_AMILIA,
            FA_ANDROID,
            FA_ANGELLIST,
            FA_ANGRYCREATIVE,
            FA_ANGULAR,
            FA_APP_STORE,
            FA_APP_STORE_IOS,
            FA_APPER,
            FA_APPLE,
            FA_APPLE_PAY,
            FA_ASYMMETRIK,
            FA_AUDIBLE,
            FA_AUTOPREFIXER,
            FA_AVIANEX,
            FA_AVIATO,
            FA_AWS,
            FA_BANDCAMP,
            FA_BEHANCE,
            FA_BEHANCE_SQUARE,
            FA_BIMOBJECT,
            FA_BITBUCKET,
            FA_BITCOIN,
            FA_BITY,
            FA_BLACK_TIE,
            FA_BLACKBERRY,
            FA_BLOGGER,
            FA_BLOGGER_B,
            FA_BLUETOOTH,
            FA_BLUETOOTH_B,
            FA_BTC,
            FA_BUROMOBELEXPERTE,
            FA_CC_AMAZON_PAY,
            FA_CC_AMEX,
            FA_CC_APPLE_PAY,
            FA_CC_DINERS_CLUB,
            FA_CC_DISCOVER,
            FA_CC_JCB,
            FA_CC_MASTERCARD,
            FA_CC_PAYPAL,
            FA_CC_STRIPE,
            FA_CC_VISA,
            FA_CENTERCODE,
            FA_CHROME,
            FA_CLOUDSCALE,
            FA_CLOUDSMITH,
            FA_CLOUDVERSIFY,
            FA_CODEPEN,
            FA_CODIEPIE,
            FA_CONNECTDEVELOP,
            FA_CONTAO,
            FA_CPANEL,
            FA_CREATIVE_COMMONS,
            FA_CREATIVE_COMMONS_BY,
            FA_CREATIVE_COMMONS_NC,
            FA_CREATIVE_COMMONS_NC_EU,
            FA_CREATIVE_COMMONS_NC_JP,
            FA_CREATIVE_COMMONS_ND,
            FA_CREATIVE_COMMONS_PD,
            FA_CREATIVE_COMMONS_PD_ALT,
            FA_CREATIVE_COMMONS_REMIX,
            FA_CREATIVE_COMMONS_SA,
            FA_CREATIVE_COMMONS_SAMPLING,
            FA_CREATIVE_COMMONS_SAMPLING_PLUS,
            FA_CREATIVE_COMMONS_SHARE,
            FA_CREATIVE_COMMONS_ZERO,
            FA_CRITICAL_ROLE,
            FA_CSS3,
            FA_CSS3_ALT,
            FA_CUTTLEFISH,
            FA_D_AND_D,
            FA_D_AND_D_BEYOND,
            FA_DASHCUBE,
            FA_DELICIOUS,
            FA_DEPLOYDOG,
            FA_DESKPRO,
            FA_DEV,
            FA_DEVIANTART,
            FA_DIGG,
            FA_DIGITAL_OCEAN,
            FA_DISCORD,
            FA_DISCOURSE,
            FA_DOCHUB,
            FA_DOCKER,
            FA_DRAFT2DIGITAL,
            FA_DRIBBBLE,
            FA_DRIBBBLE_SQUARE,
            FA_DROPBOX,
            FA_DRUPAL,
            FA_DYALOG,
            FA_EARLYBIRDS,
            FA_EBAY,
            FA_EDGE,
            FA_ELEMENTOR,
            FA_ELLO,
            FA_EMBER,
            FA_EMPIRE,
            FA_ENVIRA,
            FA_ERLANG,
            FA_ETHEREUM,
            FA_ETSY,
            FA_EXPEDITEDSSL,
            FA_FACEBOOK,
            FA_FACEBOOK_F,
            FA_FACEBOOK_MESSENGER,
            FA_FACEBOOK_SQUARE,
            FA_FANTASY_FLIGHT_GAMES,
            FA_FIREFOX,
            FA_FIRST_ORDER,
            FA_FIRST_ORDER_ALT,
            FA_FIRSTDRAFT,
            FA_FLICKR,
            FA_FLIPBOARD,
            FA_FLY,
            FA_FONT_AWESOME,
            FA_FONT_AWESOME_ALT,
            FA_FONT_AWESOME_FLAG,
            FA_FONTICONS,
            FA_FONTICONS_FI,
            FA_FORT_AWESOME,
            FA_FORT_AWESOME_ALT,
            FA_FORUMBEE,
            FA_FOURSQUARE,
            FA_FREE_CODE_CAMP,
            FA_FREEBSD,
            FA_FULCRUM,
            FA_GALACTIC_REPUBLIC,
            FA_GALACTIC_SENATE,
            FA_GET_POCKET,
            FA_GG,
            FA_GG_CIRCLE,
            FA_GIT,
            FA_GIT_SQUARE,
            FA_GITHUB,
            FA_GITHUB_ALT,
            FA_GITHUB_SQUARE,
            FA_GITKRAKEN,
            FA_GITLAB,
            FA_GITTER,
            FA_GLIDE,
            FA_GLIDE_G,
            FA_GOFORE,
            FA_GOODREADS,
            FA_GOODREADS_G,
            FA_GOOGLE,
            FA_GOOGLE_DRIVE,
            FA_GOOGLE_PLAY,
            FA_GOOGLE_PLUS,
            FA_GOOGLE_PLUS_G,
            FA_GOOGLE_PLUS_SQUARE,
            FA_GOOGLE_WALLET,
            FA_GRATIPAY,
            FA_GRAV,
            FA_GRIPFIRE,
            FA_GRUNT,
            FA_GULP,
            FA_HACKER_NEWS,
            FA_HACKER_NEWS_SQUARE,
            FA_HACKERRANK,
            FA_HIPS,
            FA_HIRE_A_HELPER,
            FA_HOOLI,
            FA_HORNBILL,
            FA_HOTJAR,
            FA_HOUZZ,
            FA_HTML5,
            FA_HUBSPOT,
            FA_IMDB,
            FA_INSTAGRAM,
            FA_INTERNET_EXPLORER,
            FA_IOXHOST,
            FA_ITUNES,
            FA_ITUNES_NOTE,
            FA_JAVA,
            FA_JEDI_ORDER,
            FA_JENKINS,
            FA_JOGET,
            FA_JOOMLA,
            FA_JS,
            FA_JS_SQUARE,
            FA_JSFIDDLE,
            FA_KAGGLE,
            FA_KEYBASE,
            FA_KEYCDN,
            FA_KICKSTARTER,
            FA_KICKSTARTER_K,
            FA_KORVUE,
            FA_LARAVEL,
            FA_LASTFM,
            FA_LASTFM_SQUARE,
            FA_LEANPUB,
            FA_LESS,
            FA_LINE,
            FA_LINKEDIN,
            FA_LINKEDIN_IN,
            FA_LINODE,
            FA_LINUX,
            FA_LYFT,
            FA_MAGENTO,
            FA_MAILCHIMP,
            FA_MANDALORIAN,
            FA_MARKDOWN,
            FA_MASTODON,
            FA_MAXCDN,
            FA_MEDAPPS,
            FA_MEDIUM,
            FA_MEDIUM_M,
            FA_MEDRT,
            FA_MEETUP,
            FA_MEGAPORT,
            FA_MICROSOFT,
            FA_MIX,
            FA_MIXCLOUD,
            FA_MIZUNI,
            FA_MODX,
            FA_MONERO,
            FA_NAPSTER,
            FA_NEOS,
            FA_NIMBLR,
            FA_NINTENDO_SWITCH,
            FA_NODE,
            FA_NODE_JS,
            FA_NPM,
            FA_NS8,
            FA_NUTRITIONIX,
            FA_ODNOKLASSNIKI,
            FA_ODNOKLASSNIKI_SQUARE,
            FA_OLD_REPUBLIC,
            FA_OPENCART,
            FA_OPENID,
            FA_OPERA,
            FA_OPTIN_MONSTER,
            FA_OSI,
            FA_PAGE4,
            FA_PAGELINES,
            FA_PALFED,
            FA_PATREON,
            FA_PAYPAL,
            FA_PENNY_ARCADE,
            FA_PERISCOPE,
            FA_PHABRICATOR,
            FA_PHOENIX_FRAMEWORK,
            FA_PHOENIX_SQUADRON,
            FA_PHP,
            FA_PIED_PIPER,
            FA_PIED_PIPER_ALT,
            FA_PIED_PIPER_HAT,
            FA_PIED_PIPER_PP,
            FA_PINTEREST,
            FA_PINTEREST_P,
            FA_PINTEREST_SQUARE,
            FA_PLAYSTATION,
            FA_PRODUCT_HUNT,
            FA_PUSHED,
            FA_PYTHON,
            FA_QQ,
            FA_QUINSCAPE,
            FA_QUORA,
            FA_R_PROJECT,
            FA_RAVELRY,
            FA_REACT,
            FA_REACTEUROPE,
            FA_README,
            FA_REBEL,
            FA_RED_RIVER,
            FA_REDDIT,
            FA_REDDIT_ALIEN,
            FA_REDDIT_SQUARE,
            FA_RENREN,
            FA_REPLYD,
            FA_RESEARCHGATE,
            FA_RESOLVING,
            FA_REV,
            FA_ROCKETCHAT,
            FA_ROCKRMS,
            FA_SAFARI,
            FA_SASS,
            FA_SCHLIX,
            FA_SCRIBD,
            FA_SEARCHENGIN,
            FA_SELLCAST,
            FA_SELLSY,
            FA_SERVICESTACK,
            FA_SHIRTSINBULK,
            FA_SHOPWARE,
            FA_SIMPLYBUILT,
            FA_SISTRIX,
            FA_SITH,
            FA_SKYATLAS,
            FA_SKYPE,
            FA_SLACK,
            FA_SLACK_HASH,
            FA_SLIDESHARE,
            FA_SNAPCHAT,
            FA_SNAPCHAT_GHOST,
            FA_SNAPCHAT_SQUARE,
            FA_SOUNDCLOUD,
            FA_SPEAKAP,
            FA_SPOTIFY,
            FA_SQUARESPACE,
            FA_STACK_EXCHANGE,
            FA_STACK_OVERFLOW,
            FA_STAYLINKED,
            FA_STEAM,
            FA_STEAM_SQUARE,
            FA_STEAM_SYMBOL,
            FA_STICKER_MULE,
            FA_STRAVA,
            FA_STRIPE,
            FA_STRIPE_S,
            FA_STUDIOVINARI,
            FA_STUMBLEUPON,
            FA_STUMBLEUPON_CIRCLE,
            FA_SUPERPOWERS,
            FA_SUPPLE,
            FA_TEAMSPEAK,
            FA_TELEGRAM,
            FA_TELEGRAM_PLANE,
            FA_TENCENT_WEIBO,
            FA_THE_RED_YETI,
            FA_THEMECO,
            FA_THEMEISLE,
            FA_THINK_PEAKS,
            FA_TRADE_FEDERATION,
            FA_TRELLO,
            FA_TRIPADVISOR,
            FA_TUMBLR,
            FA_TUMBLR_SQUARE,
            FA_TWITCH,
            FA_TWITTER,
            FA_TWITTER_SQUARE,
            FA_TYPO3,
            FA_UBER,
            FA_UIKIT,
            FA_UNIREGISTRY,
            FA_UNTAPPD,
            FA_USB,
            FA_USSUNNAH,
            FA_VAADIN,
            FA_VIACOIN,
            FA_VIADEO,
            FA_VIADEO_SQUARE,
            FA_VIBER,
            FA_VIMEO,
            FA_VIMEO_SQUARE,
            FA_VIMEO_V,
            FA_VINE,
            FA_VK,
            FA_VNV,
            FA_VUEJS,
            FA_WEEBLY,
            FA_WEIBO,
            FA_WEIXIN,
            FA_WHATSAPP,
            FA_WHATSAPP_SQUARE,
            FA_WHMCS,
            FA_WIKIPEDIA_W,
            FA_WINDOWS,
            FA_WIX,
            FA_WIZARDS_OF_THE_COAST,
            FA_WOLF_PACK_BATTALION,
            FA_WORDPRESS,
            FA_WORDPRESS_SIMPLE,
            FA_WPBEGINNER,
            FA_WPEXPLORER,
            FA_WPFORMS,
            FA_WPRESSR,
            FA_XBOX,
            FA_XING,
            FA_XING_SQUARE,
            FA_Y_COMBINATOR,
            FA_YAHOO,
            FA_YANDEX,
            FA_YANDEX_INTERNATIONAL,
            FA_YELP,
            FA_YOAST,
            FA_YOUTUBE,
            FA_YOUTUBE_SQUARE,
            FA_ZHIHU,

    })
    public @interface Icon {
    }

    public static final String FA_500PX                          = "fa_500px";
    public static final String FA_ACCESSIBLE_ICON                = "fa_accessible_icon";
    public static final String FA_ACCUSOFT                       = "fa_accusoft";
    public static final String FA_ACQUISITIONS_INCORPORATED      = "fa_acquisitions_incorporated";
    public static final String FA_ADN                            = "fa_adn";
    public static final String FA_ADVERSAL                       = "fa_adversal";
    public static final String FA_AFFILIATETHEME                 = "fa_affiliatetheme";
    public static final String FA_ALGOLIA                        = "fa_algolia";
    public static final String FA_ALIPAY                         = "fa_alipay";
    public static final String FA_AMAZON                         = "fa_amazon";
    public static final String FA_AMAZON_PAY                     = "fa_amazon_pay";
    public static final String FA_AMILIA                         = "fa_amilia";
    public static final String FA_ANDROID                        = "fa_android";
    public static final String FA_ANGELLIST                      = "fa_angellist";
    public static final String FA_ANGRYCREATIVE                  = "fa_angrycreative";
    public static final String FA_ANGULAR                        = "fa_angular";
    public static final String FA_APP_STORE                      = "fa_app_store";
    public static final String FA_APP_STORE_IOS                  = "fa_app_store_ios";
    public static final String FA_APPER                          = "fa_apper";
    public static final String FA_APPLE                          = "fa_apple";
    public static final String FA_APPLE_PAY                      = "fa_apple_pay";
    public static final String FA_ASYMMETRIK                     = "fa_asymmetrik";
    public static final String FA_AUDIBLE                        = "fa_audible";
    public static final String FA_AUTOPREFIXER                   = "fa_autoprefixer";
    public static final String FA_AVIANEX                        = "fa_avianex";
    public static final String FA_AVIATO                         = "fa_aviato";
    public static final String FA_AWS                            = "fa_aws";
    public static final String FA_BANDCAMP                       = "fa_bandcamp";
    public static final String FA_BEHANCE                        = "fa_behance";
    public static final String FA_BEHANCE_SQUARE                 = "fa_behance_square";
    public static final String FA_BIMOBJECT                      = "fa_bimobject";
    public static final String FA_BITBUCKET                      = "fa_bitbucket";
    public static final String FA_BITCOIN                        = "fa_bitcoin";
    public static final String FA_BITY                           = "fa_bity";
    public static final String FA_BLACK_TIE                      = "fa_black_tie";
    public static final String FA_BLACKBERRY                     = "fa_blackberry";
    public static final String FA_BLOGGER                        = "fa_blogger";
    public static final String FA_BLOGGER_B                      = "fa_blogger_b";
    public static final String FA_BLUETOOTH                      = "fa_bluetooth";
    public static final String FA_BLUETOOTH_B                    = "fa_bluetooth_b";
    public static final String FA_BTC                            = "fa_btc";
    public static final String FA_BUROMOBELEXPERTE               = "fa_buromobelexperte";
    public static final String FA_CC_AMAZON_PAY                  = "fa_cc_amazon_pay";
    public static final String FA_CC_AMEX                        = "fa_cc_amex";
    public static final String FA_CC_APPLE_PAY                   = "fa_cc_apple_pay";
    public static final String FA_CC_DINERS_CLUB                 = "fa_cc_diners_club";
    public static final String FA_CC_DISCOVER                    = "fa_cc_discover";
    public static final String FA_CC_JCB                         = "fa_cc_jcb";
    public static final String FA_CC_MASTERCARD                  = "fa_cc_mastercard";
    public static final String FA_CC_PAYPAL                      = "fa_cc_paypal";
    public static final String FA_CC_STRIPE                      = "fa_cc_stripe";
    public static final String FA_CC_VISA                        = "fa_cc_visa";
    public static final String FA_CENTERCODE                     = "fa_centercode";
    public static final String FA_CHROME                         = "fa_chrome";
    public static final String FA_CLOUDSCALE                     = "fa_cloudscale";
    public static final String FA_CLOUDSMITH                     = "fa_cloudsmith";
    public static final String FA_CLOUDVERSIFY                   = "fa_cloudversify";
    public static final String FA_CODEPEN                        = "fa_codepen";
    public static final String FA_CODIEPIE                       = "fa_codiepie";
    public static final String FA_CONNECTDEVELOP                 = "fa_connectdevelop";
    public static final String FA_CONTAO                         = "fa_contao";
    public static final String FA_CPANEL                         = "fa_cpanel";
    public static final String FA_CREATIVE_COMMONS               = "fa_creative_commons";
    public static final String FA_CREATIVE_COMMONS_BY            = "fa_creative_commons_by";
    public static final String FA_CREATIVE_COMMONS_NC            = "fa_creative_commons_nc";
    public static final String FA_CREATIVE_COMMONS_NC_EU         = "fa_creative_commons_nc_eu";
    public static final String FA_CREATIVE_COMMONS_NC_JP         = "fa_creative_commons_nc_jp";
    public static final String FA_CREATIVE_COMMONS_ND            = "fa_creative_commons_nd";
    public static final String FA_CREATIVE_COMMONS_PD            = "fa_creative_commons_pd";
    public static final String FA_CREATIVE_COMMONS_PD_ALT        = "fa_creative_commons_pd_alt";
    public static final String FA_CREATIVE_COMMONS_REMIX         = "fa_creative_commons_remix";
    public static final String FA_CREATIVE_COMMONS_SA            = "fa_creative_commons_sa";
    public static final String FA_CREATIVE_COMMONS_SAMPLING      = "fa_creative_commons_sampling";
    public static final String FA_CREATIVE_COMMONS_SAMPLING_PLUS = "fa_creative_commons_sampling_plus";
    public static final String FA_CREATIVE_COMMONS_SHARE         = "fa_creative_commons_share";
    public static final String FA_CREATIVE_COMMONS_ZERO          = "fa_creative_commons_zero";
    public static final String FA_CRITICAL_ROLE                  = "fa_critical_role";
    public static final String FA_CSS3                           = "fa_css3";
    public static final String FA_CSS3_ALT                       = "fa_css3_alt";
    public static final String FA_CUTTLEFISH                     = "fa_cuttlefish";
    public static final String FA_D_AND_D                        = "fa_d_and_d";
    public static final String FA_D_AND_D_BEYOND                 = "fa_d_and_d_beyond";
    public static final String FA_DASHCUBE                       = "fa_dashcube";
    public static final String FA_DELICIOUS                      = "fa_delicious";
    public static final String FA_DEPLOYDOG                      = "fa_deploydog";
    public static final String FA_DESKPRO                        = "fa_deskpro";
    public static final String FA_DEV                            = "fa_dev";
    public static final String FA_DEVIANTART                     = "fa_deviantart";
    public static final String FA_DIGG                           = "fa_digg";
    public static final String FA_DIGITAL_OCEAN                  = "fa_digital_ocean";
    public static final String FA_DISCORD                        = "fa_discord";
    public static final String FA_DISCOURSE                      = "fa_discourse";
    public static final String FA_DOCHUB                         = "fa_dochub";
    public static final String FA_DOCKER                         = "fa_docker";
    public static final String FA_DRAFT2DIGITAL                  = "fa_draft2digital";
    public static final String FA_DRIBBBLE                       = "fa_dribbble";
    public static final String FA_DRIBBBLE_SQUARE                = "fa_dribbble_square";
    public static final String FA_DROPBOX                        = "fa_dropbox";
    public static final String FA_DRUPAL                         = "fa_drupal";
    public static final String FA_DYALOG                         = "fa_dyalog";
    public static final String FA_EARLYBIRDS                     = "fa_earlybirds";
    public static final String FA_EBAY                           = "fa_ebay";
    public static final String FA_EDGE                           = "fa_edge";
    public static final String FA_ELEMENTOR                      = "fa_elementor";
    public static final String FA_ELLO                           = "fa_ello";
    public static final String FA_EMBER                          = "fa_ember";
    public static final String FA_EMPIRE                         = "fa_empire";
    public static final String FA_ENVIRA                         = "fa_envira";
    public static final String FA_ERLANG                         = "fa_erlang";
    public static final String FA_ETHEREUM                       = "fa_ethereum";
    public static final String FA_ETSY                           = "fa_etsy";
    public static final String FA_EXPEDITEDSSL                   = "fa_expeditedssl";
    public static final String FA_FACEBOOK                       = "fa_facebook";
    public static final String FA_FACEBOOK_F                     = "fa_facebook_f";
    public static final String FA_FACEBOOK_MESSENGER             = "fa_facebook_messenger";
    public static final String FA_FACEBOOK_SQUARE                = "fa_facebook_square";
    public static final String FA_FANTASY_FLIGHT_GAMES           = "fa_fantasy_flight_games";
    public static final String FA_FIREFOX                        = "fa_firefox";
    public static final String FA_FIRST_ORDER                    = "fa_first_order";
    public static final String FA_FIRST_ORDER_ALT                = "fa_first_order_alt";
    public static final String FA_FIRSTDRAFT                     = "fa_firstdraft";
    public static final String FA_FLICKR                         = "fa_flickr";
    public static final String FA_FLIPBOARD                      = "fa_flipboard";
    public static final String FA_FLY                            = "fa_fly";
    public static final String FA_FONT_AWESOME                   = "fa_font_awesome";
    public static final String FA_FONT_AWESOME_ALT               = "fa_font_awesome_alt";
    public static final String FA_FONT_AWESOME_FLAG              = "fa_font_awesome_flag";
    public static final String FA_FONTICONS                      = "fa_fonticons";
    public static final String FA_FONTICONS_FI                   = "fa_fonticons_fi";
    public static final String FA_FORT_AWESOME                   = "fa_fort_awesome";
    public static final String FA_FORT_AWESOME_ALT               = "fa_fort_awesome_alt";
    public static final String FA_FORUMBEE                       = "fa_forumbee";
    public static final String FA_FOURSQUARE                     = "fa_foursquare";
    public static final String FA_FREE_CODE_CAMP                 = "fa_free_code_camp";
    public static final String FA_FREEBSD                        = "fa_freebsd";
    public static final String FA_FULCRUM                        = "fa_fulcrum";
    public static final String FA_GALACTIC_REPUBLIC              = "fa_galactic_republic";
    public static final String FA_GALACTIC_SENATE                = "fa_galactic_senate";
    public static final String FA_GET_POCKET                     = "fa_get_pocket";
    public static final String FA_GG                             = "fa_gg";
    public static final String FA_GG_CIRCLE                      = "fa_gg_circle";
    public static final String FA_GIT                            = "fa_git";
    public static final String FA_GIT_SQUARE                     = "fa_git_square";
    public static final String FA_GITHUB                         = "fa_github";
    public static final String FA_GITHUB_ALT                     = "fa_github_alt";
    public static final String FA_GITHUB_SQUARE                  = "fa_github_square";
    public static final String FA_GITKRAKEN                      = "fa_gitkraken";
    public static final String FA_GITLAB                         = "fa_gitlab";
    public static final String FA_GITTER                         = "fa_gitter";
    public static final String FA_GLIDE                          = "fa_glide";
    public static final String FA_GLIDE_G                        = "fa_glide_g";
    public static final String FA_GOFORE                         = "fa_gofore";
    public static final String FA_GOODREADS                      = "fa_goodreads";
    public static final String FA_GOODREADS_G                    = "fa_goodreads_g";
    public static final String FA_GOOGLE                         = "fa_google";
    public static final String FA_GOOGLE_DRIVE                   = "fa_google_drive";
    public static final String FA_GOOGLE_PLAY                    = "fa_google_play";
    public static final String FA_GOOGLE_PLUS                    = "fa_google_plus";
    public static final String FA_GOOGLE_PLUS_G                  = "fa_google_plus_g";
    public static final String FA_GOOGLE_PLUS_SQUARE             = "fa_google_plus_square";
    public static final String FA_GOOGLE_WALLET                  = "fa_google_wallet";
    public static final String FA_GRATIPAY                       = "fa_gratipay";
    public static final String FA_GRAV                           = "fa_grav";
    public static final String FA_GRIPFIRE                       = "fa_gripfire";
    public static final String FA_GRUNT                          = "fa_grunt";
    public static final String FA_GULP                           = "fa_gulp";
    public static final String FA_HACKER_NEWS                    = "fa_hacker_news";
    public static final String FA_HACKER_NEWS_SQUARE             = "fa_hacker_news_square";
    public static final String FA_HACKERRANK                     = "fa_hackerrank";
    public static final String FA_HIPS                           = "fa_hips";
    public static final String FA_HIRE_A_HELPER                  = "fa_hire_a_helper";
    public static final String FA_HOOLI                          = "fa_hooli";
    public static final String FA_HORNBILL                       = "fa_hornbill";
    public static final String FA_HOTJAR                         = "fa_hotjar";
    public static final String FA_HOUZZ                          = "fa_houzz";
    public static final String FA_HTML5                          = "fa_html5";
    public static final String FA_HUBSPOT                        = "fa_hubspot";
    public static final String FA_IMDB                           = "fa_imdb";
    public static final String FA_INSTAGRAM                      = "fa_instagram";
    public static final String FA_INTERNET_EXPLORER              = "fa_internet_explorer";
    public static final String FA_IOXHOST                        = "fa_ioxhost";
    public static final String FA_ITUNES                         = "fa_itunes";
    public static final String FA_ITUNES_NOTE                    = "fa_itunes_note";
    public static final String FA_JAVA                           = "fa_java";
    public static final String FA_JEDI_ORDER                     = "fa_jedi_order";
    public static final String FA_JENKINS                        = "fa_jenkins";
    public static final String FA_JOGET                          = "fa_joget";
    public static final String FA_JOOMLA                         = "fa_joomla";
    public static final String FA_JS                             = "fa_js";
    public static final String FA_JS_SQUARE                      = "fa_js_square";
    public static final String FA_JSFIDDLE                       = "fa_jsfiddle";
    public static final String FA_KAGGLE                         = "fa_kaggle";
    public static final String FA_KEYBASE                        = "fa_keybase";
    public static final String FA_KEYCDN                         = "fa_keycdn";
    public static final String FA_KICKSTARTER                    = "fa_kickstarter";
    public static final String FA_KICKSTARTER_K                  = "fa_kickstarter_k";
    public static final String FA_KORVUE                         = "fa_korvue";
    public static final String FA_LARAVEL                        = "fa_laravel";
    public static final String FA_LASTFM                         = "fa_lastfm";
    public static final String FA_LASTFM_SQUARE                  = "fa_lastfm_square";
    public static final String FA_LEANPUB                        = "fa_leanpub";
    public static final String FA_LESS                           = "fa_less";
    public static final String FA_LINE                           = "fa_line";
    public static final String FA_LINKEDIN                       = "fa_linkedin";
    public static final String FA_LINKEDIN_IN                    = "fa_linkedin_in";
    public static final String FA_LINODE                         = "fa_linode";
    public static final String FA_LINUX                          = "fa_linux";
    public static final String FA_LYFT                           = "fa_lyft";
    public static final String FA_MAGENTO                        = "fa_magento";
    public static final String FA_MAILCHIMP                      = "fa_mailchimp";
    public static final String FA_MANDALORIAN                    = "fa_mandalorian";
    public static final String FA_MARKDOWN                       = "fa_markdown";
    public static final String FA_MASTODON                       = "fa_mastodon";
    public static final String FA_MAXCDN                         = "fa_maxcdn";
    public static final String FA_MEDAPPS                        = "fa_medapps";
    public static final String FA_MEDIUM                         = "fa_medium";
    public static final String FA_MEDIUM_M                       = "fa_medium_m";
    public static final String FA_MEDRT                          = "fa_medrt";
    public static final String FA_MEETUP                         = "fa_meetup";
    public static final String FA_MEGAPORT                       = "fa_megaport";
    public static final String FA_MICROSOFT                      = "fa_microsoft";
    public static final String FA_MIX                            = "fa_mix";
    public static final String FA_MIXCLOUD                       = "fa_mixcloud";
    public static final String FA_MIZUNI                         = "fa_mizuni";
    public static final String FA_MODX                           = "fa_modx";
    public static final String FA_MONERO                         = "fa_monero";
    public static final String FA_NAPSTER                        = "fa_napster";
    public static final String FA_NEOS                           = "fa_neos";
    public static final String FA_NIMBLR                         = "fa_nimblr";
    public static final String FA_NINTENDO_SWITCH                = "fa_nintendo_switch";
    public static final String FA_NODE                           = "fa_node";
    public static final String FA_NODE_JS                        = "fa_node_js";
    public static final String FA_NPM                            = "fa_npm";
    public static final String FA_NS8                            = "fa_ns8";
    public static final String FA_NUTRITIONIX                    = "fa_nutritionix";
    public static final String FA_ODNOKLASSNIKI                  = "fa_odnoklassniki";
    public static final String FA_ODNOKLASSNIKI_SQUARE           = "fa_odnoklassniki_square";
    public static final String FA_OLD_REPUBLIC                   = "fa_old_republic";
    public static final String FA_OPENCART                       = "fa_opencart";
    public static final String FA_OPENID                         = "fa_openid";
    public static final String FA_OPERA                          = "fa_opera";
    public static final String FA_OPTIN_MONSTER                  = "fa_optin_monster";
    public static final String FA_OSI                            = "fa_osi";
    public static final String FA_PAGE4                          = "fa_page4";
    public static final String FA_PAGELINES                      = "fa_pagelines";
    public static final String FA_PALFED                         = "fa_palfed";
    public static final String FA_PATREON                        = "fa_patreon";
    public static final String FA_PAYPAL                         = "fa_paypal";
    public static final String FA_PENNY_ARCADE                   = "fa_penny_arcade";
    public static final String FA_PERISCOPE                      = "fa_periscope";
    public static final String FA_PHABRICATOR                    = "fa_phabricator";
    public static final String FA_PHOENIX_FRAMEWORK              = "fa_phoenix_framework";
    public static final String FA_PHOENIX_SQUADRON               = "fa_phoenix_squadron";
    public static final String FA_PHP                            = "fa_php";
    public static final String FA_PIED_PIPER                     = "fa_pied_piper";
    public static final String FA_PIED_PIPER_ALT                 = "fa_pied_piper_alt";
    public static final String FA_PIED_PIPER_HAT                 = "fa_pied_piper_hat";
    public static final String FA_PIED_PIPER_PP                  = "fa_pied_piper_pp";
    public static final String FA_PINTEREST                      = "fa_pinterest";
    public static final String FA_PINTEREST_P                    = "fa_pinterest_p";
    public static final String FA_PINTEREST_SQUARE               = "fa_pinterest_square";
    public static final String FA_PLAYSTATION                    = "fa_playstation";
    public static final String FA_PRODUCT_HUNT                   = "fa_product_hunt";
    public static final String FA_PUSHED                         = "fa_pushed";
    public static final String FA_PYTHON                         = "fa_python";
    public static final String FA_QQ                             = "fa_qq";
    public static final String FA_QUINSCAPE                      = "fa_quinscape";
    public static final String FA_QUORA                          = "fa_quora";
    public static final String FA_R_PROJECT                      = "fa_r_project";
    public static final String FA_RAVELRY                        = "fa_ravelry";
    public static final String FA_REACT                          = "fa_react";
    public static final String FA_REACTEUROPE                    = "fa_reacteurope";
    public static final String FA_README                         = "fa_readme";
    public static final String FA_REBEL                          = "fa_rebel";
    public static final String FA_RED_RIVER                      = "fa_red_river";
    public static final String FA_REDDIT                         = "fa_reddit";
    public static final String FA_REDDIT_ALIEN                   = "fa_reddit_alien";
    public static final String FA_REDDIT_SQUARE                  = "fa_reddit_square";
    public static final String FA_RENREN                         = "fa_renren";
    public static final String FA_REPLYD                         = "fa_replyd";
    public static final String FA_RESEARCHGATE                   = "fa_researchgate";
    public static final String FA_RESOLVING                      = "fa_resolving";
    public static final String FA_REV                            = "fa_rev";
    public static final String FA_ROCKETCHAT                     = "fa_rocketchat";
    public static final String FA_ROCKRMS                        = "fa_rockrms";
    public static final String FA_SAFARI                         = "fa_safari";
    public static final String FA_SASS                           = "fa_sass";
    public static final String FA_SCHLIX                         = "fa_schlix";
    public static final String FA_SCRIBD                         = "fa_scribd";
    public static final String FA_SEARCHENGIN                    = "fa_searchengin";
    public static final String FA_SELLCAST                       = "fa_sellcast";
    public static final String FA_SELLSY                         = "fa_sellsy";
    public static final String FA_SERVICESTACK                   = "fa_servicestack";
    public static final String FA_SHIRTSINBULK                   = "fa_shirtsinbulk";
    public static final String FA_SHOPWARE                       = "fa_shopware";
    public static final String FA_SIMPLYBUILT                    = "fa_simplybuilt";
    public static final String FA_SISTRIX                        = "fa_sistrix";
    public static final String FA_SITH                           = "fa_sith";
    public static final String FA_SKYATLAS                       = "fa_skyatlas";
    public static final String FA_SKYPE                          = "fa_skype";
    public static final String FA_SLACK                          = "fa_slack";
    public static final String FA_SLACK_HASH                     = "fa_slack_hash";
    public static final String FA_SLIDESHARE                     = "fa_slideshare";
    public static final String FA_SNAPCHAT                       = "fa_snapchat";
    public static final String FA_SNAPCHAT_GHOST                 = "fa_snapchat_ghost";
    public static final String FA_SNAPCHAT_SQUARE                = "fa_snapchat_square";
    public static final String FA_SOUNDCLOUD                     = "fa_soundcloud";
    public static final String FA_SPEAKAP                        = "fa_speakap";
    public static final String FA_SPOTIFY                        = "fa_spotify";
    public static final String FA_SQUARESPACE                    = "fa_squarespace";
    public static final String FA_STACK_EXCHANGE                 = "fa_stack_exchange";
    public static final String FA_STACK_OVERFLOW                 = "fa_stack_overflow";
    public static final String FA_STAYLINKED                     = "fa_staylinked";
    public static final String FA_STEAM                          = "fa_steam";
    public static final String FA_STEAM_SQUARE                   = "fa_steam_square";
    public static final String FA_STEAM_SYMBOL                   = "fa_steam_symbol";
    public static final String FA_STICKER_MULE                   = "fa_sticker_mule";
    public static final String FA_STRAVA                         = "fa_strava";
    public static final String FA_STRIPE                         = "fa_stripe";
    public static final String FA_STRIPE_S                       = "fa_stripe_s";
    public static final String FA_STUDIOVINARI                   = "fa_studiovinari";
    public static final String FA_STUMBLEUPON                    = "fa_stumbleupon";
    public static final String FA_STUMBLEUPON_CIRCLE             = "fa_stumbleupon_circle";
    public static final String FA_SUPERPOWERS                    = "fa_superpowers";
    public static final String FA_SUPPLE                         = "fa_supple";
    public static final String FA_TEAMSPEAK                      = "fa_teamspeak";
    public static final String FA_TELEGRAM                       = "fa_telegram";
    public static final String FA_TELEGRAM_PLANE                 = "fa_telegram_plane";
    public static final String FA_TENCENT_WEIBO                  = "fa_tencent_weibo";
    public static final String FA_THE_RED_YETI                   = "fa_the_red_yeti";
    public static final String FA_THEMECO                        = "fa_themeco";
    public static final String FA_THEMEISLE                      = "fa_themeisle";
    public static final String FA_THINK_PEAKS                    = "fa_think_peaks";
    public static final String FA_TRADE_FEDERATION               = "fa_trade_federation";
    public static final String FA_TRELLO                         = "fa_trello";
    public static final String FA_TRIPADVISOR                    = "fa_tripadvisor";
    public static final String FA_TUMBLR                         = "fa_tumblr";
    public static final String FA_TUMBLR_SQUARE                  = "fa_tumblr_square";
    public static final String FA_TWITCH                         = "fa_twitch";
    public static final String FA_TWITTER                        = "fa_twitter";
    public static final String FA_TWITTER_SQUARE                 = "fa_twitter_square";
    public static final String FA_TYPO3                          = "fa_typo3";
    public static final String FA_UBER                           = "fa_uber";
    public static final String FA_UIKIT                          = "fa_uikit";
    public static final String FA_UNIREGISTRY                    = "fa_uniregistry";
    public static final String FA_UNTAPPD                        = "fa_untappd";
    public static final String FA_USB                            = "fa_usb";
    public static final String FA_USSUNNAH                       = "fa_ussunnah";
    public static final String FA_VAADIN                         = "fa_vaadin";
    public static final String FA_VIACOIN                        = "fa_viacoin";
    public static final String FA_VIADEO                         = "fa_viadeo";
    public static final String FA_VIADEO_SQUARE                  = "fa_viadeo_square";
    public static final String FA_VIBER                          = "fa_viber";
    public static final String FA_VIMEO                          = "fa_vimeo";
    public static final String FA_VIMEO_SQUARE                   = "fa_vimeo_square";
    public static final String FA_VIMEO_V                        = "fa_vimeo_v";
    public static final String FA_VINE                           = "fa_vine";
    public static final String FA_VK                             = "fa_vk";
    public static final String FA_VNV                            = "fa_vnv";
    public static final String FA_VUEJS                          = "fa_vuejs";
    public static final String FA_WEEBLY                         = "fa_weebly";
    public static final String FA_WEIBO                          = "fa_weibo";
    public static final String FA_WEIXIN                         = "fa_weixin";
    public static final String FA_WHATSAPP                       = "fa_whatsapp";
    public static final String FA_WHATSAPP_SQUARE                = "fa_whatsapp_square";
    public static final String FA_WHMCS                          = "fa_whmcs";
    public static final String FA_WIKIPEDIA_W                    = "fa_wikipedia_w";
    public static final String FA_WINDOWS                        = "fa_windows";
    public static final String FA_WIX                            = "fa_wix";
    public static final String FA_WIZARDS_OF_THE_COAST           = "fa_wizards_of_the_coast";
    public static final String FA_WOLF_PACK_BATTALION            = "fa_wolf_pack_battalion";
    public static final String FA_WORDPRESS                      = "fa_wordpress";
    public static final String FA_WORDPRESS_SIMPLE               = "fa_wordpress_simple";
    public static final String FA_WPBEGINNER                     = "fa_wpbeginner";
    public static final String FA_WPEXPLORER                     = "fa_wpexplorer";
    public static final String FA_WPFORMS                        = "fa_wpforms";
    public static final String FA_WPRESSR                        = "fa_wpressr";
    public static final String FA_XBOX                           = "fa_xbox";
    public static final String FA_XING                           = "fa_xing";
    public static final String FA_XING_SQUARE                    = "fa_xing_square";
    public static final String FA_Y_COMBINATOR                   = "fa_y_combinator";
    public static final String FA_YAHOO                          = "fa_yahoo";
    public static final String FA_YANDEX                         = "fa_yandex";
    public static final String FA_YANDEX_INTERNATIONAL           = "fa_yandex_international";
    public static final String FA_YELP                           = "fa_yelp";
    public static final String FA_YOAST                          = "fa_yoast";
    public static final String FA_YOUTUBE                        = "fa_youtube";
    public static final String FA_YOUTUBE_SQUARE                 = "fa_youtube_square";
    public static final String FA_ZHIHU                          = "fa_zhihu";


    static {
        ICON_MAP.put(FA_500PX, "\uf26e");
        ICON_MAP.put(FA_ACCESSIBLE_ICON, "\uf368");
        ICON_MAP.put(FA_ACCUSOFT, "\uf369");
        ICON_MAP.put(FA_ACQUISITIONS_INCORPORATED, "\uf6af");
        ICON_MAP.put(FA_ADN, "\uf170");
        ICON_MAP.put(FA_ADVERSAL, "\uf36a");
        ICON_MAP.put(FA_AFFILIATETHEME, "\uf36b");
        ICON_MAP.put(FA_ALGOLIA, "\uf36c");
        ICON_MAP.put(FA_ALIPAY, "\uf642");
        ICON_MAP.put(FA_AMAZON, "\uf270");
        ICON_MAP.put(FA_AMAZON_PAY, "\uf42c");
        ICON_MAP.put(FA_AMILIA, "\uf36d");
        ICON_MAP.put(FA_ANDROID, "\uf17b");
        ICON_MAP.put(FA_ANGELLIST, "\uf209");
        ICON_MAP.put(FA_ANGRYCREATIVE, "\uf36e");
        ICON_MAP.put(FA_ANGULAR, "\uf420");
        ICON_MAP.put(FA_APP_STORE, "\uf36f");
        ICON_MAP.put(FA_APP_STORE_IOS, "\uf370");
        ICON_MAP.put(FA_APPER, "\uf371");
        ICON_MAP.put(FA_APPLE, "\uf179");
        ICON_MAP.put(FA_APPLE_PAY, "\uf415");
        ICON_MAP.put(FA_ASYMMETRIK, "\uf372");
        ICON_MAP.put(FA_AUDIBLE, "\uf373");
        ICON_MAP.put(FA_AUTOPREFIXER, "\uf41c");
        ICON_MAP.put(FA_AVIANEX, "\uf374");
        ICON_MAP.put(FA_AVIATO, "\uf421");
        ICON_MAP.put(FA_AWS, "\uf375");
        ICON_MAP.put(FA_BANDCAMP, "\uf2d5");
        ICON_MAP.put(FA_BEHANCE, "\uf1b4");
        ICON_MAP.put(FA_BEHANCE_SQUARE, "\uf1b5");
        ICON_MAP.put(FA_BIMOBJECT, "\uf378");
        ICON_MAP.put(FA_BITBUCKET, "\uf171");
        ICON_MAP.put(FA_BITCOIN, "\uf379");
        ICON_MAP.put(FA_BITY, "\uf37a");
        ICON_MAP.put(FA_BLACK_TIE, "\uf27e");
        ICON_MAP.put(FA_BLACKBERRY, "\uf37b");
        ICON_MAP.put(FA_BLOGGER, "\uf37c");
        ICON_MAP.put(FA_BLOGGER_B, "\uf37d");
        ICON_MAP.put(FA_BLUETOOTH, "\uf293");
        ICON_MAP.put(FA_BLUETOOTH_B, "\uf294");
        ICON_MAP.put(FA_BTC, "\uf15a");
        ICON_MAP.put(FA_BUROMOBELEXPERTE, "\uf37f");
        ICON_MAP.put(FA_CC_AMAZON_PAY, "\uf42d");
        ICON_MAP.put(FA_CC_AMEX, "\uf1f3");
        ICON_MAP.put(FA_CC_APPLE_PAY, "\uf416");
        ICON_MAP.put(FA_CC_DINERS_CLUB, "\uf24c");
        ICON_MAP.put(FA_CC_DISCOVER, "\uf1f2");
        ICON_MAP.put(FA_CC_JCB, "\uf24b");
        ICON_MAP.put(FA_CC_MASTERCARD, "\uf1f1");
        ICON_MAP.put(FA_CC_PAYPAL, "\uf1f4");
        ICON_MAP.put(FA_CC_STRIPE, "\uf1f5");
        ICON_MAP.put(FA_CC_VISA, "\uf1f0");
        ICON_MAP.put(FA_CENTERCODE, "\uf380");
        ICON_MAP.put(FA_CHROME, "\uf268");
        ICON_MAP.put(FA_CLOUDSCALE, "\uf383");
        ICON_MAP.put(FA_CLOUDSMITH, "\uf384");
        ICON_MAP.put(FA_CLOUDVERSIFY, "\uf385");
        ICON_MAP.put(FA_CODEPEN, "\uf1cb");
        ICON_MAP.put(FA_CODIEPIE, "\uf284");
        ICON_MAP.put(FA_CONNECTDEVELOP, "\uf20e");
        ICON_MAP.put(FA_CONTAO, "\uf26d");
        ICON_MAP.put(FA_CPANEL, "\uf388");
        ICON_MAP.put(FA_CREATIVE_COMMONS, "\uf25e");
        ICON_MAP.put(FA_CREATIVE_COMMONS_BY, "\uf4e7");
        ICON_MAP.put(FA_CREATIVE_COMMONS_NC, "\uf4e8");
        ICON_MAP.put(FA_CREATIVE_COMMONS_NC_EU, "\uf4e9");
        ICON_MAP.put(FA_CREATIVE_COMMONS_NC_JP, "\uf4ea");
        ICON_MAP.put(FA_CREATIVE_COMMONS_ND, "\uf4eb");
        ICON_MAP.put(FA_CREATIVE_COMMONS_PD, "\uf4ec");
        ICON_MAP.put(FA_CREATIVE_COMMONS_PD_ALT, "\uf4ed");
        ICON_MAP.put(FA_CREATIVE_COMMONS_REMIX, "\uf4ee");
        ICON_MAP.put(FA_CREATIVE_COMMONS_SA, "\uf4ef");
        ICON_MAP.put(FA_CREATIVE_COMMONS_SAMPLING, "\uf4f0");
        ICON_MAP.put(FA_CREATIVE_COMMONS_SAMPLING_PLUS, "\uf4f1");
        ICON_MAP.put(FA_CREATIVE_COMMONS_SHARE, "\uf4f2");
        ICON_MAP.put(FA_CREATIVE_COMMONS_ZERO, "\uf4f3");
        ICON_MAP.put(FA_CRITICAL_ROLE, "\uf6c9");
        ICON_MAP.put(FA_CSS3, "\uf13c");
        ICON_MAP.put(FA_CSS3_ALT, "\uf38b");
        ICON_MAP.put(FA_CUTTLEFISH, "\uf38c");
        ICON_MAP.put(FA_D_AND_D, "\uf38d");
        ICON_MAP.put(FA_D_AND_D_BEYOND, "\uf6ca");
        ICON_MAP.put(FA_DASHCUBE, "\uf210");
        ICON_MAP.put(FA_DELICIOUS, "\uf1a5");
        ICON_MAP.put(FA_DEPLOYDOG, "\uf38e");
        ICON_MAP.put(FA_DESKPRO, "\uf38f");
        ICON_MAP.put(FA_DEV, "\uf6cc");
        ICON_MAP.put(FA_DEVIANTART, "\uf1bd");
        ICON_MAP.put(FA_DIGG, "\uf1a6");
        ICON_MAP.put(FA_DIGITAL_OCEAN, "\uf391");
        ICON_MAP.put(FA_DISCORD, "\uf392");
        ICON_MAP.put(FA_DISCOURSE, "\uf393");
        ICON_MAP.put(FA_DOCHUB, "\uf394");
        ICON_MAP.put(FA_DOCKER, "\uf395");
        ICON_MAP.put(FA_DRAFT2DIGITAL, "\uf396");
        ICON_MAP.put(FA_DRIBBBLE, "\uf17d");
        ICON_MAP.put(FA_DRIBBBLE_SQUARE, "\uf397");
        ICON_MAP.put(FA_DROPBOX, "\uf16b");
        ICON_MAP.put(FA_DRUPAL, "\uf1a9");
        ICON_MAP.put(FA_DYALOG, "\uf399");
        ICON_MAP.put(FA_EARLYBIRDS, "\uf39a");
        ICON_MAP.put(FA_EBAY, "\uf4f4");
        ICON_MAP.put(FA_EDGE, "\uf282");
        ICON_MAP.put(FA_ELEMENTOR, "\uf430");
        ICON_MAP.put(FA_ELLO, "\uf5f1");
        ICON_MAP.put(FA_EMBER, "\uf423");
        ICON_MAP.put(FA_EMPIRE, "\uf1d1");
        ICON_MAP.put(FA_ENVIRA, "\uf299");
        ICON_MAP.put(FA_ERLANG, "\uf39d");
        ICON_MAP.put(FA_ETHEREUM, "\uf42e");
        ICON_MAP.put(FA_ETSY, "\uf2d7");
        ICON_MAP.put(FA_EXPEDITEDSSL, "\uf23e");
        ICON_MAP.put(FA_FACEBOOK, "\uf09a");
        ICON_MAP.put(FA_FACEBOOK_F, "\uf39e");
        ICON_MAP.put(FA_FACEBOOK_MESSENGER, "\uf39f");
        ICON_MAP.put(FA_FACEBOOK_SQUARE, "\uf082");
        ICON_MAP.put(FA_FANTASY_FLIGHT_GAMES, "\uf6dc");
        ICON_MAP.put(FA_FIREFOX, "\uf269");
        ICON_MAP.put(FA_FIRST_ORDER, "\uf2b0");
        ICON_MAP.put(FA_FIRST_ORDER_ALT, "\uf50a");
        ICON_MAP.put(FA_FIRSTDRAFT, "\uf3a1");
        ICON_MAP.put(FA_FLICKR, "\uf16e");
        ICON_MAP.put(FA_FLIPBOARD, "\uf44d");
        ICON_MAP.put(FA_FLY, "\uf417");
        ICON_MAP.put(FA_FONT_AWESOME, "\uf2b4");
        ICON_MAP.put(FA_FONT_AWESOME_ALT, "\uf35c");
        ICON_MAP.put(FA_FONT_AWESOME_FLAG, "\uf425");
        ICON_MAP.put(FA_FONTICONS, "\uf280");
        ICON_MAP.put(FA_FONTICONS_FI, "\uf3a2");
        ICON_MAP.put(FA_FORT_AWESOME, "\uf286");
        ICON_MAP.put(FA_FORT_AWESOME_ALT, "\uf3a3");
        ICON_MAP.put(FA_FORUMBEE, "\uf211");
        ICON_MAP.put(FA_FOURSQUARE, "\uf180");
        ICON_MAP.put(FA_FREE_CODE_CAMP, "\uf2c5");
        ICON_MAP.put(FA_FREEBSD, "\uf3a4");
        ICON_MAP.put(FA_FULCRUM, "\uf50b");
        ICON_MAP.put(FA_GALACTIC_REPUBLIC, "\uf50c");
        ICON_MAP.put(FA_GALACTIC_SENATE, "\uf50d");
        ICON_MAP.put(FA_GET_POCKET, "\uf265");
        ICON_MAP.put(FA_GG, "\uf260");
        ICON_MAP.put(FA_GG_CIRCLE, "\uf261");
        ICON_MAP.put(FA_GIT, "\uf1d3");
        ICON_MAP.put(FA_GIT_SQUARE, "\uf1d2");
        ICON_MAP.put(FA_GITHUB, "\uf09b");
        ICON_MAP.put(FA_GITHUB_ALT, "\uf113");
        ICON_MAP.put(FA_GITHUB_SQUARE, "\uf092");
        ICON_MAP.put(FA_GITKRAKEN, "\uf3a6");
        ICON_MAP.put(FA_GITLAB, "\uf296");
        ICON_MAP.put(FA_GITTER, "\uf426");
        ICON_MAP.put(FA_GLIDE, "\uf2a5");
        ICON_MAP.put(FA_GLIDE_G, "\uf2a6");
        ICON_MAP.put(FA_GOFORE, "\uf3a7");
        ICON_MAP.put(FA_GOODREADS, "\uf3a8");
        ICON_MAP.put(FA_GOODREADS_G, "\uf3a9");
        ICON_MAP.put(FA_GOOGLE, "\uf1a0");
        ICON_MAP.put(FA_GOOGLE_DRIVE, "\uf3aa");
        ICON_MAP.put(FA_GOOGLE_PLAY, "\uf3ab");
        ICON_MAP.put(FA_GOOGLE_PLUS, "\uf2b3");
        ICON_MAP.put(FA_GOOGLE_PLUS_G, "\uf0d5");
        ICON_MAP.put(FA_GOOGLE_PLUS_SQUARE, "\uf0d4");
        ICON_MAP.put(FA_GOOGLE_WALLET, "\uf1ee");
        ICON_MAP.put(FA_GRATIPAY, "\uf184");
        ICON_MAP.put(FA_GRAV, "\uf2d6");
        ICON_MAP.put(FA_GRIPFIRE, "\uf3ac");
        ICON_MAP.put(FA_GRUNT, "\uf3ad");
        ICON_MAP.put(FA_GULP, "\uf3ae");
        ICON_MAP.put(FA_HACKER_NEWS, "\uf1d4");
        ICON_MAP.put(FA_HACKER_NEWS_SQUARE, "\uf3af");
        ICON_MAP.put(FA_HACKERRANK, "\uf5f7");
        ICON_MAP.put(FA_HIPS, "\uf452");
        ICON_MAP.put(FA_HIRE_A_HELPER, "\uf3b0");
        ICON_MAP.put(FA_HOOLI, "\uf427");
        ICON_MAP.put(FA_HORNBILL, "\uf592");
        ICON_MAP.put(FA_HOTJAR, "\uf3b1");
        ICON_MAP.put(FA_HOUZZ, "\uf27c");
        ICON_MAP.put(FA_HTML5, "\uf13b");
        ICON_MAP.put(FA_HUBSPOT, "\uf3b2");
        ICON_MAP.put(FA_IMDB, "\uf2d8");
        ICON_MAP.put(FA_INSTAGRAM, "\uf16d");
        ICON_MAP.put(FA_INTERNET_EXPLORER, "\uf26b");
        ICON_MAP.put(FA_IOXHOST, "\uf208");
        ICON_MAP.put(FA_ITUNES, "\uf3b4");
        ICON_MAP.put(FA_ITUNES_NOTE, "\uf3b5");
        ICON_MAP.put(FA_JAVA, "\uf4e4");
        ICON_MAP.put(FA_JEDI_ORDER, "\uf50e");
        ICON_MAP.put(FA_JENKINS, "\uf3b6");
        ICON_MAP.put(FA_JOGET, "\uf3b7");
        ICON_MAP.put(FA_JOOMLA, "\uf1aa");
        ICON_MAP.put(FA_JS, "\uf3b8");
        ICON_MAP.put(FA_JS_SQUARE, "\uf3b9");
        ICON_MAP.put(FA_JSFIDDLE, "\uf1cc");
        ICON_MAP.put(FA_KAGGLE, "\uf5fa");
        ICON_MAP.put(FA_KEYBASE, "\uf4f5");
        ICON_MAP.put(FA_KEYCDN, "\uf3ba");
        ICON_MAP.put(FA_KICKSTARTER, "\uf3bb");
        ICON_MAP.put(FA_KICKSTARTER_K, "\uf3bc");
        ICON_MAP.put(FA_KORVUE, "\uf42f");
        ICON_MAP.put(FA_LARAVEL, "\uf3bd");
        ICON_MAP.put(FA_LASTFM, "\uf202");
        ICON_MAP.put(FA_LASTFM_SQUARE, "\uf203");
        ICON_MAP.put(FA_LEANPUB, "\uf212");
        ICON_MAP.put(FA_LESS, "\uf41d");
        ICON_MAP.put(FA_LINE, "\uf3c0");
        ICON_MAP.put(FA_LINKEDIN, "\uf08c");
        ICON_MAP.put(FA_LINKEDIN_IN, "\uf0e1");
        ICON_MAP.put(FA_LINODE, "\uf2b8");
        ICON_MAP.put(FA_LINUX, "\uf17c");
        ICON_MAP.put(FA_LYFT, "\uf3c3");
        ICON_MAP.put(FA_MAGENTO, "\uf3c4");
        ICON_MAP.put(FA_MAILCHIMP, "\uf59e");
        ICON_MAP.put(FA_MANDALORIAN, "\uf50f");
        ICON_MAP.put(FA_MARKDOWN, "\uf60f");
        ICON_MAP.put(FA_MASTODON, "\uf4f6");
        ICON_MAP.put(FA_MAXCDN, "\uf136");
        ICON_MAP.put(FA_MEDAPPS, "\uf3c6");
        ICON_MAP.put(FA_MEDIUM, "\uf23a");
        ICON_MAP.put(FA_MEDIUM_M, "\uf3c7");
        ICON_MAP.put(FA_MEDRT, "\uf3c8");
        ICON_MAP.put(FA_MEETUP, "\uf2e0");
        ICON_MAP.put(FA_MEGAPORT, "\uf5a3");
        ICON_MAP.put(FA_MICROSOFT, "\uf3ca");
        ICON_MAP.put(FA_MIX, "\uf3cb");
        ICON_MAP.put(FA_MIXCLOUD, "\uf289");
        ICON_MAP.put(FA_MIZUNI, "\uf3cc");
        ICON_MAP.put(FA_MODX, "\uf285");
        ICON_MAP.put(FA_MONERO, "\uf3d0");
        ICON_MAP.put(FA_NAPSTER, "\uf3d2");
        ICON_MAP.put(FA_NEOS, "\uf612");
        ICON_MAP.put(FA_NIMBLR, "\uf5a8");
        ICON_MAP.put(FA_NINTENDO_SWITCH, "\uf418");
        ICON_MAP.put(FA_NODE, "\uf419");
        ICON_MAP.put(FA_NODE_JS, "\uf3d3");
        ICON_MAP.put(FA_NPM, "\uf3d4");
        ICON_MAP.put(FA_NS8, "\uf3d5");
        ICON_MAP.put(FA_NUTRITIONIX, "\uf3d6");
        ICON_MAP.put(FA_ODNOKLASSNIKI, "\uf263");
        ICON_MAP.put(FA_ODNOKLASSNIKI_SQUARE, "\uf264");
        ICON_MAP.put(FA_OLD_REPUBLIC, "\uf510");
        ICON_MAP.put(FA_OPENCART, "\uf23d");
        ICON_MAP.put(FA_OPENID, "\uf19b");
        ICON_MAP.put(FA_OPERA, "\uf26a");
        ICON_MAP.put(FA_OPTIN_MONSTER, "\uf23c");
        ICON_MAP.put(FA_OSI, "\uf41a");
        ICON_MAP.put(FA_PAGE4, "\uf3d7");
        ICON_MAP.put(FA_PAGELINES, "\uf18c");
        ICON_MAP.put(FA_PALFED, "\uf3d8");
        ICON_MAP.put(FA_PATREON, "\uf3d9");
        ICON_MAP.put(FA_PAYPAL, "\uf1ed");
        ICON_MAP.put(FA_PENNY_ARCADE, "\uf704");
        ICON_MAP.put(FA_PERISCOPE, "\uf3da");
        ICON_MAP.put(FA_PHABRICATOR, "\uf3db");
        ICON_MAP.put(FA_PHOENIX_FRAMEWORK, "\uf3dc");
        ICON_MAP.put(FA_PHOENIX_SQUADRON, "\uf511");
        ICON_MAP.put(FA_PHP, "\uf457");
        ICON_MAP.put(FA_PIED_PIPER, "\uf2ae");
        ICON_MAP.put(FA_PIED_PIPER_ALT, "\uf1a8");
        ICON_MAP.put(FA_PIED_PIPER_HAT, "\uf4e5");
        ICON_MAP.put(FA_PIED_PIPER_PP, "\uf1a7");
        ICON_MAP.put(FA_PINTEREST, "\uf0d2");
        ICON_MAP.put(FA_PINTEREST_P, "\uf231");
        ICON_MAP.put(FA_PINTEREST_SQUARE, "\uf0d3");
        ICON_MAP.put(FA_PLAYSTATION, "\uf3df");
        ICON_MAP.put(FA_PRODUCT_HUNT, "\uf288");
        ICON_MAP.put(FA_PUSHED, "\uf3e1");
        ICON_MAP.put(FA_PYTHON, "\uf3e2");
        ICON_MAP.put(FA_QQ, "\uf1d6");
        ICON_MAP.put(FA_QUINSCAPE, "\uf459");
        ICON_MAP.put(FA_QUORA, "\uf2c4");
        ICON_MAP.put(FA_R_PROJECT, "\uf4f7");
        ICON_MAP.put(FA_RAVELRY, "\uf2d9");
        ICON_MAP.put(FA_REACT, "\uf41b");
        ICON_MAP.put(FA_REACTEUROPE, "\uf75d");
        ICON_MAP.put(FA_README, "\uf4d5");
        ICON_MAP.put(FA_REBEL, "\uf1d0");
        ICON_MAP.put(FA_RED_RIVER, "\uf3e3");
        ICON_MAP.put(FA_REDDIT, "\uf1a1");
        ICON_MAP.put(FA_REDDIT_ALIEN, "\uf281");
        ICON_MAP.put(FA_REDDIT_SQUARE, "\uf1a2");
        ICON_MAP.put(FA_RENREN, "\uf18b");
        ICON_MAP.put(FA_REPLYD, "\uf3e6");
        ICON_MAP.put(FA_RESEARCHGATE, "\uf4f8");
        ICON_MAP.put(FA_RESOLVING, "\uf3e7");
        ICON_MAP.put(FA_REV, "\uf5b2");
        ICON_MAP.put(FA_ROCKETCHAT, "\uf3e8");
        ICON_MAP.put(FA_ROCKRMS, "\uf3e9");
        ICON_MAP.put(FA_SAFARI, "\uf267");
        ICON_MAP.put(FA_SASS, "\uf41e");
        ICON_MAP.put(FA_SCHLIX, "\uf3ea");
        ICON_MAP.put(FA_SCRIBD, "\uf28a");
        ICON_MAP.put(FA_SEARCHENGIN, "\uf3eb");
        ICON_MAP.put(FA_SELLCAST, "\uf2da");
        ICON_MAP.put(FA_SELLSY, "\uf213");
        ICON_MAP.put(FA_SERVICESTACK, "\uf3ec");
        ICON_MAP.put(FA_SHIRTSINBULK, "\uf214");
        ICON_MAP.put(FA_SHOPWARE, "\uf5b5");
        ICON_MAP.put(FA_SIMPLYBUILT, "\uf215");
        ICON_MAP.put(FA_SISTRIX, "\uf3ee");
        ICON_MAP.put(FA_SITH, "\uf512");
        ICON_MAP.put(FA_SKYATLAS, "\uf216");
        ICON_MAP.put(FA_SKYPE, "\uf17e");
        ICON_MAP.put(FA_SLACK, "\uf198");
        ICON_MAP.put(FA_SLACK_HASH, "\uf3ef");
        ICON_MAP.put(FA_SLIDESHARE, "\uf1e7");
        ICON_MAP.put(FA_SNAPCHAT, "\uf2ab");
        ICON_MAP.put(FA_SNAPCHAT_GHOST, "\uf2ac");
        ICON_MAP.put(FA_SNAPCHAT_SQUARE, "\uf2ad");
        ICON_MAP.put(FA_SOUNDCLOUD, "\uf1be");
        ICON_MAP.put(FA_SPEAKAP, "\uf3f3");
        ICON_MAP.put(FA_SPOTIFY, "\uf1bc");
        ICON_MAP.put(FA_SQUARESPACE, "\uf5be");
        ICON_MAP.put(FA_STACK_EXCHANGE, "\uf18d");
        ICON_MAP.put(FA_STACK_OVERFLOW, "\uf16c");
        ICON_MAP.put(FA_STAYLINKED, "\uf3f5");
        ICON_MAP.put(FA_STEAM, "\uf1b6");
        ICON_MAP.put(FA_STEAM_SQUARE, "\uf1b7");
        ICON_MAP.put(FA_STEAM_SYMBOL, "\uf3f6");
        ICON_MAP.put(FA_STICKER_MULE, "\uf3f7");
        ICON_MAP.put(FA_STRAVA, "\uf428");
        ICON_MAP.put(FA_STRIPE, "\uf429");
        ICON_MAP.put(FA_STRIPE_S, "\uf42a");
        ICON_MAP.put(FA_STUDIOVINARI, "\uf3f8");
        ICON_MAP.put(FA_STUMBLEUPON, "\uf1a4");
        ICON_MAP.put(FA_STUMBLEUPON_CIRCLE, "\uf1a3");
        ICON_MAP.put(FA_SUPERPOWERS, "\uf2dd");
        ICON_MAP.put(FA_SUPPLE, "\uf3f9");
        ICON_MAP.put(FA_TEAMSPEAK, "\uf4f9");
        ICON_MAP.put(FA_TELEGRAM, "\uf2c6");
        ICON_MAP.put(FA_TELEGRAM_PLANE, "\uf3fe");
        ICON_MAP.put(FA_TENCENT_WEIBO, "\uf1d5");
        ICON_MAP.put(FA_THE_RED_YETI, "\uf69d");
        ICON_MAP.put(FA_THEMECO, "\uf5c6");
        ICON_MAP.put(FA_THEMEISLE, "\uf2b2");
        ICON_MAP.put(FA_THINK_PEAKS, "\uf731");
        ICON_MAP.put(FA_TRADE_FEDERATION, "\uf513");
        ICON_MAP.put(FA_TRELLO, "\uf181");
        ICON_MAP.put(FA_TRIPADVISOR, "\uf262");
        ICON_MAP.put(FA_TUMBLR, "\uf173");
        ICON_MAP.put(FA_TUMBLR_SQUARE, "\uf174");
        ICON_MAP.put(FA_TWITCH, "\uf1e8");
        ICON_MAP.put(FA_TWITTER, "\uf099");
        ICON_MAP.put(FA_TWITTER_SQUARE, "\uf081");
        ICON_MAP.put(FA_TYPO3, "\uf42b");
        ICON_MAP.put(FA_UBER, "\uf402");
        ICON_MAP.put(FA_UIKIT, "\uf403");
        ICON_MAP.put(FA_UNIREGISTRY, "\uf404");
        ICON_MAP.put(FA_UNTAPPD, "\uf405");
        ICON_MAP.put(FA_USB, "\uf287");
        ICON_MAP.put(FA_USSUNNAH, "\uf407");
        ICON_MAP.put(FA_VAADIN, "\uf408");
        ICON_MAP.put(FA_VIACOIN, "\uf237");
        ICON_MAP.put(FA_VIADEO, "\uf2a9");
        ICON_MAP.put(FA_VIADEO_SQUARE, "\uf2aa");
        ICON_MAP.put(FA_VIBER, "\uf409");
        ICON_MAP.put(FA_VIMEO, "\uf40a");
        ICON_MAP.put(FA_VIMEO_SQUARE, "\uf194");
        ICON_MAP.put(FA_VIMEO_V, "\uf27d");
        ICON_MAP.put(FA_VINE, "\uf1ca");
        ICON_MAP.put(FA_VK, "\uf189");
        ICON_MAP.put(FA_VNV, "\uf40b");
        ICON_MAP.put(FA_VUEJS, "\uf41f");
        ICON_MAP.put(FA_WEEBLY, "\uf5cc");
        ICON_MAP.put(FA_WEIBO, "\uf18a");
        ICON_MAP.put(FA_WEIXIN, "\uf1d7");
        ICON_MAP.put(FA_WHATSAPP, "\uf232");
        ICON_MAP.put(FA_WHATSAPP_SQUARE, "\uf40c");
        ICON_MAP.put(FA_WHMCS, "\uf40d");
        ICON_MAP.put(FA_WIKIPEDIA_W, "\uf266");
        ICON_MAP.put(FA_WINDOWS, "\uf17a");
        ICON_MAP.put(FA_WIX, "\uf5cf");
        ICON_MAP.put(FA_WIZARDS_OF_THE_COAST, "\uf730");
        ICON_MAP.put(FA_WOLF_PACK_BATTALION, "\uf514");
        ICON_MAP.put(FA_WORDPRESS, "\uf19a");
        ICON_MAP.put(FA_WORDPRESS_SIMPLE, "\uf411");
        ICON_MAP.put(FA_WPBEGINNER, "\uf297");
        ICON_MAP.put(FA_WPEXPLORER, "\uf2de");
        ICON_MAP.put(FA_WPFORMS, "\uf298");
        ICON_MAP.put(FA_WPRESSR, "\uf3e4");
        ICON_MAP.put(FA_XBOX, "\uf412");
        ICON_MAP.put(FA_XING, "\uf168");
        ICON_MAP.put(FA_XING_SQUARE, "\uf169");
        ICON_MAP.put(FA_Y_COMBINATOR, "\uf23b");
        ICON_MAP.put(FA_YAHOO, "\uf19e");
        ICON_MAP.put(FA_YANDEX, "\uf413");
        ICON_MAP.put(FA_YANDEX_INTERNATIONAL, "\uf414");
        ICON_MAP.put(FA_YELP, "\uf1e9");
        ICON_MAP.put(FA_YOAST, "\uf2b1");
        ICON_MAP.put(FA_YOUTUBE, "\uf167");
        ICON_MAP.put(FA_YOUTUBE_SQUARE, "\uf431");
        ICON_MAP.put(FA_ZHIHU, "\uf63f");

    }

}
