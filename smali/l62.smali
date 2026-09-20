.class public final enum Ll62;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final enum A:Ll62;

.field public static final enum B:Ll62;

.field public static final enum C:Ll62;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ll62;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum D:Ll62;

.field public static final enum E:Ll62;

.field public static final enum F:Ll62;

.field public static final enum G:Ll62;

.field public static final enum H:Ll62;

.field public static final enum I:Ll62;

.field public static final synthetic J:[Ll62;

.field public static final enum x:Ll62;

.field public static final enum y:Ll62;

.field public static final enum z:Ll62;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ll62;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x9

    .line 5
    .line 6
    const-string v3, "NOT_SUPPORTED_ERR"

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Ll62;-><init>(IILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ll62;->x:Ll62;

    .line 12
    .line 13
    new-instance v1, Ll62;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/16 v4, 0xb

    .line 17
    .line 18
    const-string v5, "INVALID_STATE_ERR"

    .line 19
    .line 20
    invoke-direct {v1, v3, v4, v5}, Ll62;-><init>(IILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Ll62;->y:Ll62;

    .line 24
    .line 25
    move v3, v2

    .line 26
    new-instance v2, Ll62;

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    const/16 v6, 0x12

    .line 30
    .line 31
    const-string v7, "SECURITY_ERR"

    .line 32
    .line 33
    invoke-direct {v2, v5, v6, v7}, Ll62;-><init>(IILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Ll62;->z:Ll62;

    .line 37
    .line 38
    move v5, v3

    .line 39
    new-instance v3, Ll62;

    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    const/16 v7, 0x13

    .line 43
    .line 44
    const-string v8, "NETWORK_ERR"

    .line 45
    .line 46
    invoke-direct {v3, v6, v7, v8}, Ll62;-><init>(IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v3, Ll62;->A:Ll62;

    .line 50
    .line 51
    move v6, v4

    .line 52
    new-instance v4, Ll62;

    .line 53
    .line 54
    const/4 v7, 0x4

    .line 55
    const/16 v8, 0x14

    .line 56
    .line 57
    const-string v9, "ABORT_ERR"

    .line 58
    .line 59
    invoke-direct {v4, v7, v8, v9}, Ll62;-><init>(IILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v4, Ll62;->B:Ll62;

    .line 63
    .line 64
    move v7, v5

    .line 65
    new-instance v5, Ll62;

    .line 66
    .line 67
    const/4 v8, 0x5

    .line 68
    const/16 v9, 0x17

    .line 69
    .line 70
    const-string v10, "TIMEOUT_ERR"

    .line 71
    .line 72
    invoke-direct {v5, v8, v9, v10}, Ll62;-><init>(IILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v5, Ll62;->C:Ll62;

    .line 76
    .line 77
    move v8, v6

    .line 78
    new-instance v6, Ll62;

    .line 79
    .line 80
    const/4 v9, 0x6

    .line 81
    const/16 v10, 0x1b

    .line 82
    .line 83
    const-string v11, "ENCODING_ERR"

    .line 84
    .line 85
    invoke-direct {v6, v9, v10, v11}, Ll62;-><init>(IILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sput-object v6, Ll62;->D:Ll62;

    .line 89
    .line 90
    move v9, v7

    .line 91
    new-instance v7, Ll62;

    .line 92
    .line 93
    const/4 v10, 0x7

    .line 94
    const/16 v11, 0x1c

    .line 95
    .line 96
    const-string v12, "UNKNOWN_ERR"

    .line 97
    .line 98
    invoke-direct {v7, v10, v11, v12}, Ll62;-><init>(IILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sput-object v7, Ll62;->E:Ll62;

    .line 102
    .line 103
    move v10, v8

    .line 104
    new-instance v8, Ll62;

    .line 105
    .line 106
    const/16 v11, 0x8

    .line 107
    .line 108
    const/16 v12, 0x1d

    .line 109
    .line 110
    const-string v13, "CONSTRAINT_ERR"

    .line 111
    .line 112
    invoke-direct {v8, v11, v12, v13}, Ll62;-><init>(IILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sput-object v8, Ll62;->F:Ll62;

    .line 116
    .line 117
    move v11, v9

    .line 118
    new-instance v9, Ll62;

    .line 119
    .line 120
    const-string v12, "DATA_ERR"

    .line 121
    .line 122
    const/16 v13, 0x1e

    .line 123
    .line 124
    invoke-direct {v9, v11, v13, v12}, Ll62;-><init>(IILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sput-object v9, Ll62;->G:Ll62;

    .line 128
    .line 129
    move v11, v10

    .line 130
    new-instance v10, Ll62;

    .line 131
    .line 132
    const/16 v12, 0xa

    .line 133
    .line 134
    const/16 v13, 0x23

    .line 135
    .line 136
    const-string v14, "NOT_ALLOWED_ERR"

    .line 137
    .line 138
    invoke-direct {v10, v12, v13, v14}, Ll62;-><init>(IILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sput-object v10, Ll62;->H:Ll62;

    .line 142
    .line 143
    move v12, v11

    .line 144
    new-instance v11, Ll62;

    .line 145
    .line 146
    const-string v13, "ATTESTATION_NOT_PRIVATE_ERR"

    .line 147
    .line 148
    const/16 v14, 0x24

    .line 149
    .line 150
    invoke-direct {v11, v12, v14, v13}, Ll62;-><init>(IILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sput-object v11, Ll62;->I:Ll62;

    .line 154
    .line 155
    filled-new-array/range {v0 .. v11}, [Ll62;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Ll62;->J:[Ll62;

    .line 160
    .line 161
    new-instance v0, Lg39;

    .line 162
    .line 163
    const/16 v1, 0x13

    .line 164
    .line 165
    invoke-direct {v0, v1}, Lg39;-><init>(I)V

    .line 166
    .line 167
    .line 168
    sput-object v0, Ll62;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 169
    .line 170
    return-void
    .line 171
    .line 172
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Ll62;->w:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method

.method public static a(I)Ll62;
    .locals 5

    .line 1
    invoke-static {}, Ll62;->values()[Ll62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Ll62;->w:I

    .line 12
    .line 13
    if-ne p0, v4, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/ErrorCode$UnsupportedErrorCodeException;

    .line 20
    .line 21
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 22
    .line 23
    const-string v1, "Error code "

    .line 24
    .line 25
    const-string v2, " is not supported"

    .line 26
    .line 27
    invoke-static {p0, v1, v2}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static valueOf(Ljava/lang/String;)Ll62;
    .locals 1

    .line 1
    const-class v0, Ll62;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll62;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static values()[Ll62;
    .locals 1

    .line 1
    sget-object v0, Ll62;->J:[Ll62;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ll62;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ll62;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p0, p0, Ll62;->w:I

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
