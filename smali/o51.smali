.class public abstract Lo51;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lq51;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lq51;

    .line 2
    .line 3
    const-string v1, "multipart"

    .line 4
    .line 5
    const-string v2, "*"

    .line 6
    .line 7
    sget-object v3, La42;->w:La42;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lq51;

    .line 13
    .line 14
    const-string v2, "mixed"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lq51;

    .line 20
    .line 21
    const-string v2, "alternative"

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lq51;

    .line 27
    .line 28
    const-string v2, "related"

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lq51;

    .line 34
    .line 35
    const-string v2, "form-data"

    .line 36
    .line 37
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lo51;->a:Lq51;

    .line 41
    .line 42
    new-instance v0, Lq51;

    .line 43
    .line 44
    const-string v2, "signed"

    .line 45
    .line 46
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lq51;

    .line 50
    .line 51
    const-string v2, "encrypted"

    .line 52
    .line 53
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lq51;

    .line 57
    .line 58
    const-string v2, "byteranges"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2, v3}, Lq51;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
