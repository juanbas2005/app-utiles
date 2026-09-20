.class public final enum Lel4;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final enum A:Lel4;

.field public static final synthetic B:[Lel4;

.field public static final synthetic C:Lw52;

.field public static final enum x:Lel4;

.field public static final enum y:Lel4;

.field public static final enum z:Lel4;


# instance fields
.field public final w:Lsg2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lel4;

    .line 2
    .line 3
    const-string v1, "FINAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v2, v1}, Lel4;-><init>(IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lel4;->x:Lel4;

    .line 10
    .line 11
    new-instance v1, Lel4;

    .line 12
    .line 13
    const-string v2, "OPEN"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v3, v3, v2}, Lel4;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lel4;->y:Lel4;

    .line 20
    .line 21
    new-instance v2, Lel4;

    .line 22
    .line 23
    const-string v3, "ABSTRACT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v4, v4, v3}, Lel4;-><init>(IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lel4;->z:Lel4;

    .line 30
    .line 31
    new-instance v3, Lel4;

    .line 32
    .line 33
    const-string v4, "SEALED"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v5, v5, v4}, Lel4;-><init>(IILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lel4;->A:Lel4;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lel4;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lel4;->B:[Lel4;

    .line 46
    .line 47
    new-instance v1, Lw52;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Lw52;-><init>([Ljava/lang/Enum;)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lel4;->C:Lw52;

    .line 53
    .line 54
    return-void
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

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lsg2;

    .line 5
    .line 6
    sget-object p3, Lwg2;->e:Lug2;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p3, p2}, Lsg2;-><init>(Lvg2;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lel4;->w:Lsg2;

    .line 15
    .line 16
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lel4;
    .locals 1

    .line 1
    const-class v0, Lel4;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lel4;

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

.method public static values()[Lel4;
    .locals 1

    .line 1
    sget-object v0, Lel4;->B:[Lel4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lel4;

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
