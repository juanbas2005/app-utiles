.class public final Ls50;
.super Lu50;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final d:[C


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, Lr50;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [C

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    const-string v2, "base16()"

    .line 11
    .line 12
    invoke-direct {v0, v2, v1}, Lr50;-><init>(Ljava/lang/String;[C)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p0, v0, v2}, Lu50;-><init>(Lr50;Ljava/lang/Character;)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x200

    .line 20
    .line 21
    new-array v0, v0, [C

    .line 22
    .line 23
    iput-object v0, p0, Ls50;->d:[C

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    :goto_0
    const/16 v2, 0x100

    .line 27
    .line 28
    if-ge v0, v2, :cond_0

    .line 29
    .line 30
    iget-object v2, p0, Ls50;->d:[C

    .line 31
    .line 32
    ushr-int/lit8 v3, v0, 0x4

    .line 33
    .line 34
    aget-char v3, v1, v3

    .line 35
    .line 36
    aput-char v3, v2, v0

    .line 37
    .line 38
    or-int/lit16 v3, v0, 0x100

    .line 39
    .line 40
    and-int/lit8 v4, v0, 0xf

    .line 41
    .line 42
    aget-char v4, v1, v4

    .line 43
    .line 44
    aput-char v4, v2, v3

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
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
.end method


# virtual methods
.method public final c(Ljava/lang/StringBuilder;[BI)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {v1, p3, v0}, Lg75;->n(III)V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge v1, p3, :cond_0

    .line 7
    .line 8
    aget-byte v0, p2, v1

    .line 9
    .line 10
    and-int/lit16 v0, v0, 0xff

    .line 11
    .line 12
    iget-object v2, p0, Ls50;->d:[C

    .line 13
    .line 14
    aget-char v3, v2, v0

    .line 15
    .line 16
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 17
    .line 18
    .line 19
    or-int/lit16 v0, v0, 0x100

    .line 20
    .line 21
    aget-char v0, v2, v0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
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
