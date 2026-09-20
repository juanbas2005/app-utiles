.class public final Lld;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lv10;


# instance fields
.field public final a:Lje;

.field public final b:Lc20;

.field public final c:Landroid/view/autofill/AutofillId;


# direct methods
.method public constructor <init>(Lje;Lc20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lld;->a:Lje;

    .line 5
    .line 6
    iput-object p2, p0, Lld;->b:Lc20;

    .line 7
    .line 8
    invoke-static {p1}, Lr4;->j(Lje;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Li75;->e(Landroid/view/View;)La20;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, La20;->w:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p1}, Lz10;->c(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iput-object p1, p0, Lld;->c:Landroid/view/autofill/AutofillId;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const-string p0, "Required value was null."

    .line 31
    .line 32
    invoke-static {p0}, Lb81;->t(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
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
