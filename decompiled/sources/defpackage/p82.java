package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: p82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p82 {
    public static final String[] A = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] B = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] C = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final m82 D = new m82(273, 3, "StripOffsets");
    public static final m82[][] E;
    public static final m82[] F;
    public static final HashMap[] G = new HashMap[10];
    public static final HashMap[] H = new HashMap[10];
    public static final HashSet I = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap J = new HashMap();
    public static final Charset K;
    public static final byte[] L;
    public static final byte[] M;
    public static final boolean k = Log.isLoggable("ExifInterface", 3);
    public static final int[] l = {8, 8, 8};
    public static final int[] m = {8};
    public static final byte[] n = {-1, -40, -1};
    public static final byte[] o = {102, 116, 121, 112};
    public static final byte[] p = {109, 105, 102, 49};
    public static final byte[] q = {104, 101, 105, 99};
    public static final byte[] r = {79, 76, 89, 77, 80, 0};
    public static final byte[] s = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] t = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] u = {101, 88, 73, 102};
    public static final byte[] v = {73, 72, 68, 82};
    public static final byte[] w = {73, 69, 78, 68};
    public static final byte[] x = {82, 73, 70, 70};
    public static final byte[] y = {87, 69, 66, 80};
    public static final byte[] z = {69, 88, 73, 70};
    public final FileDescriptor a;
    public int b;
    public final HashMap[] c;
    public final HashSet d;
    public ByteOrder e = ByteOrder.BIG_ENDIAN;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        m82[] m82Arr = {new m82(254, 4, "NewSubfileType"), new m82(255, 4, "SubfileType"), new m82(256, 3, 4, "ImageWidth"), new m82(257, 3, 4, "ImageLength"), new m82(258, 3, "BitsPerSample"), new m82(259, 3, "Compression"), new m82(262, 3, "PhotometricInterpretation"), new m82(270, 2, "ImageDescription"), new m82(271, 2, "Make"), new m82(272, 2, "Model"), new m82(273, 3, 4, "StripOffsets"), new m82(274, 3, "Orientation"), new m82(277, 3, "SamplesPerPixel"), new m82(278, 3, 4, "RowsPerStrip"), new m82(279, 3, 4, "StripByteCounts"), new m82(282, 5, "XResolution"), new m82(283, 5, "YResolution"), new m82(284, 3, "PlanarConfiguration"), new m82(296, 3, "ResolutionUnit"), new m82(301, 3, "TransferFunction"), new m82(305, 2, "Software"), new m82(306, 2, "DateTime"), new m82(315, 2, "Artist"), new m82(318, 5, "WhitePoint"), new m82(319, 5, "PrimaryChromaticities"), new m82(330, 4, "SubIFDPointer"), new m82(513, 4, "JPEGInterchangeFormat"), new m82(514, 4, "JPEGInterchangeFormatLength"), new m82(529, 5, "YCbCrCoefficients"), new m82(530, 3, "YCbCrSubSampling"), new m82(531, 3, "YCbCrPositioning"), new m82(532, 5, "ReferenceBlackWhite"), new m82(33432, 2, "Copyright"), new m82(34665, 4, "ExifIFDPointer"), new m82(34853, 4, "GPSInfoIFDPointer"), new m82(4, 4, "SensorTopBorder"), new m82(5, 4, "SensorLeftBorder"), new m82(6, 4, "SensorBottomBorder"), new m82(7, 4, "SensorRightBorder"), new m82(23, 3, "ISO"), new m82(46, 7, "JpgFromRaw"), new m82(700, 1, "Xmp")};
        m82 m82 = new m82(40963, 3, 4, "PixelYDimension");
        m82 m822 = new m82(40964, 2, "RelatedSoundFile");
        m82 m823 = new m82(40965, 4, "InteroperabilityIFDPointer");
        m82 m824 = new m82(41484, 7, "SpatialFrequencyResponse");
        m82 m825 = new m82(0, 1, "GPSVersionID");
        m82 m826 = new m82(2, 5, 10, "GPSLatitude");
        m82 m827 = new m82(4, 5, 10, "GPSLongitude");
        m82 m828 = new m82(5, 1, "GPSAltitudeRef");
        m82 m829 = new m82(6, 5, "GPSAltitude");
        m82 m8210 = new m82(9, 2, "GPSStatus");
        m82[] m82Arr2 = {new m82(1, 2, "InteroperabilityIndex")};
        m82 m8211 = new m82(254, 4, "NewSubfileType");
        m82 m8212 = new m82(255, 4, "SubfileType");
        m82 m8213 = new m82(256, 3, 4, "ThumbnailImageWidth");
        m82 m8214 = m8211;
        m82 m8215 = new m82(257, 3, 4, "ThumbnailImageLength");
        m82 m8216 = new m82(258, 3, "BitsPerSample");
        m82 m8217 = new m82(259, 3, "Compression");
        m82 m8218 = new m82(262, 3, "PhotometricInterpretation");
        m82 m8219 = new m82(270, 2, "ImageDescription");
        m82 m8220 = new m82(271, 2, "Make");
        m82 m8221 = new m82(272, 2, "Model");
        m82 m8222 = new m82(273, 3, 4, "StripOffsets");
        m82 m8223 = new m82(274, 3, "ThumbnailOrientation");
        String str = "GPSInfoIFDPointer";
        m82 m8224 = m8215;
        m82 m8225 = m8217;
        m82 m8226 = m8219;
        m82 m8227 = m8223;
        m82 m8228 = m8221;
        m82[] m82Arr3 = m82Arr;
        E = new m82[][]{m82Arr, new m82[]{new m82(33434, 5, "ExposureTime"), new m82(33437, 5, "FNumber"), new m82(34850, 3, "ExposureProgram"), new m82(34852, 2, "SpectralSensitivity"), new m82(34855, 3, "PhotographicSensitivity"), new m82(34856, 7, "OECF"), new m82(34864, 3, "SensitivityType"), new m82(34865, 4, "StandardOutputSensitivity"), new m82(34866, 4, "RecommendedExposureIndex"), new m82(34867, 4, "ISOSpeed"), new m82(34868, 4, "ISOSpeedLatitudeyyy"), new m82(34869, 4, "ISOSpeedLatitudezzz"), new m82(36864, 2, "ExifVersion"), new m82(36867, 2, "DateTimeOriginal"), new m82(36868, 2, "DateTimeDigitized"), new m82(36880, 2, "OffsetTime"), new m82(36881, 2, "OffsetTimeOriginal"), new m82(36882, 2, "OffsetTimeDigitized"), new m82(37121, 7, "ComponentsConfiguration"), new m82(37122, 5, "CompressedBitsPerPixel"), new m82(37377, 10, "ShutterSpeedValue"), new m82(37378, 5, "ApertureValue"), new m82(37379, 10, "BrightnessValue"), new m82(37380, 10, "ExposureBiasValue"), new m82(37381, 5, "MaxApertureValue"), new m82(37382, 5, "SubjectDistance"), new m82(37383, 3, "MeteringMode"), new m82(37384, 3, "LightSource"), new m82(37385, 3, "Flash"), new m82(37386, 5, "FocalLength"), new m82(37396, 3, "SubjectArea"), new m82(37500, 7, "MakerNote"), new m82(37510, 7, "UserComment"), new m82(37520, 2, "SubSecTime"), new m82(37521, 2, "SubSecTimeOriginal"), new m82(37522, 2, "SubSecTimeDigitized"), new m82(40960, 7, "FlashpixVersion"), new m82(40961, 3, "ColorSpace"), new m82(40962, 3, 4, "PixelXDimension"), m82, m822, m823, new m82(41483, 5, "FlashEnergy"), m824, new m82(41486, 5, "FocalPlaneXResolution"), new m82(41487, 5, "FocalPlaneYResolution"), new m82(41488, 3, "FocalPlaneResolutionUnit"), new m82(41492, 3, "SubjectLocation"), new m82(41493, 5, "ExposureIndex"), new m82(41495, 3, "SensingMethod"), new m82(41728, 7, "FileSource"), new m82(41729, 7, "SceneType"), new m82(41730, 7, "CFAPattern"), new m82(41985, 3, "CustomRendered"), new m82(41986, 3, "ExposureMode"), new m82(41987, 3, "WhiteBalance"), new m82(41988, 5, "DigitalZoomRatio"), new m82(41989, 3, "FocalLengthIn35mmFilm"), new m82(41990, 3, "SceneCaptureType"), new m82(41991, 3, "GainControl"), new m82(41992, 3, "Contrast"), new m82(41993, 3, "Saturation"), new m82(41994, 3, "Sharpness"), new m82(41995, 7, "DeviceSettingDescription"), new m82(41996, 3, "SubjectDistanceRange"), new m82(42016, 2, "ImageUniqueID"), new m82(42032, 2, "CameraOwnerName"), new m82(42033, 2, "BodySerialNumber"), new m82(42034, 5, "LensSpecification"), new m82(42035, 2, "LensMake"), new m82(42036, 2, "LensModel"), new m82(42240, 5, "Gamma"), new m82(50706, 1, "DNGVersion"), new m82(50720, 3, 4, "DefaultCropSize")}, new m82[]{m825, new m82(1, 2, "GPSLatitudeRef"), m826, new m82(3, 2, "GPSLongitudeRef"), m827, m828, m829, new m82(7, 5, "GPSTimeStamp"), new m82(8, 2, "GPSSatellites"), m8210, new m82(10, 2, "GPSMeasureMode"), new m82(11, 5, "GPSDOP"), new m82(12, 2, "GPSSpeedRef"), new m82(13, 5, "GPSSpeed"), new m82(14, 2, "GPSTrackRef"), new m82(15, 5, "GPSTrack"), new m82(16, 2, "GPSImgDirectionRef"), new m82(17, 5, "GPSImgDirection"), new m82(18, 2, "GPSMapDatum"), new m82(19, 2, "GPSDestLatitudeRef"), new m82(20, 5, "GPSDestLatitude"), new m82(21, 2, "GPSDestLongitudeRef"), new m82(22, 5, "GPSDestLongitude"), new m82(23, 2, "GPSDestBearingRef"), new m82(24, 5, "GPSDestBearing"), new m82(25, 2, "GPSDestDistanceRef"), new m82(26, 5, "GPSDestDistance"), new m82(27, 7, "GPSProcessingMethod"), new m82(28, 7, "GPSAreaInformation"), new m82(29, 2, "GPSDateStamp"), new m82(30, 3, "GPSDifferential"), new m82(31, 5, "GPSHPositioningError")}, m82Arr2, new m82[]{m8214, m8212, m8213, m8224, m8216, m8225, m8218, m8226, m8220, m8228, m8222, m8227, new m82(277, 3, "SamplesPerPixel"), new m82(278, 3, 4, "RowsPerStrip"), new m82(279, 3, 4, "StripByteCounts"), new m82(282, 5, "XResolution"), new m82(283, 5, "YResolution"), new m82(284, 3, "PlanarConfiguration"), new m82(296, 3, "ResolutionUnit"), new m82(301, 3, "TransferFunction"), new m82(305, 2, "Software"), new m82(306, 2, "DateTime"), new m82(315, 2, "Artist"), new m82(318, 5, "WhitePoint"), new m82(319, 5, "PrimaryChromaticities"), new m82(330, 4, "SubIFDPointer"), new m82(513, 4, "JPEGInterchangeFormat"), new m82(514, 4, "JPEGInterchangeFormatLength"), new m82(529, 5, "YCbCrCoefficients"), new m82(530, 3, "YCbCrSubSampling"), new m82(531, 3, "YCbCrPositioning"), new m82(532, 5, "ReferenceBlackWhite"), new m82(33432, 2, "Copyright"), new m82(34665, 4, "ExifIFDPointer"), new m82(34853, 4, str), new m82(50706, 1, "DNGVersion"), new m82(50720, 3, 4, "DefaultCropSize")}, m82Arr3, new m82[]{new m82(256, 7, "ThumbnailImage"), new m82(8224, 4, "CameraSettingsIFDPointer"), new m82(8256, 4, "ImageProcessingIFDPointer")}, new m82[]{new m82(257, 4, "PreviewImageStart"), new m82(258, 4, "PreviewImageLength")}, new m82[]{new m82(4371, 3, "AspectFrame")}, new m82[]{new m82(55, 3, "ColorSpace")}};
        F = new m82[]{new m82(330, 4, "SubIFDPointer"), new m82(34665, 4, "ExifIFDPointer"), new m82(34853, 4, str), new m82(40965, 4, "InteroperabilityIFDPointer"), new m82(8224, 1, "CameraSettingsIFDPointer"), new m82(8256, 1, "ImageProcessingIFDPointer")};
        Charset forName = Charset.forName("US-ASCII");
        K = forName;
        L = "Exif\u0000\u0000".getBytes(forName);
        M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            m82[][] m82Arr4 = E;
            if (i2 < m82Arr4.length) {
                G[i2] = new HashMap();
                H[i2] = new HashMap();
                for (m82 m8229 : m82Arr4[i2]) {
                    G[i2].put(Integer.valueOf(m8229.a), m8229);
                    H[i2].put(m8229.b, m8229);
                }
                i2++;
            } else {
                HashMap hashMap = J;
                m82[] m82Arr5 = F;
                hashMap.put(Integer.valueOf(m82Arr5[0].a), 5);
                hashMap.put(Integer.valueOf(m82Arr5[1].a), 1);
                hashMap.put(Integer.valueOf(m82Arr5[2].a), 2);
                hashMap.put(Integer.valueOf(m82Arr5[3].a), 3);
                hashMap.put(Integer.valueOf(m82Arr5[4].a), 7);
                hashMap.put(Integer.valueOf(m82Arr5[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    public p82(q82 q82) {
        m82[][] m82Arr = E;
        this.c = new HashMap[m82Arr.length];
        this.d = new HashSet(m82Arr.length);
        boolean z2 = k;
        this.a = null;
        int i2 = 0;
        while (i2 < m82Arr.length) {
            try {
                this.c[i2] = new HashMap();
                i2++;
            } catch (IOException e2) {
                e = e2;
                if (z2) {
                    try {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    } catch (Throwable th) {
                        a();
                        if (z2) {
                            p();
                        }
                        throw th;
                    }
                }
                a();
                if (!z2) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e3) {
                e = e3;
                if (z2) {
                }
                a();
                if (!z2) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(q82, 5000);
        int f2 = f(bufferedInputStream);
        this.b = f2;
        if (!(f2 == 4 || f2 == 9 || f2 == 13)) {
            if (f2 != 14) {
                o82 o82 = new o82((InputStream) bufferedInputStream);
                int i3 = this.b;
                if (i3 == 12) {
                    d(o82);
                } else if (i3 == 7) {
                    g(o82);
                } else if (i3 == 10) {
                    k(o82);
                } else {
                    j(o82);
                }
                o82.k((long) this.g);
                u(o82);
                a();
                if (!z2) {
                    return;
                }
                p();
            }
        }
        k82 k82 = new k82((InputStream) bufferedInputStream);
        int i4 = this.b;
        if (i4 == 4) {
            e(k82, 0, 0);
        } else if (i4 == 13) {
            h(k82);
        } else if (i4 == 9) {
            i(k82);
        } else if (i4 == 14) {
            l(k82);
        }
        a();
        if (!z2) {
        }
        p();
    }

    public static ByteOrder q(k82 k82) {
        short readShort = k82.readShort();
        boolean z2 = k;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            rf2.s("Invalid byte order: ", Integer.toHexString(readShort));
            return null;
        }
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.c;
        if (b2 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b2.concat("\u0000").getBytes(K);
            hashMap.put("DateTime", new l82(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", l82.a(0, this.e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", l82.a(0, this.e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", l82.a(0, this.e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", l82.a(0, this.e));
        }
    }

    public final String b(String str) {
        l82 c2 = c(str);
        if (c2 != null) {
            int i2 = c2.a;
            if (!I.contains(str)) {
                return c2.f(this.e);
            }
            if (!str.equals("GPSTimeStamp")) {
                try {
                    return Double.toString(c2.d(this.e));
                } catch (NumberFormatException unused) {
                }
            } else if (i2 == 5 || i2 == 10) {
                n82[] n82Arr = (n82[]) c2.g(this.e);
                if (n82Arr == null || n82Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(n82Arr));
                    return null;
                }
                n82 n82 = n82Arr[0];
                Integer valueOf = Integer.valueOf((int) (((float) n82.a) / ((float) n82.b)));
                n82 n822 = n82Arr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) n822.a) / ((float) n822.b)));
                n82 n823 = n82Arr[2];
                return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) n823.a) / ((float) n823.b)))});
            } else {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                return null;
            }
        }
        return null;
    }

    public final l82 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (k) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < E.length; i2++) {
            l82 l82 = (l82) this.c[i2].get(str);
            if (l82 != null) {
                return l82;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:48|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x011e */
    public final void d(o82 o82) {
        String str;
        String str2;
        String str3;
        int i2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            s82.a(mediaMetadataRetriever, new j82(o82));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            HashMap[] hashMapArr = this.c;
            if (str3 != null) {
                hashMapArr[0].put("ImageWidth", l82.c(Integer.parseInt(str3), this.e));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", l82.c(Integer.parseInt(str2), this.e));
            }
            if (str != null) {
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i2 = 6;
                } else if (parseInt == 180) {
                    i2 = 3;
                } else if (parseInt != 270) {
                    i2 = 1;
                } else {
                    i2 = 8;
                }
                hashMapArr[0].put("Orientation", l82.c(i2, this.e));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    o82.k((long) parseInt2);
                    byte[] bArr = new byte[6];
                    o82.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (Arrays.equals(bArr, L)) {
                        byte[] bArr2 = new byte[i4];
                        o82.readFully(bArr2);
                        this.g = i3;
                        r(0, bArr2);
                    } else {
                        throw new IOException("Invalid identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (k) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
            mediaMetadataRetriever.release();
            return;
        }
        kj6.n("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    public final void e(k82 k82, int i2, int i3) {
        String str;
        String str2;
        k82 k822 = k82;
        int i4 = i3;
        boolean z2 = k;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + k822);
        }
        k822.y = ByteOrder.BIG_ENDIAN;
        byte readByte = k822.readByte();
        byte b2 = -1;
        if (readByte != -1) {
            rf2.s("Invalid marker: ", Integer.toHexString(readByte & 255));
        } else if (k822.readByte() == -40) {
            int i5 = 2;
            int i6 = 2;
            while (true) {
                byte readByte2 = k822.readByte();
                if (readByte2 == b2) {
                    byte readByte3 = k822.readByte();
                    if (z2) {
                        Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                    }
                    if (readByte3 == -39 || readByte3 == -38) {
                        k822.y = this.e;
                    } else {
                        int readUnsignedShort = k822.readUnsignedShort();
                        int i7 = readUnsignedShort - 2;
                        int i8 = i6 + 4;
                        if (z2) {
                            Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                        }
                        if (i7 >= 0) {
                            int i9 = 0;
                            HashMap[] hashMapArr = this.c;
                            if (readByte3 == -31) {
                                byte[] bArr = new byte[i7];
                                k822.readFully(bArr);
                                int i10 = i8 + i7;
                                byte[] bArr2 = L;
                                if (bArr2 != null && i7 >= bArr2.length) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= bArr2.length) {
                                            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i7);
                                            this.g = i2 + i8 + bArr2.length;
                                            r(i4, copyOfRange);
                                            u(new k82(copyOfRange));
                                        } else if (bArr[i11] == bArr2[i11]) {
                                            i11++;
                                            i9 = 0;
                                        }
                                    }
                                    i8 = i10;
                                    i7 = 0;
                                }
                                byte[] bArr3 = M;
                                if (bArr3 != null && i7 >= bArr3.length) {
                                    int i12 = i9;
                                    while (true) {
                                        if (i12 >= bArr3.length) {
                                            int length = i8 + bArr3.length;
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i7);
                                            if (b("Xmp") == null) {
                                                hashMapArr[i9].put("Xmp", new l82((long) length, copyOfRange2, 1, copyOfRange2.length));
                                            }
                                        } else if (bArr[i12] == bArr3[i12]) {
                                            i12++;
                                        }
                                    }
                                }
                                i8 = i10;
                                i7 = 0;
                            } else if (readByte3 != -2) {
                                switch (readByte3) {
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61:
                                        k822.a(1);
                                        HashMap hashMap = hashMapArr[i4];
                                        if (i4 == 4) {
                                        }
                                        hashMap.put(str, l82.a((long) k822.readUnsignedShort(), this.e));
                                        HashMap hashMap2 = hashMapArr[i4];
                                        if (i4 == 4) {
                                        }
                                        hashMap2.put(str2, l82.a((long) k822.readUnsignedShort(), this.e));
                                        i7 = readUnsignedShort - 7;
                                        break;
                                    default:
                                        switch (readByte3) {
                                            case -59:
                                            case -58:
                                            case -57:
                                                break;
                                            default:
                                                switch (readByte3) {
                                                    case -55:
                                                    case -54:
                                                    case -53:
                                                        break;
                                                    default:
                                                        switch (readByte3) {
                                                            case -51:
                                                            case -50:
                                                            case -49:
                                                                break;
                                                        }
                                                }
                                        }
                                        k822.a(1);
                                        HashMap hashMap3 = hashMapArr[i4];
                                        if (i4 == 4) {
                                            str = "ImageLength";
                                        } else {
                                            str = "ThumbnailImageLength";
                                        }
                                        hashMap3.put(str, l82.a((long) k822.readUnsignedShort(), this.e));
                                        HashMap hashMap22 = hashMapArr[i4];
                                        if (i4 == 4) {
                                            str2 = "ImageWidth";
                                        } else {
                                            str2 = "ThumbnailImageWidth";
                                        }
                                        hashMap22.put(str2, l82.a((long) k822.readUnsignedShort(), this.e));
                                        i7 = readUnsignedShort - 7;
                                        break;
                                }
                            } else {
                                byte[] bArr4 = new byte[i7];
                                k822.readFully(bArr4);
                                if (b("UserComment") == null) {
                                    HashMap hashMap4 = hashMapArr[1];
                                    Charset charset = K;
                                    byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                                    hashMap4.put("UserComment", new l82(bytes, i5, bytes.length));
                                }
                                i7 = 0;
                            }
                            if (i7 >= 0) {
                                k822.a(i7);
                                i6 = i8 + i7;
                                i5 = 2;
                                b2 = -1;
                            } else {
                                rf2.i("Invalid length");
                                return;
                            }
                        } else {
                            rf2.i("Invalid length");
                            return;
                        }
                    }
                } else {
                    rf2.s("Invalid marker:", Integer.toHexString(readByte2 & 255));
                    return;
                }
            }
            k822.y = this.e;
        } else {
            rf2.s("Invalid marker: ", Integer.toHexString(readByte & 255));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cf, code lost:
        if (r7 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x013d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c8 A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010c A[SYNTHETIC, Splitter:B:93:0x010c] */
    public final int f(BufferedInputStream bufferedInputStream) {
        int i2;
        int i3;
        k82 k82;
        short readShort;
        k82 k822;
        long j2;
        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
        bufferedInputStream2.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream2.read(bArr);
        bufferedInputStream2.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr2 = n;
            if (i4 >= bArr2.length) {
                return 4;
            }
            if (bArr[i4] != bArr2[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                int i5 = 0;
                while (i5 < bytes.length) {
                    if (bArr[i5] != bytes[i5]) {
                        k82 k823 = null;
                        int i6 = 1;
                        try {
                            k822 = new k82(bArr);
                            try {
                                long readInt = (long) k822.readInt();
                                byte[] bArr3 = new byte[4];
                                k822.readFully(bArr3);
                                if (Arrays.equals(bArr3, o)) {
                                    if (readInt == 1) {
                                        readInt = k822.readLong();
                                        j2 = 16;
                                        if (readInt < 16) {
                                        }
                                    } else {
                                        j2 = 8;
                                    }
                                    if (readInt > 5000) {
                                        readInt = 5000;
                                    }
                                    long j3 = readInt - j2;
                                    if (j3 >= 8) {
                                        byte[] bArr4 = new byte[4];
                                        long j4 = 0;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        while (j4 < j3 / 4) {
                                            try {
                                                k822.readFully(bArr4);
                                                if (j4 != 1) {
                                                    i2 = 0;
                                                    try {
                                                        if (Arrays.equals(bArr4, p)) {
                                                            z2 = true;
                                                        } else if (Arrays.equals(bArr4, q)) {
                                                            z3 = true;
                                                        }
                                                        if (z2 && z3) {
                                                            k822.close();
                                                            return 12;
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        try {
                                                            if (k) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            k823 = k822;
                                                            if (k823 != null) {
                                                                k823.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                j4++;
                                            } catch (EOFException unused) {
                                            }
                                        }
                                        i2 = 0;
                                        k822.close();
                                        k82 = new k82(bArr);
                                        try {
                                            ByteOrder q2 = q(k82);
                                            this.e = q2;
                                            k82.y = q2;
                                            readShort = k82.readShort();
                                            if (readShort == 20306 || readShort == 21330) {
                                                i3 = 1;
                                            } else {
                                                i3 = i2;
                                            }
                                            k82.close();
                                        } catch (Exception unused2) {
                                            if (k82 != null) {
                                            }
                                            i3 = i2;
                                            if (i3 == 0) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            k823 = k82;
                                            if (k823 != null) {
                                            }
                                            throw th;
                                        }
                                        if (i3 == 0) {
                                            return 7;
                                        }
                                        try {
                                            k82 k824 = new k82(bArr);
                                            try {
                                                ByteOrder q3 = q(k824);
                                                this.e = q3;
                                                k824.y = q3;
                                                if (k824.readShort() != 85) {
                                                    i6 = i2;
                                                }
                                                k824.close();
                                            } catch (Exception unused3) {
                                                k823 = k824;
                                                if (k823 != null) {
                                                }
                                                i6 = i2;
                                                if (i6 != 0) {
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                k823 = k824;
                                                if (k823 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Exception unused4) {
                                            if (k823 != null) {
                                                k823.close();
                                            }
                                            i6 = i2;
                                            if (i6 != 0) {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (k823 != null) {
                                                k823.close();
                                            }
                                            throw th;
                                        }
                                        if (i6 != 0) {
                                            return 10;
                                        }
                                        int i7 = i2;
                                        while (true) {
                                            byte[] bArr5 = t;
                                            if (i7 >= bArr5.length) {
                                                return 13;
                                            }
                                            if (bArr[i7] != bArr5[i7]) {
                                                int i8 = i2;
                                                while (true) {
                                                    byte[] bArr6 = x;
                                                    if (i8 >= bArr6.length) {
                                                        int i9 = i2;
                                                        while (true) {
                                                            byte[] bArr7 = y;
                                                            if (i9 >= bArr7.length) {
                                                                return 14;
                                                            }
                                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                                break;
                                                            }
                                                            i9++;
                                                        }
                                                    } else if (bArr[i8] != bArr6[i8]) {
                                                        break;
                                                    } else {
                                                        i8++;
                                                    }
                                                }
                                                return i2;
                                            }
                                            i7++;
                                        }
                                    }
                                }
                                k822.close();
                                i2 = 0;
                            } catch (Exception e3) {
                                e = e3;
                                i2 = 0;
                                if (k) {
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i2 = 0;
                            k822 = null;
                            if (k) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            if (k823 != null) {
                            }
                            throw th;
                        }
                        try {
                            k82 = new k82(bArr);
                            ByteOrder q22 = q(k82);
                            this.e = q22;
                            k82.y = q22;
                            readShort = k82.readShort();
                            if (readShort == 20306 || readShort == 21330) {
                            }
                            k82.close();
                        } catch (Exception unused5) {
                            k82 = null;
                            if (k82 != null) {
                                k82.close();
                            }
                            i3 = i2;
                            if (i3 == 0) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            if (k823 != null) {
                                k823.close();
                            }
                            throw th;
                        }
                        if (i3 == 0) {
                        }
                    } else {
                        i5++;
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void g(o82 o82) {
        int i2;
        int i3;
        j(o82);
        HashMap[] hashMapArr = this.c;
        l82 l82 = (l82) hashMapArr[1].get("MakerNote");
        if (l82 != null) {
            o82 o822 = new o82(l82.d);
            o822.y = this.e;
            byte[] bArr = r;
            byte[] bArr2 = new byte[bArr.length];
            o822.readFully(bArr2);
            o822.k(0);
            byte[] bArr3 = s;
            byte[] bArr4 = new byte[bArr3.length];
            o822.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                o822.k(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                o822.k(12);
            }
            s(o822, 6);
            l82 l822 = (l82) hashMapArr[7].get("PreviewImageStart");
            l82 l823 = (l82) hashMapArr[7].get("PreviewImageLength");
            if (!(l822 == null || l823 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", l822);
                hashMapArr[5].put("JPEGInterchangeFormatLength", l823);
            }
            l82 l824 = (l82) hashMapArr[8].get("AspectFrame");
            if (l824 != null) {
                int[] iArr = (int[]) l824.g(this.e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    l82 c2 = l82.c(i6, this.e);
                    l82 c3 = l82.c(i7, this.e);
                    hashMapArr[0].put("ImageWidth", c2);
                    hashMapArr[0].put("ImageLength", c3);
                }
            }
        }
    }

    public final void h(k82 k82) {
        if (k) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + k82);
        }
        k82.y = ByteOrder.BIG_ENDIAN;
        byte[] bArr = t;
        k82.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = k82.readInt();
                byte[] bArr2 = new byte[4];
                k82.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16) {
                    if (!Arrays.equals(bArr2, v)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                }
                if (!Arrays.equals(bArr2, w)) {
                    if (Arrays.equals(bArr2, u)) {
                        byte[] bArr3 = new byte[readInt];
                        k82.readFully(bArr3);
                        int readInt2 = k82.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.g = i2;
                            r(0, bArr3);
                            x();
                            u(new k82(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i3 = readInt + 4;
                    k82.a(i3);
                    length = i2 + i3;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                rf2.i("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void i(k82 k82) {
        boolean z2 = k;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + k82);
        }
        k82.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        k82.readFully(bArr);
        k82.readFully(bArr2);
        k82.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        k82.a(i2 - k82.x);
        k82.readFully(bArr4);
        e(new k82(bArr4), i2, 5);
        k82.a(i4 - k82.x);
        k82.y = ByteOrder.BIG_ENDIAN;
        int readInt = k82.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = k82.readUnsignedShort();
            int readUnsignedShort2 = k82.readUnsignedShort();
            if (readUnsignedShort == D.a) {
                short readShort = k82.readShort();
                short readShort2 = k82.readShort();
                l82 c2 = l82.c(readShort, this.e);
                l82 c3 = l82.c(readShort2, this.e);
                HashMap[] hashMapArr = this.c;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c3);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            k82.a(readUnsignedShort2);
        }
    }

    public final void j(o82 o82) {
        o(o82);
        s(o82, 0);
        w(o82, 0);
        w(o82, 5);
        w(o82, 4);
        x();
        if (this.b == 8) {
            HashMap[] hashMapArr = this.c;
            l82 l82 = (l82) hashMapArr[1].get("MakerNote");
            if (l82 != null) {
                o82 o822 = new o82(l82.d);
                o822.y = this.e;
                o822.a(6);
                s(o822, 9);
                l82 l822 = (l82) hashMapArr[9].get("ColorSpace");
                if (l822 != null) {
                    hashMapArr[1].put("ColorSpace", l822);
                }
            }
        }
    }

    public final void k(o82 o82) {
        if (k) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + o82);
        }
        j(o82);
        HashMap[] hashMapArr = this.c;
        l82 l82 = (l82) hashMapArr[0].get("JpgFromRaw");
        if (l82 != null) {
            e(new k82(l82.d), (int) l82.c, 5);
        }
        l82 l822 = (l82) hashMapArr[0].get("ISO");
        l82 l823 = (l82) hashMapArr[1].get("PhotographicSensitivity");
        if (l822 != null && l823 == null) {
            hashMapArr[1].put("PhotographicSensitivity", l822);
        }
    }

    public final void l(k82 k82) {
        if (k) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + k82);
        }
        k82.y = ByteOrder.LITTLE_ENDIAN;
        k82.a(x.length);
        int readInt = k82.readInt() + 8;
        byte[] bArr = y;
        k82.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                k82.readFully(bArr2);
                int readInt2 = k82.readInt();
                int i2 = length + 8;
                if (Arrays.equals(z, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    k82.readFully(bArr3);
                    this.g = i2;
                    r(0, bArr3);
                    u(new k82(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length != readInt) {
                    if (length <= readInt) {
                        k82.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    return;
                }
            } catch (EOFException unused) {
                rf2.i("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void m(k82 k82, HashMap hashMap) {
        l82 l82 = (l82) hashMap.get("JPEGInterchangeFormat");
        l82 l822 = (l82) hashMap.get("JPEGInterchangeFormatLength");
        if (l82 != null && l822 != null) {
            int e2 = l82.e(this.e);
            int e3 = l822.e(this.e);
            if (this.b == 7) {
                e2 += this.h;
            }
            if (e2 > 0 && e3 > 0 && this.a == null) {
                k82.a(e2);
                k82.readFully(new byte[e3]);
            }
            if (k) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e2 + ", length: " + e3);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        l82 l82 = (l82) hashMap.get("ImageLength");
        l82 l822 = (l82) hashMap.get("ImageWidth");
        if (l82 == null || l822 == null) {
            return false;
        }
        int e2 = l82.e(this.e);
        int e3 = l822.e(this.e);
        if (e2 > 512 || e3 > 512) {
            return false;
        }
        return true;
    }

    public final void o(o82 o82) {
        ByteOrder q2 = q(o82);
        this.e = q2;
        o82.y = q2;
        int readUnsignedShort = o82.readUnsignedShort();
        int i2 = this.b;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = o82.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    o82.a(i3);
                    return;
                }
                return;
            }
            rf2.i(hl6.k(readInt, "Invalid first Ifd offset: "));
            return;
        }
        rf2.s("Invalid start code: ", Integer.toHexString(readUnsignedShort));
    }

    public final void p() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.c;
            if (i2 < hashMapArr.length) {
                StringBuilder o2 = pb4.o(i2, "The size of tag group[", "]: ");
                o2.append(hashMapArr[i2].size());
                Log.d("ExifInterface", o2.toString());
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    l82 l82 = (l82) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + l82.toString() + ", tagValue: '" + l82.f(this.e) + "'");
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void r(int i2, byte[] bArr) {
        o82 o82 = new o82(bArr);
        o(o82);
        s(o82, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
    public final void s(o82 o82, int i2) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        HashMap[] hashMapArr2;
        short s2;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        HashSet hashSet2;
        long j4;
        int i3;
        m82 m82;
        long j5;
        int readUnsignedShort;
        int i4;
        String str;
        o82 o822 = o82;
        int i5 = i2;
        int i6 = o822.x;
        int i7 = o822.A;
        Integer valueOf = Integer.valueOf(i6);
        HashSet hashSet3 = this.d;
        hashSet3.add(valueOf);
        short readShort = o822.readShort();
        boolean z4 = k;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readShort);
        }
        if (readShort > 0) {
            short s3 = 0;
            while (true) {
                hashMapArr = this.c;
                if (s3 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = o822.readUnsignedShort();
                int readUnsignedShort3 = o822.readUnsignedShort();
                int readInt = o822.readInt();
                long j6 = ((long) o822.x) + 4;
                short s4 = readShort;
                m82 m822 = (m82) G[i5].get(Integer.valueOf(readUnsignedShort2));
                if (z4) {
                    Integer valueOf2 = Integer.valueOf(i5);
                    z2 = z4;
                    Integer valueOf3 = Integer.valueOf(readUnsignedShort2);
                    s2 = s3;
                    if (m822 != null) {
                        str = m822.b;
                    } else {
                        str = null;
                    }
                    hashMapArr2 = hashMapArr;
                    hashSet = hashSet3;
                    Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", new Object[]{valueOf2, valueOf3, str, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)}));
                } else {
                    hashSet = hashSet3;
                    z2 = z4;
                    s2 = s3;
                    hashMapArr2 = hashMapArr;
                }
                if (m822 != null) {
                    if (readUnsignedShort3 > 0) {
                        int[] iArr = B;
                        if (readUnsignedShort3 < iArr.length) {
                            int i8 = m822.c;
                            if (i8 == 7 || readUnsignedShort3 == 7 || i8 == readUnsignedShort3 || (i4 = m822.d) == readUnsignedShort3 || (((i8 == 4 || i4 == 4) && readUnsignedShort3 == 3) || (((i8 == 9 || i4 == 9) && readUnsignedShort3 == 8) || ((i8 == 12 || i4 == 12) && readUnsignedShort3 == 11)))) {
                                if (readUnsignedShort3 == 7) {
                                    readUnsignedShort3 = i8;
                                }
                                j2 = j6;
                                j3 = ((long) readInt) * ((long) iArr[readUnsignedShort3]);
                                if (j3 < 0 || j3 > 2147483647L) {
                                    if (z2) {
                                        Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                    }
                                    z3 = false;
                                    if (z3) {
                                        o822.k(j2);
                                        hashSet2 = hashSet;
                                    } else {
                                        long j7 = j2;
                                        if (j3 > 4) {
                                            int readInt2 = o822.readInt();
                                            if (z2) {
                                                i3 = readUnsignedShort2;
                                                Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                            } else {
                                                i3 = readUnsignedShort2;
                                            }
                                            if (this.b == 7) {
                                                if ("MakerNote".equals(m822.b)) {
                                                    this.h = readInt2;
                                                } else if (i5 == 6 && "ThumbnailImage".equals(m822.b)) {
                                                    this.i = readInt2;
                                                    this.j = readInt;
                                                    l82 c2 = l82.c(6, this.e);
                                                    j4 = j7;
                                                    l82 a2 = l82.a((long) this.i, this.e);
                                                    m82 = m822;
                                                    l82 a3 = l82.a((long) this.j, this.e);
                                                    hashMapArr2[4].put("Compression", c2);
                                                    hashMapArr2[4].put("JPEGInterchangeFormat", a2);
                                                    hashMapArr2[4].put("JPEGInterchangeFormatLength", a3);
                                                    o822.k((long) readInt2);
                                                }
                                            }
                                            m82 = m822;
                                            j4 = j7;
                                            o822.k((long) readInt2);
                                        } else {
                                            j4 = j7;
                                            i3 = readUnsignedShort2;
                                            m82 = m822;
                                        }
                                        Integer num = (Integer) J.get(Integer.valueOf(i3));
                                        if (z2) {
                                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j3);
                                        }
                                        if (num != null) {
                                            if (readUnsignedShort3 != 3) {
                                                if (readUnsignedShort3 == 4) {
                                                    j5 = ((long) o822.readInt()) & 4294967295L;
                                                } else if (readUnsignedShort3 == 8) {
                                                    readUnsignedShort = o822.readShort();
                                                } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                    readUnsignedShort = o822.readInt();
                                                } else {
                                                    j5 = -1;
                                                }
                                                if (z2) {
                                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", new Object[]{Long.valueOf(j5), m82.b}));
                                                }
                                                if (j5 > 0 || (i7 != -1 && j5 >= ((long) i7))) {
                                                    hashSet2 = hashSet;
                                                    if (z2) {
                                                        String f2 = f21.f(j5, "Skip jump into the IFD since its offset is invalid: ");
                                                        if (i7 != -1) {
                                                            f2 = f2 + " (total length: " + i7 + ")";
                                                        }
                                                        Log.d("ExifInterface", f2);
                                                    }
                                                } else {
                                                    hashSet2 = hashSet;
                                                    if (!hashSet2.contains(Integer.valueOf((int) j5))) {
                                                        o822.k(j5);
                                                        s(o822, num.intValue());
                                                    } else if (z2) {
                                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                                    }
                                                }
                                                o822.k(j4);
                                            } else {
                                                readUnsignedShort = o822.readUnsignedShort();
                                            }
                                            j5 = (long) readUnsignedShort;
                                            if (z2) {
                                            }
                                            if (j5 > 0) {
                                            }
                                            hashSet2 = hashSet;
                                            if (z2) {
                                            }
                                            o822.k(j4);
                                        } else {
                                            hashSet2 = hashSet;
                                            long j8 = j4;
                                            int i9 = o822.x + this.g;
                                            byte[] bArr = new byte[((int) j3)];
                                            o822.readFully(bArr);
                                            l82 l82 = new l82((long) i9, bArr, readUnsignedShort3, readInt);
                                            HashMap hashMap = hashMapArr2[i2];
                                            String str2 = m82.b;
                                            hashMap.put(str2, l82);
                                            if ("DNGVersion".equals(str2)) {
                                                this.b = 3;
                                            }
                                            if ((("Make".equals(str2) || "Model".equals(str2)) && l82.f(this.e).contains("PENTAX")) || ("Compression".equals(str2) && l82.e(this.e) == 65535)) {
                                                this.b = 8;
                                            }
                                            if (((long) o822.x) != j8) {
                                                o822.k(j8);
                                            }
                                        }
                                    }
                                    s3 = (short) (s2 + 1);
                                    i5 = i2;
                                    hashSet3 = hashSet2;
                                    readShort = s4;
                                    z4 = z2;
                                } else {
                                    z3 = true;
                                    if (z3) {
                                    }
                                    s3 = (short) (s2 + 1);
                                    i5 = i2;
                                    hashSet3 = hashSet2;
                                    readShort = s4;
                                    z4 = z2;
                                }
                            } else if (z2) {
                                Log.d("ExifInterface", "Skip the tag entry since data format (" + A[readUnsignedShort3] + ") is unexpected for tag: " + m822.b);
                            }
                        }
                    }
                    j2 = j6;
                    if (z2) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                    j3 = 0;
                    z3 = false;
                    if (z3) {
                    }
                    s3 = (short) (s2 + 1);
                    i5 = i2;
                    hashSet3 = hashSet2;
                    readShort = s4;
                    z4 = z2;
                } else if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                }
                j2 = j6;
                j3 = 0;
                z3 = false;
                if (z3) {
                }
                s3 = (short) (s2 + 1);
                i5 = i2;
                hashSet3 = hashSet2;
                readShort = s4;
                z4 = z2;
            }
            HashSet hashSet4 = hashSet3;
            boolean z5 = z4;
            HashMap[] hashMapArr3 = hashMapArr;
            int readInt3 = o822.readInt();
            if (z5) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", new Object[]{Integer.valueOf(readInt3)}));
            }
            long j9 = (long) readInt3;
            if (j9 > 0) {
                if (!hashSet4.contains(Integer.valueOf(readInt3))) {
                    o822.k(j9);
                    if (hashMapArr3[4].isEmpty()) {
                        s(o822, 4);
                    } else if (hashMapArr3[5].isEmpty()) {
                        s(o822, 5);
                    }
                } else if (z5) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                }
            } else if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
            }
        }
    }

    public final void t(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.c;
        if (!hashMapArr[i2].isEmpty() && hashMapArr[i2].get(str) != null) {
            HashMap hashMap = hashMapArr[i2];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    public final void u(k82 k82) {
        l82 l82;
        int e2;
        k82 k822 = k82;
        HashMap hashMap = this.c[4];
        l82 l822 = (l82) hashMap.get("Compression");
        if (l822 != null) {
            int e3 = l822.e(this.e);
            if (e3 != 1) {
                if (e3 == 6) {
                    m(k822, hashMap);
                    return;
                } else if (e3 != 7) {
                    return;
                }
            }
            l82 l823 = (l82) hashMap.get("BitsPerSample");
            if (l823 != null) {
                int[] iArr = (int[]) l823.g(this.e);
                int[] iArr2 = l;
                if (Arrays.equals(iArr2, iArr) || (this.b == 3 && (l82 = (l82) hashMap.get("PhotometricInterpretation")) != null && (((e2 = l82.e(this.e)) == 1 && Arrays.equals(iArr, m)) || (e2 == 6 && Arrays.equals(iArr, iArr2))))) {
                    l82 l824 = (l82) hashMap.get("StripOffsets");
                    l82 l825 = (l82) hashMap.get("StripByteCounts");
                    if (l824 != null && l825 != null) {
                        long[] Z = bb0.Z(l824.g(this.e));
                        long[] Z2 = bb0.Z(l825.g(this.e));
                        if (Z == null || Z.length == 0) {
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        } else if (Z2 == null || Z2.length == 0) {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        } else if (Z.length != Z2.length) {
                            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                            return;
                        } else {
                            long j2 = 0;
                            for (long j3 : Z2) {
                                j2 += j3;
                            }
                            byte[] bArr = new byte[((int) j2)];
                            this.f = true;
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            while (i2 < Z.length) {
                                int i5 = (int) Z[i2];
                                int i6 = (int) Z2[i2];
                                if (i2 < Z.length - 1 && ((long) (i5 + i6)) != Z[i2 + 1]) {
                                    this.f = false;
                                }
                                int i7 = i5 - i3;
                                if (i7 < 0) {
                                    Log.d("ExifInterface", "Invalid strip offset value");
                                    return;
                                }
                                try {
                                    k822.a(i7);
                                    int i8 = i3 + i7;
                                    byte[] bArr2 = new byte[i6];
                                    try {
                                        k822.readFully(bArr2);
                                        i3 = i8 + i6;
                                        System.arraycopy(bArr2, 0, bArr, i4, i6);
                                        i4 += i6;
                                        i2++;
                                    } catch (EOFException unused) {
                                        Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                                        return;
                                    }
                                } catch (EOFException unused2) {
                                    Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                                    return;
                                }
                            }
                            if (this.f) {
                                long j4 = Z[0];
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (k) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(k822, hashMap);
    }

    public final void v(int i2, int i3) {
        HashMap[] hashMapArr = this.c;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z2 = k;
        if (!isEmpty && !hashMapArr[i3].isEmpty()) {
            l82 l82 = (l82) hashMapArr[i2].get("ImageLength");
            l82 l822 = (l82) hashMapArr[i2].get("ImageWidth");
            l82 l823 = (l82) hashMapArr[i3].get("ImageLength");
            l82 l824 = (l82) hashMapArr[i3].get("ImageWidth");
            if (l82 == null || l822 == null) {
                if (z2) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (l823 != null && l824 != null) {
                int e2 = l82.e(this.e);
                int e3 = l822.e(this.e);
                int e4 = l823.e(this.e);
                int e5 = l824.e(this.e);
                if (e2 < e4 && e3 < e5) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            } else if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(o82 o82, int i2) {
        l82 l82;
        l82 l822;
        HashMap[] hashMapArr = this.c;
        l82 l823 = (l82) hashMapArr[i2].get("DefaultCropSize");
        l82 l824 = (l82) hashMapArr[i2].get("SensorTopBorder");
        l82 l825 = (l82) hashMapArr[i2].get("SensorLeftBorder");
        l82 l826 = (l82) hashMapArr[i2].get("SensorBottomBorder");
        l82 l827 = (l82) hashMapArr[i2].get("SensorRightBorder");
        if (l823 != null) {
            int i3 = l823.a;
            ByteOrder byteOrder = this.e;
            if (i3 == 5) {
                n82[] n82Arr = (n82[]) l823.g(byteOrder);
                if (n82Arr == null || n82Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(n82Arr));
                    return;
                }
                l822 = l82.b(n82Arr[0], this.e);
                l82 = l82.b(n82Arr[1], this.e);
            } else {
                int[] iArr = (int[]) l823.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                l822 = l82.c(iArr[0], this.e);
                l82 = l82.c(iArr[1], this.e);
            }
            hashMapArr[i2].put("ImageWidth", l822);
            hashMapArr[i2].put("ImageLength", l82);
        } else if (l824 == null || l825 == null || l826 == null || l827 == null) {
            l82 l828 = (l82) hashMapArr[i2].get("ImageLength");
            l82 l829 = (l82) hashMapArr[i2].get("ImageWidth");
            if (l828 == null || l829 == null) {
                l82 l8210 = (l82) hashMapArr[i2].get("JPEGInterchangeFormat");
                l82 l8211 = (l82) hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (l8210 != null && l8211 != null) {
                    int e2 = l8210.e(this.e);
                    int e3 = l8210.e(this.e);
                    o82.k((long) e2);
                    byte[] bArr = new byte[e3];
                    o82.readFully(bArr);
                    e(new k82(bArr), e2, i2);
                }
            }
        } else {
            int e4 = l824.e(this.e);
            int e5 = l826.e(this.e);
            int e6 = l827.e(this.e);
            int e7 = l825.e(this.e);
            if (e5 > e4 && e6 > e7) {
                l82 c2 = l82.c(e5 - e4, this.e);
                l82 c3 = l82.c(e6 - e7, this.e);
                hashMapArr[i2].put("ImageLength", c2);
                hashMapArr[i2].put("ImageWidth", c3);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.c;
        l82 l82 = (l82) hashMapArr[1].get("PixelXDimension");
        l82 l822 = (l82) hashMapArr[1].get("PixelYDimension");
        if (!(l82 == null || l822 == null)) {
            hashMapArr[0].put("ImageWidth", l82);
            hashMapArr[0].put("ImageLength", l822);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
