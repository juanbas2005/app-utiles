.class public final enum Lje1;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements La25;


# static fields
.field public static final synthetic A:[Lje1;

.field public static final enum x:Lje1;

.field public static final enum y:Lje1;

.field public static final enum z:Lje1;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lje1;

    .line 2
    .line 3
    const-string v1, "COLLECTION_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v2, v1}, Lje1;-><init>(IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lje1;

    .line 10
    .line 11
    const-string v2, "COLLECTION_SDK_NOT_INSTALLED"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v3, v3, v2}, Lje1;-><init>(IILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lje1;->x:Lje1;

    .line 18
    .line 19
    new-instance v2, Lje1;

    .line 20
    .line 21
    const-string v3, "COLLECTION_ENABLED"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v4, v4, v3}, Lje1;-><init>(IILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lje1;->y:Lje1;

    .line 28
    .line 29
    new-instance v3, Lje1;

    .line 30
    .line 31
    const-string v4, "COLLECTION_DISABLED"

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-direct {v3, v5, v5, v4}, Lje1;-><init>(IILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v3, Lje1;->z:Lje1;

    .line 38
    .line 39
    new-instance v4, Lje1;

    .line 40
    .line 41
    const-string v5, "COLLECTION_DISABLED_REMOTE"

    .line 42
    .line 43
    const/4 v6, 0x4

    .line 44
    invoke-direct {v4, v6, v6, v5}, Lje1;-><init>(IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Lje1;

    .line 48
    .line 49
    const-string v6, "COLLECTION_SAMPLED"

    .line 50
    .line 51
    const/4 v7, 0x5

    .line 52
    invoke-direct {v5, v7, v7, v6}, Lje1;-><init>(IILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    filled-new-array/range {v0 .. v5}, [Lje1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lje1;->A:[Lje1;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lje1;->w:I

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

.method public static valueOf(Ljava/lang/String;)Lje1;
    .locals 1

    .line 1
    const-class v0, Lje1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lje1;

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

.method public static values()[Lje1;
    .locals 1

    .line 1
    sget-object v0, Lje1;->A:[Lje1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lje1;

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
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lje1;->w:I

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
