.class public final Low;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq25;


# static fields
.field public static final a:Low;

.field public static final b:Lkc2;

.field public static final c:Lkc2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Low;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Low;->a:Low;

    .line 7
    .line 8
    const-string v0, "clientType"

    .line 9
    .line 10
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Low;->b:Lkc2;

    .line 15
    .line 16
    const-string v0, "androidClientInfo"

    .line 17
    .line 18
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Low;->c:Lkc2;

    .line 23
    .line 24
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ltr0;

    .line 2
    .line 3
    check-cast p2, Lr25;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Lzy;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lsr0;->w:Lsr0;

    .line 12
    .line 13
    sget-object v0, Low;->b:Lkc2;

    .line 14
    .line 15
    invoke-interface {p2, v0, p0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 16
    .line 17
    .line 18
    check-cast p1, Lzy;

    .line 19
    .line 20
    iget-object p0, p1, Lzy;->a:Lwy;

    .line 21
    .line 22
    sget-object p1, Low;->c:Lkc2;

    .line 23
    .line 24
    invoke-interface {p2, p1, p0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 25
    .line 26
    .line 27
    return-void
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
