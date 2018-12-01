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
 * library.</b> For example, "fab-aa" would become "fab_aa". This is due to restrictions in how
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
            FAB_500PX,
            FAB_ACCESSIBLE_ICON,
            FAB_ACCUSOFT,
            FAB_ACQUISITIONS_INCORPORATED,
            FAB_ADN,
            FAB_ADVERSAL,
            FAB_AFFILIATETHEME,
            FAB_ALGOLIA,
            FAB_ALIPAY,
            FAB_AMAZON,
            FAB_AMAZON_PAY,
            FAB_AMILIA,
            FAB_ANDROID,
            FAB_ANGELLIST,
            FAB_ANGRYCREATIVE,
            FAB_ANGULAR,
            FAB_APP_STORE,
            FAB_APP_STORE_IOS,
            FAB_APPER,
            FAB_APPLE,
            FAB_APPLE_PAY,
            FAB_ASYMMETRIK,
            FAB_AUDIBLE,
            FAB_AUTOPREFIXER,
            FAB_AVIANEX,
            FAB_AVIATO,
            FAB_AWS,
            FAB_BANDCAMP,
            FAB_BEHANCE,
            FAB_BEHANCE_SQUARE,
            FAB_BIMOBJECT,
            FAB_BITBUCKET,
            FAB_BITCOIN,
            FAB_BITY,
            FAB_BLACK_TIE,
            FAB_BLACKBERRY,
            FAB_BLOGGER,
            FAB_BLOGGER_B,
            FAB_BLUETOOTH,
            FAB_BLUETOOTH_B,
            FAB_BTC,
            FAB_BUROMOBELEXPERTE,
            FAB_CC_AMAZON_PAY,
            FAB_CC_AMEX,
            FAB_CC_APPLE_PAY,
            FAB_CC_DINERS_CLUB,
            FAB_CC_DISCOVER,
            FAB_CC_JCB,
            FAB_CC_MASTERCARD,
            FAB_CC_PAYPAL,
            FAB_CC_STRIPE,
            FAB_CC_VISA,
            FAB_CENTERCODE,
            FAB_CHROME,
            FAB_CLOUDSCALE,
            FAB_CLOUDSMITH,
            FAB_CLOUDVERSIFY,
            FAB_CODEPEN,
            FAB_CODIEPIE,
            FAB_CONNECTDEVELOP,
            FAB_CONTAO,
            FAB_CPANEL,
            FAB_CREATIVE_COMMONS,
            FAB_CREATIVE_COMMONS_BY,
            FAB_CREATIVE_COMMONS_NC,
            FAB_CREATIVE_COMMONS_NC_EU,
            FAB_CREATIVE_COMMONS_NC_JP,
            FAB_CREATIVE_COMMONS_ND,
            FAB_CREATIVE_COMMONS_PD,
            FAB_CREATIVE_COMMONS_PD_ALT,
            FAB_CREATIVE_COMMONS_REMIX,
            FAB_CREATIVE_COMMONS_SA,
            FAB_CREATIVE_COMMONS_SAMPLING,
            FAB_CREATIVE_COMMONS_SAMPLING_PLUS,
            FAB_CREATIVE_COMMONS_SHARE,
            FAB_CREATIVE_COMMONS_ZERO,
            FAB_CRITICAL_ROLE,
            FAB_CSS3,
            FAB_CSS3_ALT,
            FAB_CUTTLEFISH,
            FAB_D_AND_D,
            FAB_D_AND_D_BEYOND,
            FAB_DASHCUBE,
            FAB_DELICIOUS,
            FAB_DEPLOYDOG,
            FAB_DESKPRO,
            FAB_DEV,
            FAB_DEVIANTART,
            FAB_DIGG,
            FAB_DIGITAL_OCEAN,
            FAB_DISCORD,
            FAB_DISCOURSE,
            FAB_DOCHUB,
            FAB_DOCKER,
            FAB_DRAFT2DIGITAL,
            FAB_DRIBBBLE,
            FAB_DRIBBBLE_SQUARE,
            FAB_DROPBOX,
            FAB_DRUPAL,
            FAB_DYALOG,
            FAB_EARLYBIRDS,
            FAB_EBAY,
            FAB_EDGE,
            FAB_ELEMENTOR,
            FAB_ELLO,
            FAB_EMBER,
            FAB_EMPIRE,
            FAB_ENVIRA,
            FAB_ERLANG,
            FAB_ETHEREUM,
            FAB_ETSY,
            FAB_EXPEDITEDSSL,
            FAB_FACEBOOK,
            FAB_FACEBOOK_F,
            FAB_FACEBOOK_MESSENGER,
            FAB_FACEBOOK_SQUARE,
            FAB_FANTASY_FLIGHT_GAMES,
            FAB_FIREFOX,
            FAB_FIRST_ORDER,
            FAB_FIRST_ORDER_ALT,
            FAB_FIRSTDRAFT,
            FAB_FLICKR,
            FAB_FLIPBOARD,
            FAB_FLY,
            FAB_FONT_AWESOME,
            FAB_FONT_AWESOME_ALT,
            FAB_FONT_AWESOME_FLAG,
            FAB_FONTICONS,
            FAB_FONTICONS_FI,
            FAB_FORT_AWESOME,
            FAB_FORT_AWESOME_ALT,
            FAB_FORUMBEE,
            FAB_FOURSQUARE,
            FAB_FREE_CODE_CAMP,
            FAB_FREEBSD,
            FAB_FULCRUM,
            FAB_GALACTIC_REPUBLIC,
            FAB_GALACTIC_SENATE,
            FAB_GET_POCKET,
            FAB_GG,
            FAB_GG_CIRCLE,
            FAB_GIT,
            FAB_GIT_SQUARE,
            FAB_GITHUB,
            FAB_GITHUB_ALT,
            FAB_GITHUB_SQUARE,
            FAB_GITKRAKEN,
            FAB_GITLAB,
            FAB_GITTER,
            FAB_GLIDE,
            FAB_GLIDE_G,
            FAB_GOFORE,
            FAB_GOODREADS,
            FAB_GOODREADS_G,
            FAB_GOOGLE,
            FAB_GOOGLE_DRIVE,
            FAB_GOOGLE_PLAY,
            FAB_GOOGLE_PLUS,
            FAB_GOOGLE_PLUS_G,
            FAB_GOOGLE_PLUS_SQUARE,
            FAB_GOOGLE_WALLET,
            FAB_GRATIPAY,
            FAB_GRAV,
            FAB_GRIPFIRE,
            FAB_GRUNT,
            FAB_GULP,
            FAB_HACKER_NEWS,
            FAB_HACKER_NEWS_SQUARE,
            FAB_HACKERRANK,
            FAB_HIPS,
            FAB_HIRE_A_HELPER,
            FAB_HOOLI,
            FAB_HORNBILL,
            FAB_HOTJAR,
            FAB_HOUZZ,
            FAB_HTML5,
            FAB_HUBSPOT,
            FAB_IMDB,
            FAB_INSTAGRAM,
            FAB_INTERNET_EXPLORER,
            FAB_IOXHOST,
            FAB_ITUNES,
            FAB_ITUNES_NOTE,
            FAB_JAVA,
            FAB_JEDI_ORDER,
            FAB_JENKINS,
            FAB_JOGET,
            FAB_JOOMLA,
            FAB_JS,
            FAB_JS_SQUARE,
            FAB_JSFIDDLE,
            FAB_KAGGLE,
            FAB_KEYBASE,
            FAB_KEYCDN,
            FAB_KICKSTARTER,
            FAB_KICKSTARTER_K,
            FAB_KORVUE,
            FAB_LARAVEL,
            FAB_LASTFM,
            FAB_LASTFM_SQUARE,
            FAB_LEANPUB,
            FAB_LESS,
            FAB_LINE,
            FAB_LINKEDIN,
            FAB_LINKEDIN_IN,
            FAB_LINODE,
            FAB_LINUX,
            FAB_LYFT,
            FAB_MAGENTO,
            FAB_MAILCHIMP,
            FAB_MANDALORIAN,
            FAB_MARKDOWN,
            FAB_MASTODON,
            FAB_MAXCDN,
            FAB_MEDAPPS,
            FAB_MEDIUM,
            FAB_MEDIUM_M,
            FAB_MEDRT,
            FAB_MEETUP,
            FAB_MEGAPORT,
            FAB_MICROSOFT,
            FAB_MIX,
            FAB_MIXCLOUD,
            FAB_MIZUNI,
            FAB_MODX,
            FAB_MONERO,
            FAB_NAPSTER,
            FAB_NEOS,
            FAB_NIMBLR,
            FAB_NINTENDO_SWITCH,
            FAB_NODE,
            FAB_NODE_JS,
            FAB_NPM,
            FAB_NS8,
            FAB_NUTRITIONIX,
            FAB_ODNOKLASSNIKI,
            FAB_ODNOKLASSNIKI_SQUARE,
            FAB_OLD_REPUBLIC,
            FAB_OPENCART,
            FAB_OPENID,
            FAB_OPERA,
            FAB_OPTIN_MONSTER,
            FAB_OSI,
            FAB_PAGE4,
            FAB_PAGELINES,
            FAB_PALFED,
            FAB_PATREON,
            FAB_PAYPAL,
            FAB_PENNY_ARCADE,
            FAB_PERISCOPE,
            FAB_PHABRICATOR,
            FAB_PHOENIX_FRAMEWORK,
            FAB_PHOENIX_SQUADRON,
            FAB_PHP,
            FAB_PIED_PIPER,
            FAB_PIED_PIPER_ALT,
            FAB_PIED_PIPER_HAT,
            FAB_PIED_PIPER_PP,
            FAB_PINTEREST,
            FAB_PINTEREST_P,
            FAB_PINTEREST_SQUARE,
            FAB_PLAYSTATION,
            FAB_PRODUCT_HUNT,
            FAB_PUSHED,
            FAB_PYTHON,
            FAB_QQ,
            FAB_QUINSCAPE,
            FAB_QUORA,
            FAB_R_PROJECT,
            FAB_RAVELRY,
            FAB_REACT,
            FAB_REACTEUROPE,
            FAB_README,
            FAB_REBEL,
            FAB_RED_RIVER,
            FAB_REDDIT,
            FAB_REDDIT_ALIEN,
            FAB_REDDIT_SQUARE,
            FAB_RENREN,
            FAB_REPLYD,
            FAB_RESEARCHGATE,
            FAB_RESOLVING,
            FAB_REV,
            FAB_ROCKETCHAT,
            FAB_ROCKRMS,
            FAB_SAFARI,
            FAB_SASS,
            FAB_SCHLIX,
            FAB_SCRIBD,
            FAB_SEARCHENGIN,
            FAB_SELLCAST,
            FAB_SELLSY,
            FAB_SERVICESTACK,
            FAB_SHIRTSINBULK,
            FAB_SHOPWARE,
            FAB_SIMPLYBUILT,
            FAB_SISTRIX,
            FAB_SITH,
            FAB_SKYATLAS,
            FAB_SKYPE,
            FAB_SLACK,
            FAB_SLACK_HASH,
            FAB_SLIDESHARE,
            FAB_SNAPCHAT,
            FAB_SNAPCHAT_GHOST,
            FAB_SNAPCHAT_SQUARE,
            FAB_SOUNDCLOUD,
            FAB_SPEAKAP,
            FAB_SPOTIFY,
            FAB_SQUARESPACE,
            FAB_STACK_EXCHANGE,
            FAB_STACK_OVERFLOW,
            FAB_STAYLINKED,
            FAB_STEAM,
            FAB_STEAM_SQUARE,
            FAB_STEAM_SYMBOL,
            FAB_STICKER_MULE,
            FAB_STRAVA,
            FAB_STRIPE,
            FAB_STRIPE_S,
            FAB_STUDIOVINARI,
            FAB_STUMBLEUPON,
            FAB_STUMBLEUPON_CIRCLE,
            FAB_SUPERPOWERS,
            FAB_SUPPLE,
            FAB_TEAMSPEAK,
            FAB_TELEGRAM,
            FAB_TELEGRAM_PLANE,
            FAB_TENCENT_WEIBO,
            FAB_THE_RED_YETI,
            FAB_THEMECO,
            FAB_THEMEISLE,
            FAB_THINK_PEAKS,
            FAB_TRADE_FEDERATION,
            FAB_TRELLO,
            FAB_TRIPADVISOR,
            FAB_TUMBLR,
            FAB_TUMBLR_SQUARE,
            FAB_TWITCH,
            FAB_TWITTER,
            FAB_TWITTER_SQUARE,
            FAB_TYPO3,
            FAB_UBER,
            FAB_UIKIT,
            FAB_UNIREGISTRY,
            FAB_UNTAPPD,
            FAB_USB,
            FAB_USSUNNAH,
            FAB_VAADIN,
            FAB_VIACOIN,
            FAB_VIADEO,
            FAB_VIADEO_SQUARE,
            FAB_VIBER,
            FAB_VIMEO,
            FAB_VIMEO_SQUARE,
            FAB_VIMEO_V,
            FAB_VINE,
            FAB_VK,
            FAB_VNV,
            FAB_VUEJS,
            FAB_WEEBLY,
            FAB_WEIBO,
            FAB_WEIXIN,
            FAB_WHATSAPP,
            FAB_WHATSAPP_SQUARE,
            FAB_WHMCS,
            FAB_WIKIPEDIA_W,
            FAB_WINDOWS,
            FAB_WIX,
            FAB_WIZARDS_OF_THE_COAST,
            FAB_WOLF_PACK_BATTALION,
            FAB_WORDPRESS,
            FAB_WORDPRESS_SIMPLE,
            FAB_WPBEGINNER,
            FAB_WPEXPLORER,
            FAB_WPFORMS,
            FAB_WPRESSR,
            FAB_XBOX,
            FAB_XING,
            FAB_XING_SQUARE,
            FAB_Y_COMBINATOR,
            FAB_YAHOO,
            FAB_YANDEX,
            FAB_YANDEX_INTERNATIONAL,
            FAB_YELP,
            FAB_YOAST,
            FAB_YOUTUBE,
            FAB_YOUTUBE_SQUARE,
            FAB_ZHIHU,
    })
    public @interface Icon {
    }

    public static final String FAB_500PX                          = "fa_500px";
    public static final String FAB_ACCESSIBLE_ICON                = "fa_accessible_icon";
    public static final String FAB_ACCUSOFT                       = "fa_accusoft";
    public static final String FAB_ACQUISITIONS_INCORPORATED      = "fa_acquisitions_incorporated";
    public static final String FAB_ADN                            = "fa_adn";
    public static final String FAB_ADVERSAL                       = "fa_adversal";
    public static final String FAB_AFFILIATETHEME                 = "fa_affiliatetheme";
    public static final String FAB_ALGOLIA                        = "fa_algolia";
    public static final String FAB_ALIPAY                         = "fa_alipay";
    public static final String FAB_AMAZON                         = "fa_amazon";
    public static final String FAB_AMAZON_PAY                     = "fa_amazon_pay";
    public static final String FAB_AMILIA                         = "fa_amilia";
    public static final String FAB_ANDROID                        = "fa_android";
    public static final String FAB_ANGELLIST                      = "fa_angellist";
    public static final String FAB_ANGRYCREATIVE                  = "fa_angrycreative";
    public static final String FAB_ANGULAR                        = "fa_angular";
    public static final String FAB_APP_STORE                      = "fa_app_store";
    public static final String FAB_APP_STORE_IOS                  = "fa_app_store_ios";
    public static final String FAB_APPER                          = "fa_apper";
    public static final String FAB_APPLE                          = "fa_apple";
    public static final String FAB_APPLE_PAY                      = "fa_apple_pay";
    public static final String FAB_ASYMMETRIK                     = "fa_asymmetrik";
    public static final String FAB_AUDIBLE                        = "fa_audible";
    public static final String FAB_AUTOPREFIXER                   = "fa_autoprefixer";
    public static final String FAB_AVIANEX                        = "fa_avianex";
    public static final String FAB_AVIATO                         = "fa_aviato";
    public static final String FAB_AWS                            = "fa_aws";
    public static final String FAB_BANDCAMP                       = "fa_bandcamp";
    public static final String FAB_BEHANCE                        = "fa_behance";
    public static final String FAB_BEHANCE_SQUARE                 = "fa_behance_square";
    public static final String FAB_BIMOBJECT                      = "fa_bimobject";
    public static final String FAB_BITBUCKET                      = "fa_bitbucket";
    public static final String FAB_BITCOIN                        = "fa_bitcoin";
    public static final String FAB_BITY                           = "fa_bity";
    public static final String FAB_BLACK_TIE                      = "fa_black_tie";
    public static final String FAB_BLACKBERRY                     = "fa_blackberry";
    public static final String FAB_BLOGGER                        = "fa_blogger";
    public static final String FAB_BLOGGER_B                      = "fa_blogger_b";
    public static final String FAB_BLUETOOTH                      = "fa_bluetooth";
    public static final String FAB_BLUETOOTH_B                    = "fa_bluetooth_b";
    public static final String FAB_BTC                            = "fa_btc";
    public static final String FAB_BUROMOBELEXPERTE               = "fa_buromobelexperte";
    public static final String FAB_CC_AMAZON_PAY                  = "fa_cc_amazon_pay";
    public static final String FAB_CC_AMEX                        = "fa_cc_amex";
    public static final String FAB_CC_APPLE_PAY                   = "fa_cc_apple_pay";
    public static final String FAB_CC_DINERS_CLUB                 = "fa_cc_diners_club";
    public static final String FAB_CC_DISCOVER                    = "fa_cc_discover";
    public static final String FAB_CC_JCB                         = "fa_cc_jcb";
    public static final String FAB_CC_MASTERCARD                  = "fa_cc_mastercard";
    public static final String FAB_CC_PAYPAL                      = "fa_cc_paypal";
    public static final String FAB_CC_STRIPE                      = "fa_cc_stripe";
    public static final String FAB_CC_VISA                        = "fa_cc_visa";
    public static final String FAB_CENTERCODE                     = "fa_centercode";
    public static final String FAB_CHROME                         = "fa_chrome";
    public static final String FAB_CLOUDSCALE                     = "fa_cloudscale";
    public static final String FAB_CLOUDSMITH                     = "fa_cloudsmith";
    public static final String FAB_CLOUDVERSIFY                   = "fa_cloudversify";
    public static final String FAB_CODEPEN                        = "fa_codepen";
    public static final String FAB_CODIEPIE                       = "fa_codiepie";
    public static final String FAB_CONNECTDEVELOP                 = "fa_connectdevelop";
    public static final String FAB_CONTAO                         = "fa_contao";
    public static final String FAB_CPANEL                         = "fa_cpanel";
    public static final String FAB_CREATIVE_COMMONS               = "fa_creative_commons";
    public static final String FAB_CREATIVE_COMMONS_BY            = "fa_creative_commons_by";
    public static final String FAB_CREATIVE_COMMONS_NC            = "fa_creative_commons_nc";
    public static final String FAB_CREATIVE_COMMONS_NC_EU         = "fa_creative_commons_nc_eu";
    public static final String FAB_CREATIVE_COMMONS_NC_JP         = "fa_creative_commons_nc_jp";
    public static final String FAB_CREATIVE_COMMONS_ND            = "fa_creative_commons_nd";
    public static final String FAB_CREATIVE_COMMONS_PD            = "fa_creative_commons_pd";
    public static final String FAB_CREATIVE_COMMONS_PD_ALT        = "fa_creative_commons_pd_alt";
    public static final String FAB_CREATIVE_COMMONS_REMIX         = "fa_creative_commons_remix";
    public static final String FAB_CREATIVE_COMMONS_SA            = "fa_creative_commons_sa";
    public static final String FAB_CREATIVE_COMMONS_SAMPLING      = "fa_creative_commons_sampling";
    public static final String FAB_CREATIVE_COMMONS_SAMPLING_PLUS = "fa_creative_commons_sampling_plus";
    public static final String FAB_CREATIVE_COMMONS_SHARE         = "fa_creative_commons_share";
    public static final String FAB_CREATIVE_COMMONS_ZERO          = "fa_creative_commons_zero";
    public static final String FAB_CRITICAL_ROLE                  = "fa_critical_role";
    public static final String FAB_CSS3                           = "fa_css3";
    public static final String FAB_CSS3_ALT                       = "fa_css3_alt";
    public static final String FAB_CUTTLEFISH                     = "fa_cuttlefish";
    public static final String FAB_D_AND_D                        = "fa_d_and_d";
    public static final String FAB_D_AND_D_BEYOND                 = "fa_d_and_d_beyond";
    public static final String FAB_DASHCUBE                       = "fa_dashcube";
    public static final String FAB_DELICIOUS                      = "fa_delicious";
    public static final String FAB_DEPLOYDOG                      = "fa_deploydog";
    public static final String FAB_DESKPRO                        = "fa_deskpro";
    public static final String FAB_DEV                            = "fa_dev";
    public static final String FAB_DEVIANTART                     = "fa_deviantart";
    public static final String FAB_DIGG                           = "fa_digg";
    public static final String FAB_DIGITAL_OCEAN                  = "fa_digital_ocean";
    public static final String FAB_DISCORD                        = "fa_discord";
    public static final String FAB_DISCOURSE                      = "fa_discourse";
    public static final String FAB_DOCHUB                         = "fa_dochub";
    public static final String FAB_DOCKER                         = "fa_docker";
    public static final String FAB_DRAFT2DIGITAL                  = "fa_draft2digital";
    public static final String FAB_DRIBBBLE                       = "fa_dribbble";
    public static final String FAB_DRIBBBLE_SQUARE                = "fa_dribbble_square";
    public static final String FAB_DROPBOX                        = "fa_dropbox";
    public static final String FAB_DRUPAL                         = "fa_drupal";
    public static final String FAB_DYALOG                         = "fa_dyalog";
    public static final String FAB_EARLYBIRDS                     = "fa_earlybirds";
    public static final String FAB_EBAY                           = "fa_ebay";
    public static final String FAB_EDGE                           = "fa_edge";
    public static final String FAB_ELEMENTOR                      = "fa_elementor";
    public static final String FAB_ELLO                           = "fa_ello";
    public static final String FAB_EMBER                          = "fa_ember";
    public static final String FAB_EMPIRE                         = "fa_empire";
    public static final String FAB_ENVIRA                         = "fa_envira";
    public static final String FAB_ERLANG                         = "fa_erlang";
    public static final String FAB_ETHEREUM                       = "fa_ethereum";
    public static final String FAB_ETSY                           = "fa_etsy";
    public static final String FAB_EXPEDITEDSSL                   = "fa_expeditedssl";
    public static final String FAB_FACEBOOK                       = "fa_facebook";
    public static final String FAB_FACEBOOK_F                     = "fa_facebook_f";
    public static final String FAB_FACEBOOK_MESSENGER             = "fa_facebook_messenger";
    public static final String FAB_FACEBOOK_SQUARE                = "fa_facebook_square";
    public static final String FAB_FANTASY_FLIGHT_GAMES           = "fa_fantasy_flight_games";
    public static final String FAB_FIREFOX                        = "fa_firefox";
    public static final String FAB_FIRST_ORDER                    = "fa_first_order";
    public static final String FAB_FIRST_ORDER_ALT                = "fa_first_order_alt";
    public static final String FAB_FIRSTDRAFT                     = "fa_firstdraft";
    public static final String FAB_FLICKR                         = "fa_flickr";
    public static final String FAB_FLIPBOARD                      = "fa_flipboard";
    public static final String FAB_FLY                            = "fa_fly";
    public static final String FAB_FONT_AWESOME                   = "fa_font_awesome";
    public static final String FAB_FONT_AWESOME_ALT               = "fa_font_awesome_alt";
    public static final String FAB_FONT_AWESOME_FLAG              = "fa_font_awesome_flag";
    public static final String FAB_FONTICONS                      = "fa_fonticons";
    public static final String FAB_FONTICONS_FI                   = "fa_fonticons_fi";
    public static final String FAB_FORT_AWESOME                   = "fa_fort_awesome";
    public static final String FAB_FORT_AWESOME_ALT               = "fa_fort_awesome_alt";
    public static final String FAB_FORUMBEE                       = "fa_forumbee";
    public static final String FAB_FOURSQUARE                     = "fa_foursquare";
    public static final String FAB_FREE_CODE_CAMP                 = "fa_free_code_camp";
    public static final String FAB_FREEBSD                        = "fa_freebsd";
    public static final String FAB_FULCRUM                        = "fa_fulcrum";
    public static final String FAB_GALACTIC_REPUBLIC              = "fa_galactic_republic";
    public static final String FAB_GALACTIC_SENATE                = "fa_galactic_senate";
    public static final String FAB_GET_POCKET                     = "fa_get_pocket";
    public static final String FAB_GG                             = "fa_gg";
    public static final String FAB_GG_CIRCLE                      = "fa_gg_circle";
    public static final String FAB_GIT                            = "fa_git";
    public static final String FAB_GIT_SQUARE                     = "fa_git_square";
    public static final String FAB_GITHUB                         = "fa_github";
    public static final String FAB_GITHUB_ALT                     = "fa_github_alt";
    public static final String FAB_GITHUB_SQUARE                  = "fa_github_square";
    public static final String FAB_GITKRAKEN                      = "fa_gitkraken";
    public static final String FAB_GITLAB                         = "fa_gitlab";
    public static final String FAB_GITTER                         = "fa_gitter";
    public static final String FAB_GLIDE                          = "fa_glide";
    public static final String FAB_GLIDE_G                        = "fa_glide_g";
    public static final String FAB_GOFORE                         = "fa_gofore";
    public static final String FAB_GOODREADS                      = "fa_goodreads";
    public static final String FAB_GOODREADS_G                    = "fa_goodreads_g";
    public static final String FAB_GOOGLE                         = "fa_google";
    public static final String FAB_GOOGLE_DRIVE                   = "fa_google_drive";
    public static final String FAB_GOOGLE_PLAY                    = "fa_google_play";
    public static final String FAB_GOOGLE_PLUS                    = "fa_google_plus";
    public static final String FAB_GOOGLE_PLUS_G                  = "fa_google_plus_g";
    public static final String FAB_GOOGLE_PLUS_SQUARE             = "fa_google_plus_square";
    public static final String FAB_GOOGLE_WALLET                  = "fa_google_wallet";
    public static final String FAB_GRATIPAY                       = "fa_gratipay";
    public static final String FAB_GRAV                           = "fa_grav";
    public static final String FAB_GRIPFIRE                       = "fa_gripfire";
    public static final String FAB_GRUNT                          = "fa_grunt";
    public static final String FAB_GULP                           = "fa_gulp";
    public static final String FAB_HACKER_NEWS                    = "fa_hacker_news";
    public static final String FAB_HACKER_NEWS_SQUARE             = "fa_hacker_news_square";
    public static final String FAB_HACKERRANK                     = "fa_hackerrank";
    public static final String FAB_HIPS                           = "fa_hips";
    public static final String FAB_HIRE_A_HELPER                  = "fa_hire_a_helper";
    public static final String FAB_HOOLI                          = "fa_hooli";
    public static final String FAB_HORNBILL                       = "fa_hornbill";
    public static final String FAB_HOTJAR                         = "fa_hotjar";
    public static final String FAB_HOUZZ                          = "fa_houzz";
    public static final String FAB_HTML5                          = "fa_html5";
    public static final String FAB_HUBSPOT                        = "fa_hubspot";
    public static final String FAB_IMDB                           = "fa_imdb";
    public static final String FAB_INSTAGRAM                      = "fa_instagram";
    public static final String FAB_INTERNET_EXPLORER              = "fa_internet_explorer";
    public static final String FAB_IOXHOST                        = "fa_ioxhost";
    public static final String FAB_ITUNES                         = "fa_itunes";
    public static final String FAB_ITUNES_NOTE                    = "fa_itunes_note";
    public static final String FAB_JAVA                           = "fa_java";
    public static final String FAB_JEDI_ORDER                     = "fa_jedi_order";
    public static final String FAB_JENKINS                        = "fa_jenkins";
    public static final String FAB_JOGET                          = "fa_joget";
    public static final String FAB_JOOMLA                         = "fa_joomla";
    public static final String FAB_JS                             = "fa_js";
    public static final String FAB_JS_SQUARE                      = "fa_js_square";
    public static final String FAB_JSFIDDLE                       = "fa_jsfiddle";
    public static final String FAB_KAGGLE                         = "fa_kaggle";
    public static final String FAB_KEYBASE                        = "fa_keybase";
    public static final String FAB_KEYCDN                         = "fa_keycdn";
    public static final String FAB_KICKSTARTER                    = "fa_kickstarter";
    public static final String FAB_KICKSTARTER_K                  = "fa_kickstarter_k";
    public static final String FAB_KORVUE                         = "fa_korvue";
    public static final String FAB_LARAVEL                        = "fa_laravel";
    public static final String FAB_LASTFM                         = "fa_lastfm";
    public static final String FAB_LASTFM_SQUARE                  = "fa_lastfm_square";
    public static final String FAB_LEANPUB                        = "fa_leanpub";
    public static final String FAB_LESS                           = "fa_less";
    public static final String FAB_LINE                           = "fa_line";
    public static final String FAB_LINKEDIN                       = "fa_linkedin";
    public static final String FAB_LINKEDIN_IN                    = "fa_linkedin_in";
    public static final String FAB_LINODE                         = "fa_linode";
    public static final String FAB_LINUX                          = "fa_linux";
    public static final String FAB_LYFT                           = "fa_lyft";
    public static final String FAB_MAGENTO                        = "fa_magento";
    public static final String FAB_MAILCHIMP                      = "fa_mailchimp";
    public static final String FAB_MANDALORIAN                    = "fa_mandalorian";
    public static final String FAB_MARKDOWN                       = "fa_markdown";
    public static final String FAB_MASTODON                       = "fa_mastodon";
    public static final String FAB_MAXCDN                         = "fa_maxcdn";
    public static final String FAB_MEDAPPS                        = "fa_medapps";
    public static final String FAB_MEDIUM                         = "fa_medium";
    public static final String FAB_MEDIUM_M                       = "fa_medium_m";
    public static final String FAB_MEDRT                          = "fa_medrt";
    public static final String FAB_MEETUP                         = "fa_meetup";
    public static final String FAB_MEGAPORT                       = "fa_megaport";
    public static final String FAB_MICROSOFT                      = "fa_microsoft";
    public static final String FAB_MIX                            = "fa_mix";
    public static final String FAB_MIXCLOUD                       = "fa_mixcloud";
    public static final String FAB_MIZUNI                         = "fa_mizuni";
    public static final String FAB_MODX                           = "fa_modx";
    public static final String FAB_MONERO                         = "fa_monero";
    public static final String FAB_NAPSTER                        = "fa_napster";
    public static final String FAB_NEOS                           = "fa_neos";
    public static final String FAB_NIMBLR                         = "fa_nimblr";
    public static final String FAB_NINTENDO_SWITCH                = "fa_nintendo_switch";
    public static final String FAB_NODE                           = "fa_node";
    public static final String FAB_NODE_JS                        = "fa_node_js";
    public static final String FAB_NPM                            = "fa_npm";
    public static final String FAB_NS8                            = "fa_ns8";
    public static final String FAB_NUTRITIONIX                    = "fa_nutritionix";
    public static final String FAB_ODNOKLASSNIKI                  = "fa_odnoklassniki";
    public static final String FAB_ODNOKLASSNIKI_SQUARE           = "fa_odnoklassniki_square";
    public static final String FAB_OLD_REPUBLIC                   = "fa_old_republic";
    public static final String FAB_OPENCART                       = "fa_opencart";
    public static final String FAB_OPENID                         = "fa_openid";
    public static final String FAB_OPERA                          = "fa_opera";
    public static final String FAB_OPTIN_MONSTER                  = "fa_optin_monster";
    public static final String FAB_OSI                            = "fa_osi";
    public static final String FAB_PAGE4                          = "fa_page4";
    public static final String FAB_PAGELINES                      = "fa_pagelines";
    public static final String FAB_PALFED                         = "fa_palfed";
    public static final String FAB_PATREON                        = "fa_patreon";
    public static final String FAB_PAYPAL                         = "fa_paypal";
    public static final String FAB_PENNY_ARCADE                   = "fa_penny_arcade";
    public static final String FAB_PERISCOPE                      = "fa_periscope";
    public static final String FAB_PHABRICATOR                    = "fa_phabricator";
    public static final String FAB_PHOENIX_FRAMEWORK              = "fa_phoenix_framework";
    public static final String FAB_PHOENIX_SQUADRON               = "fa_phoenix_squadron";
    public static final String FAB_PHP                            = "fa_php";
    public static final String FAB_PIED_PIPER                     = "fa_pied_piper";
    public static final String FAB_PIED_PIPER_ALT                 = "fa_pied_piper_alt";
    public static final String FAB_PIED_PIPER_HAT                 = "fa_pied_piper_hat";
    public static final String FAB_PIED_PIPER_PP                  = "fa_pied_piper_pp";
    public static final String FAB_PINTEREST                      = "fa_pinterest";
    public static final String FAB_PINTEREST_P                    = "fa_pinterest_p";
    public static final String FAB_PINTEREST_SQUARE               = "fa_pinterest_square";
    public static final String FAB_PLAYSTATION                    = "fa_playstation";
    public static final String FAB_PRODUCT_HUNT                   = "fa_product_hunt";
    public static final String FAB_PUSHED                         = "fa_pushed";
    public static final String FAB_PYTHON                         = "fa_python";
    public static final String FAB_QQ                             = "fa_qq";
    public static final String FAB_QUINSCAPE                      = "fa_quinscape";
    public static final String FAB_QUORA                          = "fa_quora";
    public static final String FAB_R_PROJECT                      = "fa_r_project";
    public static final String FAB_RAVELRY                        = "fa_ravelry";
    public static final String FAB_REACT                          = "fa_react";
    public static final String FAB_REACTEUROPE                    = "fa_reacteurope";
    public static final String FAB_README                         = "fa_readme";
    public static final String FAB_REBEL                          = "fa_rebel";
    public static final String FAB_RED_RIVER                      = "fa_red_river";
    public static final String FAB_REDDIT                         = "fa_reddit";
    public static final String FAB_REDDIT_ALIEN                   = "fa_reddit_alien";
    public static final String FAB_REDDIT_SQUARE                  = "fa_reddit_square";
    public static final String FAB_RENREN                         = "fa_renren";
    public static final String FAB_REPLYD                         = "fa_replyd";
    public static final String FAB_RESEARCHGATE                   = "fa_researchgate";
    public static final String FAB_RESOLVING                      = "fa_resolving";
    public static final String FAB_REV                            = "fa_rev";
    public static final String FAB_ROCKETCHAT                     = "fa_rocketchat";
    public static final String FAB_ROCKRMS                        = "fa_rockrms";
    public static final String FAB_SAFARI                         = "fa_safari";
    public static final String FAB_SASS                           = "fa_sass";
    public static final String FAB_SCHLIX                         = "fa_schlix";
    public static final String FAB_SCRIBD                         = "fa_scribd";
    public static final String FAB_SEARCHENGIN                    = "fa_searchengin";
    public static final String FAB_SELLCAST                       = "fa_sellcast";
    public static final String FAB_SELLSY                         = "fa_sellsy";
    public static final String FAB_SERVICESTACK                   = "fa_servicestack";
    public static final String FAB_SHIRTSINBULK                   = "fa_shirtsinbulk";
    public static final String FAB_SHOPWARE                       = "fa_shopware";
    public static final String FAB_SIMPLYBUILT                    = "fa_simplybuilt";
    public static final String FAB_SISTRIX                        = "fa_sistrix";
    public static final String FAB_SITH                           = "fa_sith";
    public static final String FAB_SKYATLAS                       = "fa_skyatlas";
    public static final String FAB_SKYPE                          = "fa_skype";
    public static final String FAB_SLACK                          = "fa_slack";
    public static final String FAB_SLACK_HASH                     = "fa_slack_hash";
    public static final String FAB_SLIDESHARE                     = "fa_slideshare";
    public static final String FAB_SNAPCHAT                       = "fa_snapchat";
    public static final String FAB_SNAPCHAT_GHOST                 = "fa_snapchat_ghost";
    public static final String FAB_SNAPCHAT_SQUARE                = "fa_snapchat_square";
    public static final String FAB_SOUNDCLOUD                     = "fa_soundcloud";
    public static final String FAB_SPEAKAP                        = "fa_speakap";
    public static final String FAB_SPOTIFY                        = "fa_spotify";
    public static final String FAB_SQUARESPACE                    = "fa_squarespace";
    public static final String FAB_STACK_EXCHANGE                 = "fa_stack_exchange";
    public static final String FAB_STACK_OVERFLOW                 = "fa_stack_overflow";
    public static final String FAB_STAYLINKED                     = "fa_staylinked";
    public static final String FAB_STEAM                          = "fa_steam";
    public static final String FAB_STEAM_SQUARE                   = "fa_steam_square";
    public static final String FAB_STEAM_SYMBOL                   = "fa_steam_symbol";
    public static final String FAB_STICKER_MULE                   = "fa_sticker_mule";
    public static final String FAB_STRAVA                         = "fa_strava";
    public static final String FAB_STRIPE                         = "fa_stripe";
    public static final String FAB_STRIPE_S                       = "fa_stripe_s";
    public static final String FAB_STUDIOVINARI                   = "fa_studiovinari";
    public static final String FAB_STUMBLEUPON                    = "fa_stumbleupon";
    public static final String FAB_STUMBLEUPON_CIRCLE             = "fa_stumbleupon_circle";
    public static final String FAB_SUPERPOWERS                    = "fa_superpowers";
    public static final String FAB_SUPPLE                         = "fa_supple";
    public static final String FAB_TEAMSPEAK                      = "fa_teamspeak";
    public static final String FAB_TELEGRAM                       = "fa_telegram";
    public static final String FAB_TELEGRAM_PLANE                 = "fa_telegram_plane";
    public static final String FAB_TENCENT_WEIBO                  = "fa_tencent_weibo";
    public static final String FAB_THE_RED_YETI                   = "fa_the_red_yeti";
    public static final String FAB_THEMECO                        = "fa_themeco";
    public static final String FAB_THEMEISLE                      = "fa_themeisle";
    public static final String FAB_THINK_PEAKS                    = "fa_think_peaks";
    public static final String FAB_TRADE_FEDERATION               = "fa_trade_federation";
    public static final String FAB_TRELLO                         = "fa_trello";
    public static final String FAB_TRIPADVISOR                    = "fa_tripadvisor";
    public static final String FAB_TUMBLR                         = "fa_tumblr";
    public static final String FAB_TUMBLR_SQUARE                  = "fa_tumblr_square";
    public static final String FAB_TWITCH                         = "fa_twitch";
    public static final String FAB_TWITTER                        = "fa_twitter";
    public static final String FAB_TWITTER_SQUARE                 = "fa_twitter_square";
    public static final String FAB_TYPO3                          = "fa_typo3";
    public static final String FAB_UBER                           = "fa_uber";
    public static final String FAB_UIKIT                          = "fa_uikit";
    public static final String FAB_UNIREGISTRY                    = "fa_uniregistry";
    public static final String FAB_UNTAPPD                        = "fa_untappd";
    public static final String FAB_USB                            = "fa_usb";
    public static final String FAB_USSUNNAH                       = "fa_ussunnah";
    public static final String FAB_VAADIN                         = "fa_vaadin";
    public static final String FAB_VIACOIN                        = "fa_viacoin";
    public static final String FAB_VIADEO                         = "fa_viadeo";
    public static final String FAB_VIADEO_SQUARE                  = "fa_viadeo_square";
    public static final String FAB_VIBER                          = "fa_viber";
    public static final String FAB_VIMEO                          = "fa_vimeo";
    public static final String FAB_VIMEO_SQUARE                   = "fa_vimeo_square";
    public static final String FAB_VIMEO_V                        = "fa_vimeo_v";
    public static final String FAB_VINE                           = "fa_vine";
    public static final String FAB_VK                             = "fa_vk";
    public static final String FAB_VNV                            = "fa_vnv";
    public static final String FAB_VUEJS                          = "fa_vuejs";
    public static final String FAB_WEEBLY                         = "fa_weebly";
    public static final String FAB_WEIBO                          = "fa_weibo";
    public static final String FAB_WEIXIN                         = "fa_weixin";
    public static final String FAB_WHATSAPP                       = "fa_whatsapp";
    public static final String FAB_WHATSAPP_SQUARE                = "fa_whatsapp_square";
    public static final String FAB_WHMCS                          = "fa_whmcs";
    public static final String FAB_WIKIPEDIA_W                    = "fa_wikipedia_w";
    public static final String FAB_WINDOWS                        = "fa_windows";
    public static final String FAB_WIX                            = "fa_wix";
    public static final String FAB_WIZARDS_OF_THE_COAST           = "fa_wizards_of_the_coast";
    public static final String FAB_WOLF_PACK_BATTALION            = "fa_wolf_pack_battalion";
    public static final String FAB_WORDPRESS                      = "fa_wordpress";
    public static final String FAB_WORDPRESS_SIMPLE               = "fa_wordpress_simple";
    public static final String FAB_WPBEGINNER                     = "fa_wpbeginner";
    public static final String FAB_WPEXPLORER                     = "fa_wpexplorer";
    public static final String FAB_WPFORMS                        = "fa_wpforms";
    public static final String FAB_WPRESSR                        = "fa_wpressr";
    public static final String FAB_XBOX                           = "fa_xbox";
    public static final String FAB_XING                           = "fa_xing";
    public static final String FAB_XING_SQUARE                    = "fa_xing_square";
    public static final String FAB_Y_COMBINATOR                   = "fa_y_combinator";
    public static final String FAB_YAHOO                          = "fa_yahoo";
    public static final String FAB_YANDEX                         = "fa_yandex";
    public static final String FAB_YANDEX_INTERNATIONAL           = "fa_yandex_international";
    public static final String FAB_YELP                           = "fa_yelp";
    public static final String FAB_YOAST                          = "fa_yoast";
    public static final String FAB_YOUTUBE                        = "fa_youtube";
    public static final String FAB_YOUTUBE_SQUARE                 = "fa_youtube_square";
    public static final String FAB_ZHIHU                          = "fa_zhihu";

    static {
        ICON_MAP.put(FAB_500PX, "\uf26e");
        ICON_MAP.put(FAB_ACCESSIBLE_ICON, "\uf368");
        ICON_MAP.put(FAB_ACCUSOFT, "\uf369");
        ICON_MAP.put(FAB_ACQUISITIONS_INCORPORATED, "\uf6af");
        ICON_MAP.put(FAB_ADN, "\uf170");
        ICON_MAP.put(FAB_ADVERSAL, "\uf36a");
        ICON_MAP.put(FAB_AFFILIATETHEME, "\uf36b");
        ICON_MAP.put(FAB_ALGOLIA, "\uf36c");
        ICON_MAP.put(FAB_ALIPAY, "\uf642");
        ICON_MAP.put(FAB_AMAZON, "\uf270");
        ICON_MAP.put(FAB_AMAZON_PAY, "\uf42c");
        ICON_MAP.put(FAB_AMILIA, "\uf36d");
        ICON_MAP.put(FAB_ANDROID, "\uf17b");
        ICON_MAP.put(FAB_ANGELLIST, "\uf209");
        ICON_MAP.put(FAB_ANGRYCREATIVE, "\uf36e");
        ICON_MAP.put(FAB_ANGULAR, "\uf420");
        ICON_MAP.put(FAB_APP_STORE, "\uf36f");
        ICON_MAP.put(FAB_APP_STORE_IOS, "\uf370");
        ICON_MAP.put(FAB_APPER, "\uf371");
        ICON_MAP.put(FAB_APPLE, "\uf179");
        ICON_MAP.put(FAB_APPLE_PAY, "\uf415");
        ICON_MAP.put(FAB_ASYMMETRIK, "\uf372");
        ICON_MAP.put(FAB_AUDIBLE, "\uf373");
        ICON_MAP.put(FAB_AUTOPREFIXER, "\uf41c");
        ICON_MAP.put(FAB_AVIANEX, "\uf374");
        ICON_MAP.put(FAB_AVIATO, "\uf421");
        ICON_MAP.put(FAB_AWS, "\uf375");
        ICON_MAP.put(FAB_BANDCAMP, "\uf2d5");
        ICON_MAP.put(FAB_BEHANCE, "\uf1b4");
        ICON_MAP.put(FAB_BEHANCE_SQUARE, "\uf1b5");
        ICON_MAP.put(FAB_BIMOBJECT, "\uf378");
        ICON_MAP.put(FAB_BITBUCKET, "\uf171");
        ICON_MAP.put(FAB_BITCOIN, "\uf379");
        ICON_MAP.put(FAB_BITY, "\uf37a");
        ICON_MAP.put(FAB_BLACK_TIE, "\uf27e");
        ICON_MAP.put(FAB_BLACKBERRY, "\uf37b");
        ICON_MAP.put(FAB_BLOGGER, "\uf37c");
        ICON_MAP.put(FAB_BLOGGER_B, "\uf37d");
        ICON_MAP.put(FAB_BLUETOOTH, "\uf293");
        ICON_MAP.put(FAB_BLUETOOTH_B, "\uf294");
        ICON_MAP.put(FAB_BTC, "\uf15a");
        ICON_MAP.put(FAB_BUROMOBELEXPERTE, "\uf37f");
        ICON_MAP.put(FAB_CC_AMAZON_PAY, "\uf42d");
        ICON_MAP.put(FAB_CC_AMEX, "\uf1f3");
        ICON_MAP.put(FAB_CC_APPLE_PAY, "\uf416");
        ICON_MAP.put(FAB_CC_DINERS_CLUB, "\uf24c");
        ICON_MAP.put(FAB_CC_DISCOVER, "\uf1f2");
        ICON_MAP.put(FAB_CC_JCB, "\uf24b");
        ICON_MAP.put(FAB_CC_MASTERCARD, "\uf1f1");
        ICON_MAP.put(FAB_CC_PAYPAL, "\uf1f4");
        ICON_MAP.put(FAB_CC_STRIPE, "\uf1f5");
        ICON_MAP.put(FAB_CC_VISA, "\uf1f0");
        ICON_MAP.put(FAB_CENTERCODE, "\uf380");
        ICON_MAP.put(FAB_CHROME, "\uf268");
        ICON_MAP.put(FAB_CLOUDSCALE, "\uf383");
        ICON_MAP.put(FAB_CLOUDSMITH, "\uf384");
        ICON_MAP.put(FAB_CLOUDVERSIFY, "\uf385");
        ICON_MAP.put(FAB_CODEPEN, "\uf1cb");
        ICON_MAP.put(FAB_CODIEPIE, "\uf284");
        ICON_MAP.put(FAB_CONNECTDEVELOP, "\uf20e");
        ICON_MAP.put(FAB_CONTAO, "\uf26d");
        ICON_MAP.put(FAB_CPANEL, "\uf388");
        ICON_MAP.put(FAB_CREATIVE_COMMONS, "\uf25e");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_BY, "\uf4e7");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_NC, "\uf4e8");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_NC_EU, "\uf4e9");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_NC_JP, "\uf4ea");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_ND, "\uf4eb");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_PD, "\uf4ec");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_PD_ALT, "\uf4ed");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_REMIX, "\uf4ee");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_SA, "\uf4ef");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_SAMPLING, "\uf4f0");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_SAMPLING_PLUS, "\uf4f1");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_SHARE, "\uf4f2");
        ICON_MAP.put(FAB_CREATIVE_COMMONS_ZERO, "\uf4f3");
        ICON_MAP.put(FAB_CRITICAL_ROLE, "\uf6c9");
        ICON_MAP.put(FAB_CSS3, "\uf13c");
        ICON_MAP.put(FAB_CSS3_ALT, "\uf38b");
        ICON_MAP.put(FAB_CUTTLEFISH, "\uf38c");
        ICON_MAP.put(FAB_D_AND_D, "\uf38d");
        ICON_MAP.put(FAB_D_AND_D_BEYOND, "\uf6ca");
        ICON_MAP.put(FAB_DASHCUBE, "\uf210");
        ICON_MAP.put(FAB_DELICIOUS, "\uf1a5");
        ICON_MAP.put(FAB_DEPLOYDOG, "\uf38e");
        ICON_MAP.put(FAB_DESKPRO, "\uf38f");
        ICON_MAP.put(FAB_DEV, "\uf6cc");
        ICON_MAP.put(FAB_DEVIANTART, "\uf1bd");
        ICON_MAP.put(FAB_DIGG, "\uf1a6");
        ICON_MAP.put(FAB_DIGITAL_OCEAN, "\uf391");
        ICON_MAP.put(FAB_DISCORD, "\uf392");
        ICON_MAP.put(FAB_DISCOURSE, "\uf393");
        ICON_MAP.put(FAB_DOCHUB, "\uf394");
        ICON_MAP.put(FAB_DOCKER, "\uf395");
        ICON_MAP.put(FAB_DRAFT2DIGITAL, "\uf396");
        ICON_MAP.put(FAB_DRIBBBLE, "\uf17d");
        ICON_MAP.put(FAB_DRIBBBLE_SQUARE, "\uf397");
        ICON_MAP.put(FAB_DROPBOX, "\uf16b");
        ICON_MAP.put(FAB_DRUPAL, "\uf1a9");
        ICON_MAP.put(FAB_DYALOG, "\uf399");
        ICON_MAP.put(FAB_EARLYBIRDS, "\uf39a");
        ICON_MAP.put(FAB_EBAY, "\uf4f4");
        ICON_MAP.put(FAB_EDGE, "\uf282");
        ICON_MAP.put(FAB_ELEMENTOR, "\uf430");
        ICON_MAP.put(FAB_ELLO, "\uf5f1");
        ICON_MAP.put(FAB_EMBER, "\uf423");
        ICON_MAP.put(FAB_EMPIRE, "\uf1d1");
        ICON_MAP.put(FAB_ENVIRA, "\uf299");
        ICON_MAP.put(FAB_ERLANG, "\uf39d");
        ICON_MAP.put(FAB_ETHEREUM, "\uf42e");
        ICON_MAP.put(FAB_ETSY, "\uf2d7");
        ICON_MAP.put(FAB_EXPEDITEDSSL, "\uf23e");
        ICON_MAP.put(FAB_FACEBOOK, "\uf09a");
        ICON_MAP.put(FAB_FACEBOOK_F, "\uf39e");
        ICON_MAP.put(FAB_FACEBOOK_MESSENGER, "\uf39f");
        ICON_MAP.put(FAB_FACEBOOK_SQUARE, "\uf082");
        ICON_MAP.put(FAB_FANTASY_FLIGHT_GAMES, "\uf6dc");
        ICON_MAP.put(FAB_FIREFOX, "\uf269");
        ICON_MAP.put(FAB_FIRST_ORDER, "\uf2b0");
        ICON_MAP.put(FAB_FIRST_ORDER_ALT, "\uf50a");
        ICON_MAP.put(FAB_FIRSTDRAFT, "\uf3a1");
        ICON_MAP.put(FAB_FLICKR, "\uf16e");
        ICON_MAP.put(FAB_FLIPBOARD, "\uf44d");
        ICON_MAP.put(FAB_FLY, "\uf417");
        ICON_MAP.put(FAB_FONT_AWESOME, "\uf2b4");
        ICON_MAP.put(FAB_FONT_AWESOME_ALT, "\uf35c");
        ICON_MAP.put(FAB_FONT_AWESOME_FLAG, "\uf425");
        ICON_MAP.put(FAB_FONTICONS, "\uf280");
        ICON_MAP.put(FAB_FONTICONS_FI, "\uf3a2");
        ICON_MAP.put(FAB_FORT_AWESOME, "\uf286");
        ICON_MAP.put(FAB_FORT_AWESOME_ALT, "\uf3a3");
        ICON_MAP.put(FAB_FORUMBEE, "\uf211");
        ICON_MAP.put(FAB_FOURSQUARE, "\uf180");
        ICON_MAP.put(FAB_FREE_CODE_CAMP, "\uf2c5");
        ICON_MAP.put(FAB_FREEBSD, "\uf3a4");
        ICON_MAP.put(FAB_FULCRUM, "\uf50b");
        ICON_MAP.put(FAB_GALACTIC_REPUBLIC, "\uf50c");
        ICON_MAP.put(FAB_GALACTIC_SENATE, "\uf50d");
        ICON_MAP.put(FAB_GET_POCKET, "\uf265");
        ICON_MAP.put(FAB_GG, "\uf260");
        ICON_MAP.put(FAB_GG_CIRCLE, "\uf261");
        ICON_MAP.put(FAB_GIT, "\uf1d3");
        ICON_MAP.put(FAB_GIT_SQUARE, "\uf1d2");
        ICON_MAP.put(FAB_GITHUB, "\uf09b");
        ICON_MAP.put(FAB_GITHUB_ALT, "\uf113");
        ICON_MAP.put(FAB_GITHUB_SQUARE, "\uf092");
        ICON_MAP.put(FAB_GITKRAKEN, "\uf3a6");
        ICON_MAP.put(FAB_GITLAB, "\uf296");
        ICON_MAP.put(FAB_GITTER, "\uf426");
        ICON_MAP.put(FAB_GLIDE, "\uf2a5");
        ICON_MAP.put(FAB_GLIDE_G, "\uf2a6");
        ICON_MAP.put(FAB_GOFORE, "\uf3a7");
        ICON_MAP.put(FAB_GOODREADS, "\uf3a8");
        ICON_MAP.put(FAB_GOODREADS_G, "\uf3a9");
        ICON_MAP.put(FAB_GOOGLE, "\uf1a0");
        ICON_MAP.put(FAB_GOOGLE_DRIVE, "\uf3aa");
        ICON_MAP.put(FAB_GOOGLE_PLAY, "\uf3ab");
        ICON_MAP.put(FAB_GOOGLE_PLUS, "\uf2b3");
        ICON_MAP.put(FAB_GOOGLE_PLUS_G, "\uf0d5");
        ICON_MAP.put(FAB_GOOGLE_PLUS_SQUARE, "\uf0d4");
        ICON_MAP.put(FAB_GOOGLE_WALLET, "\uf1ee");
        ICON_MAP.put(FAB_GRATIPAY, "\uf184");
        ICON_MAP.put(FAB_GRAV, "\uf2d6");
        ICON_MAP.put(FAB_GRIPFIRE, "\uf3ac");
        ICON_MAP.put(FAB_GRUNT, "\uf3ad");
        ICON_MAP.put(FAB_GULP, "\uf3ae");
        ICON_MAP.put(FAB_HACKER_NEWS, "\uf1d4");
        ICON_MAP.put(FAB_HACKER_NEWS_SQUARE, "\uf3af");
        ICON_MAP.put(FAB_HACKERRANK, "\uf5f7");
        ICON_MAP.put(FAB_HIPS, "\uf452");
        ICON_MAP.put(FAB_HIRE_A_HELPER, "\uf3b0");
        ICON_MAP.put(FAB_HOOLI, "\uf427");
        ICON_MAP.put(FAB_HORNBILL, "\uf592");
        ICON_MAP.put(FAB_HOTJAR, "\uf3b1");
        ICON_MAP.put(FAB_HOUZZ, "\uf27c");
        ICON_MAP.put(FAB_HTML5, "\uf13b");
        ICON_MAP.put(FAB_HUBSPOT, "\uf3b2");
        ICON_MAP.put(FAB_IMDB, "\uf2d8");
        ICON_MAP.put(FAB_INSTAGRAM, "\uf16d");
        ICON_MAP.put(FAB_INTERNET_EXPLORER, "\uf26b");
        ICON_MAP.put(FAB_IOXHOST, "\uf208");
        ICON_MAP.put(FAB_ITUNES, "\uf3b4");
        ICON_MAP.put(FAB_ITUNES_NOTE, "\uf3b5");
        ICON_MAP.put(FAB_JAVA, "\uf4e4");
        ICON_MAP.put(FAB_JEDI_ORDER, "\uf50e");
        ICON_MAP.put(FAB_JENKINS, "\uf3b6");
        ICON_MAP.put(FAB_JOGET, "\uf3b7");
        ICON_MAP.put(FAB_JOOMLA, "\uf1aa");
        ICON_MAP.put(FAB_JS, "\uf3b8");
        ICON_MAP.put(FAB_JS_SQUARE, "\uf3b9");
        ICON_MAP.put(FAB_JSFIDDLE, "\uf1cc");
        ICON_MAP.put(FAB_KAGGLE, "\uf5fa");
        ICON_MAP.put(FAB_KEYBASE, "\uf4f5");
        ICON_MAP.put(FAB_KEYCDN, "\uf3ba");
        ICON_MAP.put(FAB_KICKSTARTER, "\uf3bb");
        ICON_MAP.put(FAB_KICKSTARTER_K, "\uf3bc");
        ICON_MAP.put(FAB_KORVUE, "\uf42f");
        ICON_MAP.put(FAB_LARAVEL, "\uf3bd");
        ICON_MAP.put(FAB_LASTFM, "\uf202");
        ICON_MAP.put(FAB_LASTFM_SQUARE, "\uf203");
        ICON_MAP.put(FAB_LEANPUB, "\uf212");
        ICON_MAP.put(FAB_LESS, "\uf41d");
        ICON_MAP.put(FAB_LINE, "\uf3c0");
        ICON_MAP.put(FAB_LINKEDIN, "\uf08c");
        ICON_MAP.put(FAB_LINKEDIN_IN, "\uf0e1");
        ICON_MAP.put(FAB_LINODE, "\uf2b8");
        ICON_MAP.put(FAB_LINUX, "\uf17c");
        ICON_MAP.put(FAB_LYFT, "\uf3c3");
        ICON_MAP.put(FAB_MAGENTO, "\uf3c4");
        ICON_MAP.put(FAB_MAILCHIMP, "\uf59e");
        ICON_MAP.put(FAB_MANDALORIAN, "\uf50f");
        ICON_MAP.put(FAB_MARKDOWN, "\uf60f");
        ICON_MAP.put(FAB_MASTODON, "\uf4f6");
        ICON_MAP.put(FAB_MAXCDN, "\uf136");
        ICON_MAP.put(FAB_MEDAPPS, "\uf3c6");
        ICON_MAP.put(FAB_MEDIUM, "\uf23a");
        ICON_MAP.put(FAB_MEDIUM_M, "\uf3c7");
        ICON_MAP.put(FAB_MEDRT, "\uf3c8");
        ICON_MAP.put(FAB_MEETUP, "\uf2e0");
        ICON_MAP.put(FAB_MEGAPORT, "\uf5a3");
        ICON_MAP.put(FAB_MICROSOFT, "\uf3ca");
        ICON_MAP.put(FAB_MIX, "\uf3cb");
        ICON_MAP.put(FAB_MIXCLOUD, "\uf289");
        ICON_MAP.put(FAB_MIZUNI, "\uf3cc");
        ICON_MAP.put(FAB_MODX, "\uf285");
        ICON_MAP.put(FAB_MONERO, "\uf3d0");
        ICON_MAP.put(FAB_NAPSTER, "\uf3d2");
        ICON_MAP.put(FAB_NEOS, "\uf612");
        ICON_MAP.put(FAB_NIMBLR, "\uf5a8");
        ICON_MAP.put(FAB_NINTENDO_SWITCH, "\uf418");
        ICON_MAP.put(FAB_NODE, "\uf419");
        ICON_MAP.put(FAB_NODE_JS, "\uf3d3");
        ICON_MAP.put(FAB_NPM, "\uf3d4");
        ICON_MAP.put(FAB_NS8, "\uf3d5");
        ICON_MAP.put(FAB_NUTRITIONIX, "\uf3d6");
        ICON_MAP.put(FAB_ODNOKLASSNIKI, "\uf263");
        ICON_MAP.put(FAB_ODNOKLASSNIKI_SQUARE, "\uf264");
        ICON_MAP.put(FAB_OLD_REPUBLIC, "\uf510");
        ICON_MAP.put(FAB_OPENCART, "\uf23d");
        ICON_MAP.put(FAB_OPENID, "\uf19b");
        ICON_MAP.put(FAB_OPERA, "\uf26a");
        ICON_MAP.put(FAB_OPTIN_MONSTER, "\uf23c");
        ICON_MAP.put(FAB_OSI, "\uf41a");
        ICON_MAP.put(FAB_PAGE4, "\uf3d7");
        ICON_MAP.put(FAB_PAGELINES, "\uf18c");
        ICON_MAP.put(FAB_PALFED, "\uf3d8");
        ICON_MAP.put(FAB_PATREON, "\uf3d9");
        ICON_MAP.put(FAB_PAYPAL, "\uf1ed");
        ICON_MAP.put(FAB_PENNY_ARCADE, "\uf704");
        ICON_MAP.put(FAB_PERISCOPE, "\uf3da");
        ICON_MAP.put(FAB_PHABRICATOR, "\uf3db");
        ICON_MAP.put(FAB_PHOENIX_FRAMEWORK, "\uf3dc");
        ICON_MAP.put(FAB_PHOENIX_SQUADRON, "\uf511");
        ICON_MAP.put(FAB_PHP, "\uf457");
        ICON_MAP.put(FAB_PIED_PIPER, "\uf2ae");
        ICON_MAP.put(FAB_PIED_PIPER_ALT, "\uf1a8");
        ICON_MAP.put(FAB_PIED_PIPER_HAT, "\uf4e5");
        ICON_MAP.put(FAB_PIED_PIPER_PP, "\uf1a7");
        ICON_MAP.put(FAB_PINTEREST, "\uf0d2");
        ICON_MAP.put(FAB_PINTEREST_P, "\uf231");
        ICON_MAP.put(FAB_PINTEREST_SQUARE, "\uf0d3");
        ICON_MAP.put(FAB_PLAYSTATION, "\uf3df");
        ICON_MAP.put(FAB_PRODUCT_HUNT, "\uf288");
        ICON_MAP.put(FAB_PUSHED, "\uf3e1");
        ICON_MAP.put(FAB_PYTHON, "\uf3e2");
        ICON_MAP.put(FAB_QQ, "\uf1d6");
        ICON_MAP.put(FAB_QUINSCAPE, "\uf459");
        ICON_MAP.put(FAB_QUORA, "\uf2c4");
        ICON_MAP.put(FAB_R_PROJECT, "\uf4f7");
        ICON_MAP.put(FAB_RAVELRY, "\uf2d9");
        ICON_MAP.put(FAB_REACT, "\uf41b");
        ICON_MAP.put(FAB_REACTEUROPE, "\uf75d");
        ICON_MAP.put(FAB_README, "\uf4d5");
        ICON_MAP.put(FAB_REBEL, "\uf1d0");
        ICON_MAP.put(FAB_RED_RIVER, "\uf3e3");
        ICON_MAP.put(FAB_REDDIT, "\uf1a1");
        ICON_MAP.put(FAB_REDDIT_ALIEN, "\uf281");
        ICON_MAP.put(FAB_REDDIT_SQUARE, "\uf1a2");
        ICON_MAP.put(FAB_RENREN, "\uf18b");
        ICON_MAP.put(FAB_REPLYD, "\uf3e6");
        ICON_MAP.put(FAB_RESEARCHGATE, "\uf4f8");
        ICON_MAP.put(FAB_RESOLVING, "\uf3e7");
        ICON_MAP.put(FAB_REV, "\uf5b2");
        ICON_MAP.put(FAB_ROCKETCHAT, "\uf3e8");
        ICON_MAP.put(FAB_ROCKRMS, "\uf3e9");
        ICON_MAP.put(FAB_SAFARI, "\uf267");
        ICON_MAP.put(FAB_SASS, "\uf41e");
        ICON_MAP.put(FAB_SCHLIX, "\uf3ea");
        ICON_MAP.put(FAB_SCRIBD, "\uf28a");
        ICON_MAP.put(FAB_SEARCHENGIN, "\uf3eb");
        ICON_MAP.put(FAB_SELLCAST, "\uf2da");
        ICON_MAP.put(FAB_SELLSY, "\uf213");
        ICON_MAP.put(FAB_SERVICESTACK, "\uf3ec");
        ICON_MAP.put(FAB_SHIRTSINBULK, "\uf214");
        ICON_MAP.put(FAB_SHOPWARE, "\uf5b5");
        ICON_MAP.put(FAB_SIMPLYBUILT, "\uf215");
        ICON_MAP.put(FAB_SISTRIX, "\uf3ee");
        ICON_MAP.put(FAB_SITH, "\uf512");
        ICON_MAP.put(FAB_SKYATLAS, "\uf216");
        ICON_MAP.put(FAB_SKYPE, "\uf17e");
        ICON_MAP.put(FAB_SLACK, "\uf198");
        ICON_MAP.put(FAB_SLACK_HASH, "\uf3ef");
        ICON_MAP.put(FAB_SLIDESHARE, "\uf1e7");
        ICON_MAP.put(FAB_SNAPCHAT, "\uf2ab");
        ICON_MAP.put(FAB_SNAPCHAT_GHOST, "\uf2ac");
        ICON_MAP.put(FAB_SNAPCHAT_SQUARE, "\uf2ad");
        ICON_MAP.put(FAB_SOUNDCLOUD, "\uf1be");
        ICON_MAP.put(FAB_SPEAKAP, "\uf3f3");
        ICON_MAP.put(FAB_SPOTIFY, "\uf1bc");
        ICON_MAP.put(FAB_SQUARESPACE, "\uf5be");
        ICON_MAP.put(FAB_STACK_EXCHANGE, "\uf18d");
        ICON_MAP.put(FAB_STACK_OVERFLOW, "\uf16c");
        ICON_MAP.put(FAB_STAYLINKED, "\uf3f5");
        ICON_MAP.put(FAB_STEAM, "\uf1b6");
        ICON_MAP.put(FAB_STEAM_SQUARE, "\uf1b7");
        ICON_MAP.put(FAB_STEAM_SYMBOL, "\uf3f6");
        ICON_MAP.put(FAB_STICKER_MULE, "\uf3f7");
        ICON_MAP.put(FAB_STRAVA, "\uf428");
        ICON_MAP.put(FAB_STRIPE, "\uf429");
        ICON_MAP.put(FAB_STRIPE_S, "\uf42a");
        ICON_MAP.put(FAB_STUDIOVINARI, "\uf3f8");
        ICON_MAP.put(FAB_STUMBLEUPON, "\uf1a4");
        ICON_MAP.put(FAB_STUMBLEUPON_CIRCLE, "\uf1a3");
        ICON_MAP.put(FAB_SUPERPOWERS, "\uf2dd");
        ICON_MAP.put(FAB_SUPPLE, "\uf3f9");
        ICON_MAP.put(FAB_TEAMSPEAK, "\uf4f9");
        ICON_MAP.put(FAB_TELEGRAM, "\uf2c6");
        ICON_MAP.put(FAB_TELEGRAM_PLANE, "\uf3fe");
        ICON_MAP.put(FAB_TENCENT_WEIBO, "\uf1d5");
        ICON_MAP.put(FAB_THE_RED_YETI, "\uf69d");
        ICON_MAP.put(FAB_THEMECO, "\uf5c6");
        ICON_MAP.put(FAB_THEMEISLE, "\uf2b2");
        ICON_MAP.put(FAB_THINK_PEAKS, "\uf731");
        ICON_MAP.put(FAB_TRADE_FEDERATION, "\uf513");
        ICON_MAP.put(FAB_TRELLO, "\uf181");
        ICON_MAP.put(FAB_TRIPADVISOR, "\uf262");
        ICON_MAP.put(FAB_TUMBLR, "\uf173");
        ICON_MAP.put(FAB_TUMBLR_SQUARE, "\uf174");
        ICON_MAP.put(FAB_TWITCH, "\uf1e8");
        ICON_MAP.put(FAB_TWITTER, "\uf099");
        ICON_MAP.put(FAB_TWITTER_SQUARE, "\uf081");
        ICON_MAP.put(FAB_TYPO3, "\uf42b");
        ICON_MAP.put(FAB_UBER, "\uf402");
        ICON_MAP.put(FAB_UIKIT, "\uf403");
        ICON_MAP.put(FAB_UNIREGISTRY, "\uf404");
        ICON_MAP.put(FAB_UNTAPPD, "\uf405");
        ICON_MAP.put(FAB_USB, "\uf287");
        ICON_MAP.put(FAB_USSUNNAH, "\uf407");
        ICON_MAP.put(FAB_VAADIN, "\uf408");
        ICON_MAP.put(FAB_VIACOIN, "\uf237");
        ICON_MAP.put(FAB_VIADEO, "\uf2a9");
        ICON_MAP.put(FAB_VIADEO_SQUARE, "\uf2aa");
        ICON_MAP.put(FAB_VIBER, "\uf409");
        ICON_MAP.put(FAB_VIMEO, "\uf40a");
        ICON_MAP.put(FAB_VIMEO_SQUARE, "\uf194");
        ICON_MAP.put(FAB_VIMEO_V, "\uf27d");
        ICON_MAP.put(FAB_VINE, "\uf1ca");
        ICON_MAP.put(FAB_VK, "\uf189");
        ICON_MAP.put(FAB_VNV, "\uf40b");
        ICON_MAP.put(FAB_VUEJS, "\uf41f");
        ICON_MAP.put(FAB_WEEBLY, "\uf5cc");
        ICON_MAP.put(FAB_WEIBO, "\uf18a");
        ICON_MAP.put(FAB_WEIXIN, "\uf1d7");
        ICON_MAP.put(FAB_WHATSAPP, "\uf232");
        ICON_MAP.put(FAB_WHATSAPP_SQUARE, "\uf40c");
        ICON_MAP.put(FAB_WHMCS, "\uf40d");
        ICON_MAP.put(FAB_WIKIPEDIA_W, "\uf266");
        ICON_MAP.put(FAB_WINDOWS, "\uf17a");
        ICON_MAP.put(FAB_WIX, "\uf5cf");
        ICON_MAP.put(FAB_WIZARDS_OF_THE_COAST, "\uf730");
        ICON_MAP.put(FAB_WOLF_PACK_BATTALION, "\uf514");
        ICON_MAP.put(FAB_WORDPRESS, "\uf19a");
        ICON_MAP.put(FAB_WORDPRESS_SIMPLE, "\uf411");
        ICON_MAP.put(FAB_WPBEGINNER, "\uf297");
        ICON_MAP.put(FAB_WPEXPLORER, "\uf2de");
        ICON_MAP.put(FAB_WPFORMS, "\uf298");
        ICON_MAP.put(FAB_WPRESSR, "\uf3e4");
        ICON_MAP.put(FAB_XBOX, "\uf412");
        ICON_MAP.put(FAB_XING, "\uf168");
        ICON_MAP.put(FAB_XING_SQUARE, "\uf169");
        ICON_MAP.put(FAB_Y_COMBINATOR, "\uf23b");
        ICON_MAP.put(FAB_YAHOO, "\uf19e");
        ICON_MAP.put(FAB_YANDEX, "\uf413");
        ICON_MAP.put(FAB_YANDEX_INTERNATIONAL, "\uf414");
        ICON_MAP.put(FAB_YELP, "\uf1e9");
        ICON_MAP.put(FAB_YOAST, "\uf2b1");
        ICON_MAP.put(FAB_YOUTUBE, "\uf167");
        ICON_MAP.put(FAB_YOUTUBE_SQUARE, "\uf431");
        ICON_MAP.put(FAB_ZHIHU, "\uf63f");


        ATTR_MAP.put(0, FAB_500PX);
        ATTR_MAP.put(1, FAB_ACCESSIBLE_ICON);
        ATTR_MAP.put(2, FAB_ACCUSOFT);
        ATTR_MAP.put(3, FAB_ACQUISITIONS_INCORPORATED);
        ATTR_MAP.put(4, FAB_ADN);
        ATTR_MAP.put(5, FAB_ADVERSAL);
        ATTR_MAP.put(6, FAB_AFFILIATETHEME);
        ATTR_MAP.put(7, FAB_ALGOLIA);
        ATTR_MAP.put(8, FAB_ALIPAY);
        ATTR_MAP.put(9, FAB_AMAZON);
        ATTR_MAP.put(10, FAB_AMAZON_PAY);
        ATTR_MAP.put(11, FAB_AMILIA);
        ATTR_MAP.put(12, FAB_ANDROID);
        ATTR_MAP.put(13, FAB_ANGELLIST);
        ATTR_MAP.put(14, FAB_ANGRYCREATIVE);
        ATTR_MAP.put(15, FAB_ANGULAR);
        ATTR_MAP.put(16, FAB_APP_STORE);
        ATTR_MAP.put(17, FAB_APP_STORE_IOS);
        ATTR_MAP.put(18, FAB_APPER);
        ATTR_MAP.put(19, FAB_APPLE);
        ATTR_MAP.put(20, FAB_APPLE_PAY);
        ATTR_MAP.put(21, FAB_ASYMMETRIK);
        ATTR_MAP.put(22, FAB_AUDIBLE);
        ATTR_MAP.put(23, FAB_AUTOPREFIXER);
        ATTR_MAP.put(24, FAB_AVIANEX);
        ATTR_MAP.put(25, FAB_AVIATO);
        ATTR_MAP.put(26, FAB_AWS);
        ATTR_MAP.put(27, FAB_BANDCAMP);
        ATTR_MAP.put(28, FAB_BEHANCE);
        ATTR_MAP.put(29, FAB_BEHANCE_SQUARE);
        ATTR_MAP.put(30, FAB_BIMOBJECT);
        ATTR_MAP.put(31, FAB_BITBUCKET);
        ATTR_MAP.put(32, FAB_BITCOIN);
        ATTR_MAP.put(33, FAB_BITY);
        ATTR_MAP.put(34, FAB_BLACK_TIE);
        ATTR_MAP.put(35, FAB_BLACKBERRY);
        ATTR_MAP.put(36, FAB_BLOGGER);
        ATTR_MAP.put(37, FAB_BLOGGER_B);
        ATTR_MAP.put(38, FAB_BLUETOOTH);
        ATTR_MAP.put(39, FAB_BLUETOOTH_B);
        ATTR_MAP.put(40, FAB_BTC);
        ATTR_MAP.put(41, FAB_BUROMOBELEXPERTE);
        ATTR_MAP.put(42, FAB_CC_AMAZON_PAY);
        ATTR_MAP.put(43, FAB_CC_AMEX);
        ATTR_MAP.put(44, FAB_CC_APPLE_PAY);
        ATTR_MAP.put(45, FAB_CC_DINERS_CLUB);
        ATTR_MAP.put(46, FAB_CC_DISCOVER);
        ATTR_MAP.put(47, FAB_CC_JCB);
        ATTR_MAP.put(48, FAB_CC_MASTERCARD);
        ATTR_MAP.put(49, FAB_CC_PAYPAL);
        ATTR_MAP.put(50, FAB_CC_STRIPE);
        ATTR_MAP.put(51, FAB_CC_VISA);
        ATTR_MAP.put(52, FAB_CENTERCODE);
        ATTR_MAP.put(53, FAB_CHROME);
        ATTR_MAP.put(54, FAB_CLOUDSCALE);
        ATTR_MAP.put(55, FAB_CLOUDSMITH);
        ATTR_MAP.put(56, FAB_CLOUDVERSIFY);
        ATTR_MAP.put(57, FAB_CODEPEN);
        ATTR_MAP.put(58, FAB_CODIEPIE);
        ATTR_MAP.put(59, FAB_CONNECTDEVELOP);
        ATTR_MAP.put(60, FAB_CONTAO);
        ATTR_MAP.put(61, FAB_CPANEL);
        ATTR_MAP.put(62, FAB_CREATIVE_COMMONS);
        ATTR_MAP.put(63, FAB_CREATIVE_COMMONS_BY);
        ATTR_MAP.put(64, FAB_CREATIVE_COMMONS_NC);
        ATTR_MAP.put(65, FAB_CREATIVE_COMMONS_NC_EU);
        ATTR_MAP.put(66, FAB_CREATIVE_COMMONS_NC_JP);
        ATTR_MAP.put(67, FAB_CREATIVE_COMMONS_ND);
        ATTR_MAP.put(68, FAB_CREATIVE_COMMONS_PD);
        ATTR_MAP.put(69, FAB_CREATIVE_COMMONS_PD_ALT);
        ATTR_MAP.put(70, FAB_CREATIVE_COMMONS_REMIX);
        ATTR_MAP.put(71, FAB_CREATIVE_COMMONS_SA);
        ATTR_MAP.put(72, FAB_CREATIVE_COMMONS_SAMPLING);
        ATTR_MAP.put(73, FAB_CREATIVE_COMMONS_SAMPLING_PLUS);
        ATTR_MAP.put(74, FAB_CREATIVE_COMMONS_SHARE);
        ATTR_MAP.put(75, FAB_CREATIVE_COMMONS_ZERO);
        ATTR_MAP.put(76, FAB_CRITICAL_ROLE);
        ATTR_MAP.put(77, FAB_CSS3);
        ATTR_MAP.put(78, FAB_CSS3_ALT);
        ATTR_MAP.put(79, FAB_CUTTLEFISH);
        ATTR_MAP.put(80, FAB_D_AND_D);
        ATTR_MAP.put(81, FAB_D_AND_D_BEYOND);
        ATTR_MAP.put(82, FAB_DASHCUBE);
        ATTR_MAP.put(83, FAB_DELICIOUS);
        ATTR_MAP.put(84, FAB_DEPLOYDOG);
        ATTR_MAP.put(85, FAB_DESKPRO);
        ATTR_MAP.put(86, FAB_DEV);
        ATTR_MAP.put(87, FAB_DEVIANTART);
        ATTR_MAP.put(88, FAB_DIGG);
        ATTR_MAP.put(89, FAB_DIGITAL_OCEAN);
        ATTR_MAP.put(90, FAB_DISCORD);
        ATTR_MAP.put(91, FAB_DISCOURSE);
        ATTR_MAP.put(92, FAB_DOCHUB);
        ATTR_MAP.put(93, FAB_DOCKER);
        ATTR_MAP.put(94, FAB_DRAFT2DIGITAL);
        ATTR_MAP.put(95, FAB_DRIBBBLE);
        ATTR_MAP.put(96, FAB_DRIBBBLE_SQUARE);
        ATTR_MAP.put(97, FAB_DROPBOX);
        ATTR_MAP.put(98, FAB_DRUPAL);
        ATTR_MAP.put(99, FAB_DYALOG);
        ATTR_MAP.put(100, FAB_EARLYBIRDS);
        ATTR_MAP.put(101, FAB_EBAY);
        ATTR_MAP.put(102, FAB_EDGE);
        ATTR_MAP.put(103, FAB_ELEMENTOR);
        ATTR_MAP.put(104, FAB_ELLO);
        ATTR_MAP.put(105, FAB_EMBER);
        ATTR_MAP.put(106, FAB_EMPIRE);
        ATTR_MAP.put(107, FAB_ENVIRA);
        ATTR_MAP.put(108, FAB_ERLANG);
        ATTR_MAP.put(109, FAB_ETHEREUM);
        ATTR_MAP.put(110, FAB_ETSY);
        ATTR_MAP.put(111, FAB_EXPEDITEDSSL);
        ATTR_MAP.put(112, FAB_FACEBOOK);
        ATTR_MAP.put(113, FAB_FACEBOOK_F);
        ATTR_MAP.put(114, FAB_FACEBOOK_MESSENGER);
        ATTR_MAP.put(115, FAB_FACEBOOK_SQUARE);
        ATTR_MAP.put(116, FAB_FANTASY_FLIGHT_GAMES);
        ATTR_MAP.put(117, FAB_FIREFOX);
        ATTR_MAP.put(118, FAB_FIRST_ORDER);
        ATTR_MAP.put(119, FAB_FIRST_ORDER_ALT);
        ATTR_MAP.put(120, FAB_FIRSTDRAFT);
        ATTR_MAP.put(121, FAB_FLICKR);
        ATTR_MAP.put(122, FAB_FLIPBOARD);
        ATTR_MAP.put(123, FAB_FLY);
        ATTR_MAP.put(124, FAB_FONT_AWESOME);
        ATTR_MAP.put(125, FAB_FONT_AWESOME_ALT);
        ATTR_MAP.put(126, FAB_FONT_AWESOME_FLAG);
        ATTR_MAP.put(127, FAB_FONTICONS);
        ATTR_MAP.put(128, FAB_FONTICONS_FI);
        ATTR_MAP.put(129, FAB_FORT_AWESOME);
        ATTR_MAP.put(130, FAB_FORT_AWESOME_ALT);
        ATTR_MAP.put(131, FAB_FORUMBEE);
        ATTR_MAP.put(132, FAB_FOURSQUARE);
        ATTR_MAP.put(133, FAB_FREE_CODE_CAMP);
        ATTR_MAP.put(134, FAB_FREEBSD);
        ATTR_MAP.put(135, FAB_FULCRUM);
        ATTR_MAP.put(136, FAB_GALACTIC_REPUBLIC);
        ATTR_MAP.put(137, FAB_GALACTIC_SENATE);
        ATTR_MAP.put(138, FAB_GET_POCKET);
        ATTR_MAP.put(139, FAB_GG);
        ATTR_MAP.put(140, FAB_GG_CIRCLE);
        ATTR_MAP.put(141, FAB_GIT);
        ATTR_MAP.put(142, FAB_GIT_SQUARE);
        ATTR_MAP.put(143, FAB_GITHUB);
        ATTR_MAP.put(144, FAB_GITHUB_ALT);
        ATTR_MAP.put(145, FAB_GITHUB_SQUARE);
        ATTR_MAP.put(146, FAB_GITKRAKEN);
        ATTR_MAP.put(147, FAB_GITLAB);
        ATTR_MAP.put(148, FAB_GITTER);
        ATTR_MAP.put(149, FAB_GLIDE);
        ATTR_MAP.put(150, FAB_GLIDE_G);
        ATTR_MAP.put(151, FAB_GOFORE);
        ATTR_MAP.put(152, FAB_GOODREADS);
        ATTR_MAP.put(153, FAB_GOODREADS_G);
        ATTR_MAP.put(154, FAB_GOOGLE);
        ATTR_MAP.put(155, FAB_GOOGLE_DRIVE);
        ATTR_MAP.put(156, FAB_GOOGLE_PLAY);
        ATTR_MAP.put(157, FAB_GOOGLE_PLUS);
        ATTR_MAP.put(158, FAB_GOOGLE_PLUS_G);
        ATTR_MAP.put(159, FAB_GOOGLE_PLUS_SQUARE);
        ATTR_MAP.put(160, FAB_GOOGLE_WALLET);
        ATTR_MAP.put(161, FAB_GRATIPAY);
        ATTR_MAP.put(162, FAB_GRAV);
        ATTR_MAP.put(163, FAB_GRIPFIRE);
        ATTR_MAP.put(164, FAB_GRUNT);
        ATTR_MAP.put(165, FAB_GULP);
        ATTR_MAP.put(166, FAB_HACKER_NEWS);
        ATTR_MAP.put(167, FAB_HACKER_NEWS_SQUARE);
        ATTR_MAP.put(168, FAB_HACKERRANK);
        ATTR_MAP.put(169, FAB_HIPS);
        ATTR_MAP.put(170, FAB_HIRE_A_HELPER);
        ATTR_MAP.put(171, FAB_HOOLI);
        ATTR_MAP.put(172, FAB_HORNBILL);
        ATTR_MAP.put(173, FAB_HOTJAR);
        ATTR_MAP.put(174, FAB_HOUZZ);
        ATTR_MAP.put(175, FAB_HTML5);
        ATTR_MAP.put(176, FAB_HUBSPOT);
        ATTR_MAP.put(177, FAB_IMDB);
        ATTR_MAP.put(178, FAB_INSTAGRAM);
        ATTR_MAP.put(179, FAB_INTERNET_EXPLORER);
        ATTR_MAP.put(180, FAB_IOXHOST);
        ATTR_MAP.put(181, FAB_ITUNES);
        ATTR_MAP.put(182, FAB_ITUNES_NOTE);
        ATTR_MAP.put(183, FAB_JAVA);
        ATTR_MAP.put(184, FAB_JEDI_ORDER);
        ATTR_MAP.put(185, FAB_JENKINS);
        ATTR_MAP.put(186, FAB_JOGET);
        ATTR_MAP.put(187, FAB_JOOMLA);
        ATTR_MAP.put(188, FAB_JS);
        ATTR_MAP.put(189, FAB_JS_SQUARE);
        ATTR_MAP.put(190, FAB_JSFIDDLE);
        ATTR_MAP.put(191, FAB_KAGGLE);
        ATTR_MAP.put(192, FAB_KEYBASE);
        ATTR_MAP.put(193, FAB_KEYCDN);
        ATTR_MAP.put(194, FAB_KICKSTARTER);
        ATTR_MAP.put(195, FAB_KICKSTARTER_K);
        ATTR_MAP.put(196, FAB_KORVUE);
        ATTR_MAP.put(197, FAB_LARAVEL);
        ATTR_MAP.put(198, FAB_LASTFM);
        ATTR_MAP.put(199, FAB_LASTFM_SQUARE);
        ATTR_MAP.put(200, FAB_LEANPUB);
        ATTR_MAP.put(201, FAB_LESS);
        ATTR_MAP.put(202, FAB_LINE);
        ATTR_MAP.put(203, FAB_LINKEDIN);
        ATTR_MAP.put(204, FAB_LINKEDIN_IN);
        ATTR_MAP.put(205, FAB_LINODE);
        ATTR_MAP.put(206, FAB_LINUX);
        ATTR_MAP.put(207, FAB_LYFT);
        ATTR_MAP.put(208, FAB_MAGENTO);
        ATTR_MAP.put(209, FAB_MAILCHIMP);
        ATTR_MAP.put(210, FAB_MANDALORIAN);
        ATTR_MAP.put(211, FAB_MARKDOWN);
        ATTR_MAP.put(212, FAB_MASTODON);
        ATTR_MAP.put(213, FAB_MAXCDN);
        ATTR_MAP.put(214, FAB_MEDAPPS);
        ATTR_MAP.put(215, FAB_MEDIUM);
        ATTR_MAP.put(216, FAB_MEDIUM_M);
        ATTR_MAP.put(217, FAB_MEDRT);
        ATTR_MAP.put(218, FAB_MEETUP);
        ATTR_MAP.put(219, FAB_MEGAPORT);
        ATTR_MAP.put(220, FAB_MICROSOFT);
        ATTR_MAP.put(221, FAB_MIX);
        ATTR_MAP.put(222, FAB_MIXCLOUD);
        ATTR_MAP.put(223, FAB_MIZUNI);
        ATTR_MAP.put(224, FAB_MODX);
        ATTR_MAP.put(225, FAB_MONERO);
        ATTR_MAP.put(226, FAB_NAPSTER);
        ATTR_MAP.put(227, FAB_NEOS);
        ATTR_MAP.put(228, FAB_NIMBLR);
        ATTR_MAP.put(229, FAB_NINTENDO_SWITCH);
        ATTR_MAP.put(230, FAB_NODE);
        ATTR_MAP.put(231, FAB_NODE_JS);
        ATTR_MAP.put(232, FAB_NPM);
        ATTR_MAP.put(233, FAB_NS8);
        ATTR_MAP.put(234, FAB_NUTRITIONIX);
        ATTR_MAP.put(235, FAB_ODNOKLASSNIKI);
        ATTR_MAP.put(236, FAB_ODNOKLASSNIKI_SQUARE);
        ATTR_MAP.put(237, FAB_OLD_REPUBLIC);
        ATTR_MAP.put(238, FAB_OPENCART);
        ATTR_MAP.put(239, FAB_OPENID);
        ATTR_MAP.put(240, FAB_OPERA);
        ATTR_MAP.put(241, FAB_OPTIN_MONSTER);
        ATTR_MAP.put(242, FAB_OSI);
        ATTR_MAP.put(243, FAB_PAGE4);
        ATTR_MAP.put(244, FAB_PAGELINES);
        ATTR_MAP.put(245, FAB_PALFED);
        ATTR_MAP.put(246, FAB_PATREON);
        ATTR_MAP.put(247, FAB_PAYPAL);
        ATTR_MAP.put(248, FAB_PENNY_ARCADE);
        ATTR_MAP.put(249, FAB_PERISCOPE);
        ATTR_MAP.put(250, FAB_PHABRICATOR);
        ATTR_MAP.put(251, FAB_PHOENIX_FRAMEWORK);
        ATTR_MAP.put(252, FAB_PHOENIX_SQUADRON);
        ATTR_MAP.put(253, FAB_PHP);
        ATTR_MAP.put(254, FAB_PIED_PIPER);
        ATTR_MAP.put(255, FAB_PIED_PIPER_ALT);
        ATTR_MAP.put(256, FAB_PIED_PIPER_HAT);
        ATTR_MAP.put(257, FAB_PIED_PIPER_PP);
        ATTR_MAP.put(258, FAB_PINTEREST);
        ATTR_MAP.put(259, FAB_PINTEREST_P);
        ATTR_MAP.put(260, FAB_PINTEREST_SQUARE);
        ATTR_MAP.put(261, FAB_PLAYSTATION);
        ATTR_MAP.put(262, FAB_PRODUCT_HUNT);
        ATTR_MAP.put(263, FAB_PUSHED);
        ATTR_MAP.put(264, FAB_PYTHON);
        ATTR_MAP.put(265, FAB_QQ);
        ATTR_MAP.put(266, FAB_QUINSCAPE);
        ATTR_MAP.put(267, FAB_QUORA);
        ATTR_MAP.put(268, FAB_R_PROJECT);
        ATTR_MAP.put(269, FAB_RAVELRY);
        ATTR_MAP.put(270, FAB_REACT);
        ATTR_MAP.put(271, FAB_REACTEUROPE);
        ATTR_MAP.put(272, FAB_README);
        ATTR_MAP.put(273, FAB_REBEL);
        ATTR_MAP.put(274, FAB_RED_RIVER);
        ATTR_MAP.put(275, FAB_REDDIT);
        ATTR_MAP.put(276, FAB_REDDIT_ALIEN);
        ATTR_MAP.put(277, FAB_REDDIT_SQUARE);
        ATTR_MAP.put(278, FAB_RENREN);
        ATTR_MAP.put(279, FAB_REPLYD);
        ATTR_MAP.put(280, FAB_RESEARCHGATE);
        ATTR_MAP.put(281, FAB_RESOLVING);
        ATTR_MAP.put(282, FAB_REV);
        ATTR_MAP.put(283, FAB_ROCKETCHAT);
        ATTR_MAP.put(284, FAB_ROCKRMS);
        ATTR_MAP.put(285, FAB_SAFARI);
        ATTR_MAP.put(286, FAB_SASS);
        ATTR_MAP.put(287, FAB_SCHLIX);
        ATTR_MAP.put(288, FAB_SCRIBD);
        ATTR_MAP.put(289, FAB_SEARCHENGIN);
        ATTR_MAP.put(290, FAB_SELLCAST);
        ATTR_MAP.put(291, FAB_SELLSY);
        ATTR_MAP.put(292, FAB_SERVICESTACK);
        ATTR_MAP.put(293, FAB_SHIRTSINBULK);
        ATTR_MAP.put(294, FAB_SHOPWARE);
        ATTR_MAP.put(295, FAB_SIMPLYBUILT);
        ATTR_MAP.put(296, FAB_SISTRIX);
        ATTR_MAP.put(297, FAB_SITH);
        ATTR_MAP.put(298, FAB_SKYATLAS);
        ATTR_MAP.put(299, FAB_SKYPE);
        ATTR_MAP.put(300, FAB_SLACK);
        ATTR_MAP.put(301, FAB_SLACK_HASH);
        ATTR_MAP.put(302, FAB_SLIDESHARE);
        ATTR_MAP.put(303, FAB_SNAPCHAT);
        ATTR_MAP.put(304, FAB_SNAPCHAT_GHOST);
        ATTR_MAP.put(305, FAB_SNAPCHAT_SQUARE);
        ATTR_MAP.put(306, FAB_SOUNDCLOUD);
        ATTR_MAP.put(307, FAB_SPEAKAP);
        ATTR_MAP.put(308, FAB_SPOTIFY);
        ATTR_MAP.put(309, FAB_SQUARESPACE);
        ATTR_MAP.put(310, FAB_STACK_EXCHANGE);
        ATTR_MAP.put(311, FAB_STACK_OVERFLOW);
        ATTR_MAP.put(312, FAB_STAYLINKED);
        ATTR_MAP.put(313, FAB_STEAM);
        ATTR_MAP.put(314, FAB_STEAM_SQUARE);
        ATTR_MAP.put(315, FAB_STEAM_SYMBOL);
        ATTR_MAP.put(316, FAB_STICKER_MULE);
        ATTR_MAP.put(317, FAB_STRAVA);
        ATTR_MAP.put(318, FAB_STRIPE);
        ATTR_MAP.put(319, FAB_STRIPE_S);
        ATTR_MAP.put(320, FAB_STUDIOVINARI);
        ATTR_MAP.put(321, FAB_STUMBLEUPON);
        ATTR_MAP.put(322, FAB_STUMBLEUPON_CIRCLE);
        ATTR_MAP.put(323, FAB_SUPERPOWERS);
        ATTR_MAP.put(324, FAB_SUPPLE);
        ATTR_MAP.put(325, FAB_TEAMSPEAK);
        ATTR_MAP.put(326, FAB_TELEGRAM);
        ATTR_MAP.put(327, FAB_TELEGRAM_PLANE);
        ATTR_MAP.put(328, FAB_TENCENT_WEIBO);
        ATTR_MAP.put(329, FAB_THE_RED_YETI);
        ATTR_MAP.put(330, FAB_THEMECO);
        ATTR_MAP.put(331, FAB_THEMEISLE);
        ATTR_MAP.put(332, FAB_THINK_PEAKS);
        ATTR_MAP.put(333, FAB_TRADE_FEDERATION);
        ATTR_MAP.put(334, FAB_TRELLO);
        ATTR_MAP.put(335, FAB_TRIPADVISOR);
        ATTR_MAP.put(336, FAB_TUMBLR);
        ATTR_MAP.put(337, FAB_TUMBLR_SQUARE);
        ATTR_MAP.put(338, FAB_TWITCH);
        ATTR_MAP.put(339, FAB_TWITTER);
        ATTR_MAP.put(340, FAB_TWITTER_SQUARE);
        ATTR_MAP.put(341, FAB_TYPO3);
        ATTR_MAP.put(342, FAB_UBER);
        ATTR_MAP.put(343, FAB_UIKIT);
        ATTR_MAP.put(344, FAB_UNIREGISTRY);
        ATTR_MAP.put(345, FAB_UNTAPPD);
        ATTR_MAP.put(346, FAB_USB);
        ATTR_MAP.put(347, FAB_USSUNNAH);
        ATTR_MAP.put(348, FAB_VAADIN);
        ATTR_MAP.put(349, FAB_VIACOIN);
        ATTR_MAP.put(350, FAB_VIADEO);
        ATTR_MAP.put(351, FAB_VIADEO_SQUARE);
        ATTR_MAP.put(352, FAB_VIBER);
        ATTR_MAP.put(353, FAB_VIMEO);
        ATTR_MAP.put(354, FAB_VIMEO_SQUARE);
        ATTR_MAP.put(355, FAB_VIMEO_V);
        ATTR_MAP.put(356, FAB_VINE);
        ATTR_MAP.put(357, FAB_VK);
        ATTR_MAP.put(358, FAB_VNV);
        ATTR_MAP.put(359, FAB_VUEJS);
        ATTR_MAP.put(360, FAB_WEEBLY);
        ATTR_MAP.put(361, FAB_WEIBO);
        ATTR_MAP.put(362, FAB_WEIXIN);
        ATTR_MAP.put(363, FAB_WHATSAPP);
        ATTR_MAP.put(364, FAB_WHATSAPP_SQUARE);
        ATTR_MAP.put(365, FAB_WHMCS);
        ATTR_MAP.put(366, FAB_WIKIPEDIA_W);
        ATTR_MAP.put(367, FAB_WINDOWS);
        ATTR_MAP.put(368, FAB_WIX);
        ATTR_MAP.put(369, FAB_WIZARDS_OF_THE_COAST);
        ATTR_MAP.put(370, FAB_WOLF_PACK_BATTALION);
        ATTR_MAP.put(371, FAB_WORDPRESS);
        ATTR_MAP.put(372, FAB_WORDPRESS_SIMPLE);
        ATTR_MAP.put(373, FAB_WPBEGINNER);
        ATTR_MAP.put(374, FAB_WPEXPLORER);
        ATTR_MAP.put(375, FAB_WPFORMS);
        ATTR_MAP.put(376, FAB_WPRESSR);
        ATTR_MAP.put(377, FAB_XBOX);
        ATTR_MAP.put(378, FAB_XING);
        ATTR_MAP.put(379, FAB_XING_SQUARE);
        ATTR_MAP.put(380, FAB_Y_COMBINATOR);
        ATTR_MAP.put(381, FAB_YAHOO);
        ATTR_MAP.put(382, FAB_YANDEX);
        ATTR_MAP.put(383, FAB_YANDEX_INTERNATIONAL);
        ATTR_MAP.put(384, FAB_YELP);
        ATTR_MAP.put(385, FAB_YOAST);
        ATTR_MAP.put(386, FAB_YOUTUBE);
        ATTR_MAP.put(387, FAB_YOUTUBE_SQUARE);
        ATTR_MAP.put(388, FAB_ZHIHU);


    }

}
