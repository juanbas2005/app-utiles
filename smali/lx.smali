.class public final Llx;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq25;


# static fields
.field public static final a:Llx;

.field public static final b:Lkc2;

.field public static final c:Lkc2;

.field public static final d:Lkc2;

.field public static final e:Lkc2;

.field public static final f:Lkc2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llx;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llx;->a:Llx;

    .line 7
    .line 8
    const-string v0, "type"

    .line 9
    .line 10
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Llx;->b:Lkc2;

    .line 15
    .line 16
    const-string v0, "reason"

    .line 17
    .line 18
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Llx;->c:Lkc2;

    .line 23
    .line 24
    const-string v0, "frames"

    .line 25
    .line 26
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Llx;->d:Lkc2;

    .line 31
    .line 32
    const-string v0, "causedBy"

    .line 33
    .line 34
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Llx;->e:Lkc2;

    .line 39
    .line 40
    const-string v0, "overflowCount"

    .line 41
    .line 42
    invoke-static {v0}, Lkc2;->a(Ljava/lang/String;)Lkc2;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Llx;->f:Lkc2;

    .line 47
    .line 48
    return-void
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
    check-cast p1, Lba1;

    .line 2
    .line 3
    check-cast p2, Lr25;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Lvz;

    .line 7
    .line 8
    iget-object p0, p0, Lvz;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, Llx;->b:Lkc2;

    .line 11
    .line 12
    invoke-interface {p2, v0, p0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 13
    .line 14
    .line 15
    check-cast p1, Lvz;

    .line 16
    .line 17
    iget-object p0, p1, Lvz;->b:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v0, Llx;->c:Lkc2;

    .line 20
    .line 21
    invoke-interface {p2, v0, p0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 22
    .line 23
    .line 24
    sget-object p0, Llx;->d:Lkc2;

    .line 25
    .line 26
    iget-object v0, p1, Lvz;->c:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 29
    .line 30
    .line 31
    sget-object p0, Llx;->e:Lkc2;

    .line 32
    .line 33
    iget-object v0, p1, Lvz;->d:Lba1;

    .line 34
    .line 35
    invoke-interface {p2, p0, v0}, Lr25;->a(Lkc2;Ljava/lang/Object;)Lr25;

    .line 36
    .line 37
    .line 38
    sget-object p0, Llx;->f:Lkc2;

    .line 39
    .line 40
    iget p1, p1, Lvz;->e:I

    .line 41
    .line 42
    invoke-interface {p2, p0, p1}, Lr25;->e(Lkc2;I)Lr25;

    .line 43
    .line 44
    .line 45
    return-void
    .line 46
    .line 47
.end method
