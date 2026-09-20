.class public final synthetic Ljr8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:Lqt0;

.field public final synthetic x:Lbr7;

.field public final synthetic y:Lfw0;


# direct methods
.method public synthetic constructor <init>(Lqt0;Lbr7;Lfw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljr8;->w:Lqt0;

    .line 5
    .line 6
    iput-object p2, p0, Ljr8;->x:Lbr7;

    .line 7
    .line 8
    iput-object p3, p0, Ljr8;->y:Lfw0;

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
.method public final synthetic H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p2, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    and-int/lit8 v0, p2, 0x1

    .line 8
    .line 9
    and-int/lit8 p2, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq p2, v1, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    :goto_0
    move-object v5, p1

    .line 18
    check-cast v5, Lyt2;

    .line 19
    .line 20
    sget-object p1, Llr8;->a:Lt37;

    .line 21
    .line 22
    invoke-virtual {v5, v0, p2}, Lyt2;->V(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object v4, p0, Ljr8;->y:Lfw0;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    iget-object v1, p0, Ljr8;->w:Lqt0;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iget-object v3, p0, Ljr8;->x:Lbr7;

    .line 35
    .line 36
    invoke-static/range {v1 .. v6}, Lch4;->c(Lqt0;Lgr6;Lbr7;Lfw0;Lyt2;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v5}, Lyt2;->Y()V

    .line 41
    .line 42
    .line 43
    :goto_1
    sget-object p0, Lvs7;->a:Lvs7;

    .line 44
    .line 45
    return-object p0
    .line 46
    .line 47
.end method
