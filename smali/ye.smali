.class public abstract Lye;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lyy0;

.field public static final b:Lt37;

.field public static final c:Lyy0;

.field public static final d:Lt37;

.field public static final e:Lt37;

.field public static final f:Lt37;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lxe;->y:Lxe;

    .line 2
    .line 3
    new-instance v1, Lyy0;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lyy0;-><init>(Lsr2;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lye;->a:Lyy0;

    .line 9
    .line 10
    sget-object v0, Lxe;->z:Lxe;

    .line 11
    .line 12
    new-instance v1, Lt37;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lhu5;-><init>(Lsr2;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lye;->b:Lt37;

    .line 18
    .line 19
    sget-object v0, Lce;->A:Lce;

    .line 20
    .line 21
    new-instance v1, Lyy0;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lyy0;-><init>(Lvr2;)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Lye;->c:Lyy0;

    .line 27
    .line 28
    sget-object v0, Lxe;->A:Lxe;

    .line 29
    .line 30
    new-instance v1, Lt37;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lhu5;-><init>(Lsr2;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lye;->d:Lt37;

    .line 36
    .line 37
    sget-object v0, Lxe;->B:Lxe;

    .line 38
    .line 39
    new-instance v1, Lt37;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lhu5;-><init>(Lsr2;)V

    .line 42
    .line 43
    .line 44
    sput-object v1, Lye;->e:Lt37;

    .line 45
    .line 46
    sget-object v0, Lxe;->C:Lxe;

    .line 47
    .line 48
    new-instance v1, Lt37;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lhu5;-><init>(Lsr2;)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lye;->f:Lt37;

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CompositionLocal "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not present"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
