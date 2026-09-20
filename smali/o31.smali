.class public final Lo31;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav6;
.implements Lky3;


# instance fields
.field public final w:Ld37;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-wide v0, Lk18;->a:J

    .line 5
    .line 6
    new-instance v2, Lk31;

    .line 7
    .line 8
    invoke-direct {v2, v0, v1}, Lk31;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lo31;->w:Ld37;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final c(Loh4;Lgh4;J)Lmh4;
    .locals 2

    .line 1
    new-instance v0, Lk31;

    .line 2
    .line 3
    invoke-direct {v0, p3, p4}, Lk31;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lo31;->w:Ld37;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v1, v0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p3, p4}, Lgh4;->y(J)Leh5;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget p2, p0, Leh5;->w:I

    .line 20
    .line 21
    iget p3, p0, Leh5;->x:I

    .line 22
    .line 23
    new-instance p4, Lws;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p4, p0, v0}, Lws;-><init>(Leh5;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lb42;->w:Lb42;

    .line 30
    .line 31
    invoke-interface {p1, p2, p3, p0, p4}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
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

.method public final z(Lix5;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lc6;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    iget-object p0, p0, Lo31;->w:Ld37;

    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Lc6;-><init>(Ldi2;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
