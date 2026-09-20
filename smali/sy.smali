.class public final Lsy;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq25;


# static fields
.field public static final a:Lsy;

.field public static final b:Lkc2;

.field public static final c:Lkc2;

.field public static final d:Lkc2;

.field public static final e:Lkc2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsy;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsy;->a:Lsy;

    .line 7
    .line 8
    const-string v0, "processName"

    .line 9
    .line 10
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lsy;->b:Lkc2;

    .line 15
    .line 16
    const-string v0, "pid"

    .line 17
    .line 18
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lsy;->c:Lkc2;

    .line 23
    .line 24
    const-string v0, "importance"

    .line 25
    .line 26
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lsy;->d:Lkc2;

    .line 31
    .line 32
    const-string v0, "defaultProcess"

    .line 33
    .line 34
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lsy;->e:Lkc2;

    .line 39
    .line 40
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lep5;

    .line 2
    .line 3
    check-cast p2, Lr25;

    .line 4
    .line 5
    sget-object p0, Lsy;->b:Lkc2;

    .line 6
    .line 7
    iget-object v0, p1, Lep5;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lsy;->c:Lkc2;

    .line 13
    .line 14
    iget v0, p1, Lep5;->b:I

    .line 15
    .line 16
    invoke-interface {p2, p0, v0}, Lr25;->e(Lkc2;I)Lr25;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lsy;->d:Lkc2;

    .line 20
    .line 21
    iget v0, p1, Lep5;->c:I

    .line 22
    .line 23
    invoke-interface {p2, p0, v0}, Lr25;->e(Lkc2;I)Lr25;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lsy;->e:Lkc2;

    .line 27
    .line 28
    iget-boolean p1, p1, Lep5;->d:Z

    .line 29
    .line 30
    invoke-interface {p2, p0, p1}, Lr25;->d(Lkc2;Z)Lr25;

    .line 31
    .line 32
    .line 33
    return-void
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
