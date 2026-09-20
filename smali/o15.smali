.class public abstract Lo15;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lpy2;

.field public static final b:Lpy2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lpy2;

    .line 2
    .line 3
    const-string v1, "NULL"

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v0, v1, v2}, Lpy2;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lo15;->a:Lpy2;

    .line 10
    .line 11
    new-instance v0, Lpy2;

    .line 12
    .line 13
    const-string v1, "UNINITIALIZED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lpy2;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lo15;->b:Lpy2;

    .line 19
    .line 20
    return-void
    .line 21
.end method
