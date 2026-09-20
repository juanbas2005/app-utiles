.class public final Ldev/whyoleg/cryptography/serialization/asn1/BitArray;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B-\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0006\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;",
        "",
        "",
        "unusedBits",
        "",
        "byteArray",
        "<init>",
        "(I[B)V",
        "seen0",
        "Lrl6;",
        "serializationConstructorMarker",
        "(II[BLrl6;)V",
        "self",
        "Lhy0;",
        "output",
        "Lll6;",
        "serialDesc",
        "Lvs7;",
        "write$Self$cryptography_serialization_asn1",
        "(Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lhy0;Lll6;)V",
        "write$Self",
        "I",
        "getUnusedBits",
        "()I",
        "[B",
        "getByteArray",
        "()[B",
        "Companion",
        "g90",
        "h90",
        "cryptography-serialization-asn1"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final Companion:Lh90;


# instance fields
.field private final byteArray:[B

.field private final unusedBits:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh90;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->Companion:Lh90;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>(II[BLrl6;)V
    .locals 2

    .line 1
    and-int/lit8 p4, p1, 0x3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    if-ne v1, p4, :cond_4

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p2, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->unusedBits:I

    .line 11
    .line 12
    iput-object p3, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->byteArray:[B

    .line 13
    .line 14
    array-length p0, p3

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "empty array couldn\'t have unused bits"

    .line 21
    .line 22
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    array-length p0, p3

    .line 27
    if-eqz p0, :cond_3

    .line 28
    .line 29
    array-length p0, p3

    .line 30
    add-int/lit8 p0, p0, -0x1

    .line 31
    .line 32
    aget-byte p0, p3, p0

    .line 33
    .line 34
    or-int/lit16 p0, p0, 0x100

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-gt p2, p0, :cond_2

    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :cond_2
    const-string p0, "At least "

    .line 44
    .line 45
    const-string p1, " last bits should be unused"

    .line 46
    .line 47
    invoke-static {p2, p0, p1}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lku4;->g(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_3
    const-string p0, "Array is empty."

    .line 56
    .line 57
    invoke-static {p0}, Lkj6;->i(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_4
    sget-object p0, Lg90;->a:Lg90;

    .line 62
    .line 63
    invoke-virtual {p0}, Lg90;->getDescriptor()Lll6;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, v1, p0}, Lwn6;->x(IILll6;)V

    .line 68
    .line 69
    .line 70
    throw v0
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public constructor <init>(I[B)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput p1, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->unusedBits:I

    .line 73
    iput-object p2, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->byteArray:[B

    .line 74
    array-length p0, p2

    const/4 v0, 0x0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    const-string p0, "empty array couldn\'t have unused bits"

    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1
    array-length p0, p2

    if-eqz p0, :cond_3

    .line 77
    array-length p0, p2

    add-int/lit8 p0, p0, -0x1

    .line 78
    aget-byte p0, p2, p0

    or-int/lit16 p0, p0, 0x100

    .line 79
    invoke-static {p0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p0

    if-gt p1, p0, :cond_2

    :goto_0
    return-void

    :cond_2
    const-string p0, "At least "

    const-string p2, " last bits should be unused"

    .line 80
    invoke-static {p1, p0, p2}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 81
    invoke-static {p0}, Lku4;->g(Ljava/lang/Object;)V

    throw v0

    .line 82
    :cond_3
    const-string p0, "Array is empty."

    invoke-static {p0}, Lkj6;->i(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic write$Self$cryptography_serialization_asn1(Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lhy0;Lll6;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->unusedBits:I

    .line 3
    .line 4
    invoke-interface {p1, v0, v1, p2}, Lhy0;->w(IILll6;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Loe0;->c:Loe0;

    .line 8
    .line 9
    iget-object p0, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->byteArray:[B

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-interface {p1, p2, v1, v0, p0}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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


# virtual methods
.method public final getByteArray()[B
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->byteArray:[B

    .line 2
    .line 3
    return-object p0
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

.method public final getUnusedBits()I
    .locals 0

    .line 1
    iget p0, p0, Ldev/whyoleg/cryptography/serialization/asn1/BitArray;->unusedBits:I

    .line 2
    .line 3
    return p0
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
