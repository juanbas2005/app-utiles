.class public final synthetic Lpx8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfs8;
.implements Le12;


# static fields
.field public static final synthetic x:Lpx8;

.field public static final synthetic y:Lpx8;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpx8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lpx8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lpx8;->x:Lpx8;

    .line 8
    .line 9
    new-instance v0, Lpx8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lpx8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lpx8;->y:Lpx8;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lpx8;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lpx8;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 7
    .line 8
    sget-object p0, Lap8;->x:Lap8;

    .line 9
    .line 10
    iget-object p0, p0, Lap8;->w:La87;

    .line 11
    .line 12
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lbp8;

    .line 15
    .line 16
    sget-object p0, Lbp8;->a:Lg79;

    .line 17
    .line 18
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 26
    .line 27
    sget-object p0, Lwo8;->x:Lwo8;

    .line 28
    .line 29
    invoke-virtual {p0}, Lwo8;->b()Lxo8;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lxo8;->a:Lk68;

    .line 33
    .line 34
    const/4 v0, 0x6

    .line 35
    const/4 v1, 0x1

    .line 36
    const-string v2, "measurement.rb.attribution.service"

    .line 37
    .line 38
    invoke-virtual {p0, v0, v2, v1}, Lk68;->n(ILjava/lang/String;Z)Lt79;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/Boolean;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Lc12;)Ld12;
    .locals 1

    .line 1
    new-instance p0, Ld12;

    .line 2
    .line 3
    invoke-direct {p0}, Ld12;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3, p1, p2}, Lc12;->f(Landroid/content/Context;Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Ld12;->a:I

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    iput p1, p0, Ld12;->c:I

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    invoke-interface {p3, p1, p2, v0}, Lc12;->b(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Ld12;->b:I

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iput v0, p0, Ld12;->c:I

    .line 28
    .line 29
    :cond_1
    return-object p0
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
