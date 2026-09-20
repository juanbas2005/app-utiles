.class public final Lfg5;
.super Lb3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lt93;
.implements Ljava/util/Collection;
.implements Lar3;


# static fields
.field public static final z:Lfg5;


# instance fields
.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;

.field public final y:Lwf5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfg5;

    .line 2
    .line 3
    sget-object v1, Lpe2;->D:Lpe2;

    .line 4
    .line 5
    sget-object v2, Lwf5;->y:Lwf5;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Lfg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf5;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lfg5;->z:Lfg5;

    .line 11
    .line 12
    return-void
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

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfg5;->w:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lfg5;->x:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lfg5;->y:Lwf5;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lfg5;->y:Lwf5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwf5;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method public final f()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfg5;->y:Lwf5;

    .line 2
    .line 3
    iget p0, p0, Lwf5;->x:I

    .line 4
    .line 5
    return p0
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

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lbv2;

    .line 2
    .line 3
    iget-object v1, p0, Lfg5;->w:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lfg5;->y:Lwf5;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lbv2;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
