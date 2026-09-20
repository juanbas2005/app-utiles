.class public final Lco1;
.super Li85;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Long;

.field public final c:Lq51;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly53;Lq51;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lco1;->a:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p3, p0, Lco1;->d:Ljava/lang/Object;

    .line 46
    iget-object p1, p1, Ly53;->c:Ldz2;

    .line 47
    const-string p3, "Content-Length"

    invoke-virtual {p1, p3}, Lin8;->E0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lco1;->b:Ljava/lang/Long;

    if-nez p2, :cond_1

    .line 48
    sget-object p1, Ll51;->a:Lq51;

    .line 49
    sget-object p2, Ll51;->e:Lq51;

    .line 50
    :cond_1
    iput-object p2, p0, Lco1;->c:Lq51;

    return-void
.end method

.method public constructor <init>(Lyg5;Lq51;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lco1;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lco1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p1, Lyg5;->w:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ly53;

    .line 12
    .line 13
    iget-object p1, p1, Ly53;->c:Ldz2;

    .line 14
    .line 15
    const-string p3, "Content-Length"

    .line 16
    .line 17
    invoke-virtual {p1, p3}, Lin8;->E0(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    iput-object p1, p0, Lco1;->b:Ljava/lang/Long;

    .line 34
    .line 35
    if-nez p2, :cond_1

    .line 36
    .line 37
    sget-object p1, Ll51;->a:Lq51;

    .line 38
    .line 39
    sget-object p2, Ll51;->e:Lq51;

    .line 40
    .line 41
    :cond_1
    iput-object p2, p0, Lco1;->c:Lq51;

    .line 42
    .line 43
    return-void
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
.method public final a()Ljava/lang/Long;
    .locals 1

    .line 1
    iget v0, p0, Lco1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lco1;->b:Ljava/lang/Long;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lco1;->b:Ljava/lang/Long;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final b()Lq51;
    .locals 1

    .line 1
    iget v0, p0, Lco1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lco1;->c:Lq51;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lco1;->c:Lq51;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d()Lhf0;
    .locals 3

    .line 1
    iget v0, p0, Lco1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lco1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/io/InputStream;

    .line 9
    .line 10
    sget-object v0, Law1;->a:Ldn1;

    .line 11
    .line 12
    sget-object v0, Lcm1;->y:Lcm1;

    .line 13
    .line 14
    sget-object v1, Lne0;->a:Lme0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, Lhw5;

    .line 26
    .line 27
    sget v2, Leo3;->a:I

    .line 28
    .line 29
    new-instance v2, Lxc3;

    .line 30
    .line 31
    invoke-direct {v2, p0}, Lxc3;-><init>(Ljava/io/InputStream;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Lhw5;-><init>(Lxc3;Le81;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_0
    check-cast p0, Lhf0;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
