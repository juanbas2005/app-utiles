.class public final Lrn3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lbq0;


# static fields
.field public static final d:Lhr2;

.field public static final synthetic e:[Lyr3;

.field public static final f:Lup2;

.field public static final g:Luq4;

.field public static final h:Lgq0;


# instance fields
.field public final a:Ltl4;

.field public final b:Lvr2;

.field public final c:Lib4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lrn3;

    .line 4
    .line 5
    const-string v2, "cloneable"

    .line 6
    .line 7
    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lyr3;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, Lrn3;->e:[Lyr3;

    .line 19
    .line 20
    new-instance v0, Lhr2;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, v1}, Lhr2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lrn3;->d:Lhr2;

    .line 27
    .line 28
    sget-object v0, Ln27;->k:Lup2;

    .line 29
    .line 30
    sput-object v0, Lrn3;->f:Lup2;

    .line 31
    .line 32
    sget-object v0, Lm27;->c:Lvp2;

    .line 33
    .line 34
    invoke-virtual {v0}, Lvp2;->g()Luq4;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sput-object v1, Lrn3;->g:Luq4;

    .line 39
    .line 40
    invoke-virtual {v0}, Lvp2;->i()Lup2;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lgq0;

    .line 45
    .line 46
    invoke-virtual {v0}, Lup2;->b()Lup2;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v0, v0, Lup2;->a:Lvp2;

    .line 51
    .line 52
    invoke-virtual {v0}, Lvp2;->g()Luq4;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v1, v2, v0}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Lrn3;->h:Lgq0;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method

.method public constructor <init>(Lkb4;Ltl4;)V
    .locals 2

    .line 1
    sget-object v0, Lv61;->a0:Lv61;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lrn3;->a:Ltl4;

    .line 7
    .line 8
    iput-object v0, p0, Lrn3;->b:Lvr2;

    .line 9
    .line 10
    new-instance p2, Lp3;

    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {p2, p0, v1, p1, v0}, Lp3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lib4;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lrn3;->c:Lib4;

    .line 24
    .line 25
    return-void
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


# virtual methods
.method public final a(Lgq0;)Lql4;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrn3;->h:Lgq0;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lgq0;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Lrn3;->e:[Lyr3;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iget-object p0, p0, Lrn3;->c:Lib4;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcq0;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return-object p0
    .line 28
    .line 29
.end method

.method public final b(Lup2;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrn3;->f:Lup2;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lup2;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Lrn3;->e:[Lyr3;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iget-object p0, p0, Lrn3;->c:Lib4;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcq0;

    .line 24
    .line 25
    invoke-static {p0}, Lwn6;->w(Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/Collection;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lg42;->w:Lg42;

    .line 33
    .line 34
    return-object p0
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

.method public final c(Lup2;Luq4;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lrn3;->g:Luq4;

    .line 8
    .line 9
    invoke-virtual {p2, p0}, Luq4;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lrn3;->f:Lup2;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lup2;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
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
